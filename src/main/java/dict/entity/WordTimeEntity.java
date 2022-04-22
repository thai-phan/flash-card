package dict.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "word_time")
public class WordTimeEntity implements Persistable<String> {
    @Id
    private String id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "word_id")
    private Integer wordId;

    @Column(name = "acknowledge_time")
    private LocalDateTime acknowledgeTime;

    @Column(name = "review_time")
    private LocalDateTime reviewTime;

    @Column(name = "is_unforgettable")
    private Boolean isUnforgettable;

    @Transient
    private boolean update;

    public void setUpdate(boolean update) {
        this.update = update;
    }

    @Override
    public boolean isNew() {
        return !this.update;
    }

    @PrePersist
    @PostLoad
    void markUpdated() {
        this.update = true;
    }

}
