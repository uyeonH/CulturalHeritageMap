package yooyeon.mapofculturalheritage.domain.heritage.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import yooyeon.mapofculturalheritage.domain.heritage.domain.Heritage;

@Getter
@NoArgsConstructor
public class HeritageResponse {
    private Long id;

    public HeritageResponse(Heritage entity) {
        this.id = entity.getId();
    }
}
