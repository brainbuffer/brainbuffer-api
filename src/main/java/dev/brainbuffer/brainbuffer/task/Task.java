package dev.brainbuffer.brainbuffer.task;

import javax.persistence.*;
import java.time.Duration;
import java.util.Date;

@Entity(name = "BB_TASK")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String UserId; //тут должен быть тип юзера а не стринг

    @Column
    private String Name;

    @Column
    private String Description;

    @Column
    private Date createdAt;

    @Column
    private Duration duration;



    public Long getId() {
        return id;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
