package yooyeon.mapofculturalheritage.domain.heritage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yooyeon.mapofculturalheritage.domain.heritage.domain.Heritage;

import java.util.List;

public interface HeritageRepository extends JpaRepository<Heritage, Long>, HeritageRepositoryCustom {
    List<Heritage> findByName(String name);
}
