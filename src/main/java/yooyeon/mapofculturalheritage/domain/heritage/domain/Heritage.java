package yooyeon.mapofculturalheritage.domain.heritage.domain;

import lombok.Getter;
import yooyeon.mapofculturalheritage.model.BaseTimeEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
public class Heritage extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name ="cultural_heritage_id")
    private Long id;
    private String name;
}
