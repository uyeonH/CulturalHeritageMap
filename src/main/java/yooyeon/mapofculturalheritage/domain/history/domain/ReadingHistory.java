package yooyeon.mapofculturalheritage.domain.history.domain;

import lombok.Getter;
import yooyeon.mapofculturalheritage.model.BaseTimeEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
public class ReadingHistory extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name ="reading_history_id")
    private Long id;
}
