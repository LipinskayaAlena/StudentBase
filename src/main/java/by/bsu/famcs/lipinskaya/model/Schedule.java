package by.bsu.famcs.lipinskaya.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Asus on 18.12.2016.
 */
@Entity
@Table(name="schedule_stud")
public class Schedule implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_schedule", nullable = false)
    private Long id_schedule;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_day_of_week")
    private Day_of_week fk_day_of_week;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_subject")
    private Subject fk_subject;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_group")
    private Group fk_group;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_time_of_pair")
    private Time_of_pair fk_time_of_pair;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_course")
    private Course course;


    public Long getId_schedule() {
        return id_schedule;
    }
    public void setId_schedule(Long id_schedule) {
        this.id_schedule = id_schedule;
    }

    public Day_of_week getFk_day_of_week() {
        return fk_day_of_week;
    }
    public void setFk_day_of_week(Day_of_week fk_day_of_week) {
        this.fk_day_of_week = fk_day_of_week;
    }

    public Subject getFk_subject() {
        return fk_subject;
    }
    public void setFk_subject(Subject fk_subject) {
        this.fk_subject = fk_subject;
    }

    public Group getGroup() {
        return fk_group;
    }
    public void setGroup(Group fk_group) {
        this.fk_group = fk_group;
    }

    public Time_of_pair getFk_time_of_pair() {
        return fk_time_of_pair;
    }
    public void setFk_time_of_pair(Time_of_pair fk_time_of_pair) {
        this.fk_time_of_pair = fk_time_of_pair;
    }

    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }


}
