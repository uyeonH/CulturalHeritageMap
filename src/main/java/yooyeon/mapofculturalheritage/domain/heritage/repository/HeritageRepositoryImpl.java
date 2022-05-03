package yooyeon.mapofculturalheritage.domain.heritage.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import yooyeon.mapofculturalheritage.domain.heritage.condition.HeritageSearchCondition;
import yooyeon.mapofculturalheritage.domain.heritage.dto.HeritageDto;
import yooyeon.mapofculturalheritage.domain.heritage.dto.QCulturalHeritageDto;

import javax.persistence.EntityManager;
import java.util.List;

import static yooyeon.mapofculturalheritage.domain.heritage.domain.QCulturalHeritage.culturalHeritage;

public class HeritageRepositoryImpl implements HeritageRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    public HeritageRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<HeritageDto> findByName(HeritageSearchCondition condition) {
        return queryFactory.select(new QCulturalHeritageDto(culturalHeritage.id, culturalHeritage.name))
                .from(culturalHeritage).fetch();

    }
}
