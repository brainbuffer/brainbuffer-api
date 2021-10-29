package dev.brainbuffer.brainbuffer.appointment;

import dev.brainbuffer.brainbuffer.task.Task;

import javax.persistence.*;
import java.time.Duration;
import java.util.Date;

@Entity(name = "BB_APPOINTMENT")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Task task;

    @Column
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column
    private Date time;

    @Column
    private Date createdAt;

    @Column
    private Duration durationOffset;



    public Long getId() {
        return id;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Duration getDurationOffset() {
        return durationOffset;
    }

    public void setDurationOffset(Duration durationOffset) {
        this.durationOffset = durationOffset;
    }
}
