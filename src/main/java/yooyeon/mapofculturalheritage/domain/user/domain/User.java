package yooyeon.mapofculturalheritage.domain.user.domain;

import lombok.Getter;
import yooyeon.mapofculturalheritage.model.BaseTimeEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;
}
