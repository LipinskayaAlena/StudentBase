package by.bsu.famcs.lipinskaya.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Asus on 13.12.2016.
 */
@Entity
@Table(name="subject")
public class Subject implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_subject", nullable = false)
    private Long id_subject;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_course")
    private Course course;

    public Long getId_subject() { return this.id_subject; }
    public void setId_subject(Long id_subject) { this.id_subject = id_subject; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }

}
