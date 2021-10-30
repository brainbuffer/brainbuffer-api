package dev.brainbuffer.brainbuffer.task;

import dev.brainbuffer.brainbuffer.entity.EntityBase;

import javax.persistence.*;
import java.time.Duration;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tasks")
public class Task extends EntityBase {
    @Column(name = "user_id")
    private String userId; //тут должен быть тип юзера а не стринг

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "duration")
    private Duration duration;

    public Task() {
    }

    public Task(String userId, String name, String description, Duration duration) {
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.duration = duration;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Task task = (Task) o;
        return Objects.equals(userId, task.userId) && Objects.equals(name, task.name) && Objects.equals(description, task.description) && Objects.equals(duration, task.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), userId, name, description, duration);
    }
}
