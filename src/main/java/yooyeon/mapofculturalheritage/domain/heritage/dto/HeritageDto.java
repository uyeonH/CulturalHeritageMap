package yooyeon.mapofculturalheritage.domain.heritage.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
public class HeritageDto {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @QueryProjection
    public HeritageDto(Long id, String name) {
        this.id=id;
        this.name = name;
    }
}
