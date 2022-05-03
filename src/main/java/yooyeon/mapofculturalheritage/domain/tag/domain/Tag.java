package yooyeon.mapofculturalheritage.domain.tag.domain;

import lombok.Getter;
import yooyeon.mapofculturalheritage.model.BaseTimeEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
public class Tag extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "tag_id")
    private Long id;
}
