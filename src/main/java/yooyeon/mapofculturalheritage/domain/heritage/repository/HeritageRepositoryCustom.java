package yooyeon.mapofculturalheritage.domain.heritage.repository;

import yooyeon.mapofculturalheritage.domain.heritage.condition.HeritageSearchCondition;
import yooyeon.mapofculturalheritage.domain.heritage.dto.HeritageDto;

import java.util.List;

public interface HeritageRepositoryCustom {
    List<HeritageDto> findByName(HeritageSearchCondition condition);

}
