package com.jwebcoder.springdatajpa.repository;

import com.jwebcoder.springdatajpa.dto.JpaTestDto;
import com.jwebcoder.springdatajpa.entity.JpaTest;
import org.apache.commons.lang.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.Predicate;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class JpaTestNoRepositoryBeanImpl<T> extends SimpleJpaRepository<T, Long> implements JpaTestNoRepositoryBean<T> {


    /**
     * Creates a new {@link JpaTestNoRepositoryBean} for the given {@link JpaEntityInformation} and {@link EntityManager}.
     *
     * @param entityInformation must not be {@literal null}.
     * @param entityManager     must not be {@literal null}.
     */
    public JpaTestNoRepositoryBeanImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }


    @Override
    public List<T> query(JpaTestDto jpaTestDto) {

        String title = jpaTestDto.getTitle();
        int column4 = jpaTestDto.getColumn4();
        String messageText = jpaTestDto.getMessageText();
        Date dateSende = jpaTestDto.getDateSend();

        List<Predicate> predicates = new ArrayList<>();

        Specification<JpaTest> specification = (root, query, cb) -> {

            if (StringUtils.isNotBlank(title)) {
                predicates.add(cb.lessThan(root.get("title").as(String.class), title));
            }

            if (column4 != 0) {
                predicates.add(cb.greaterThanOrEqualTo(root.get("column4").as(int.class), column4));
            }

            if (StringUtils.isNotBlank(messageText)) {
                predicates.add(cb.like(root.get("messageText").as(String.class), "%" + messageText + "%"));
            }

            if (dateSende != null) {
                predicates.add(cb.greaterThanOrEqualTo(root.get("dateSende").as(Date.class), dateSende));
            }

            query.where(predicates.toArray(new Predicate[predicates.size()]));
            return query.getRestriction();
        };

        Sort sort = new Sort(Sort.Direction.DESC, "dateSende");
        Pageable pageable = new PageRequest(0, 2,sort);
        Page<T> result = findAll((Specification<T>) specification,pageable);
        return result.getContent();
    }
}
