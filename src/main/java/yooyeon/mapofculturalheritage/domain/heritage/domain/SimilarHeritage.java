package yooyeon.mapofculturalheritage.domain.heritage.domain;

import lombok.Getter;
import yooyeon.mapofculturalheritage.model.BaseTimeEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
public class SimilarHeritage extends BaseTimeEntity {
    @Id @GeneratedValue
    @Column(name ="similar_cultural_heritage_id")
    private Long id;
}
