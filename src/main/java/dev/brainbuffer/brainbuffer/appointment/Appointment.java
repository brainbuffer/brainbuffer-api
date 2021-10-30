package dev.brainbuffer.brainbuffer.appointment;

import dev.brainbuffer.brainbuffer.entity.EntityBase;
import dev.brainbuffer.brainbuffer.task.Task;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "appointments")
public class Appointment extends EntityBase {
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private AppointmentStatus status;

    @Column(name = "time")
    private LocalDateTime time;

    @Column(name = "duration_offset")
    private Duration durationOffset;

    public Appointment() {
        super();
    }

    public Appointment(Task task, AppointmentStatus status, LocalDateTime time, Duration durationOffset) {
        super();
        this.task = task;
        this.status = status;
        this.time = time;
        this.durationOffset = durationOffset;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Duration getDurationOffset() {
        return durationOffset;
    }

    public void setDurationOffset(Duration durationOffset) {
        this.durationOffset = durationOffset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(task, that.task) && status == that.status && Objects.equals(time, that.time) && Objects.equals(durationOffset, that.durationOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), task, status, time, durationOffset);
    }
}
