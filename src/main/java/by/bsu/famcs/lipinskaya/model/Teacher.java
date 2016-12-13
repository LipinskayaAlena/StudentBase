package by.bsu.famcs.lipinskaya.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Asus on 13.12.2016.
 */
@Entity
@Table(name="teacher")
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_teacher", nullable = false)
    private Long id_teacher;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_faculty")
    private Faculty faculty;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name="teacher_subject", joinColumns = {
        @JoinColumn(name="id_teacher", nullable=false)},
            inverseJoinColumns = {@JoinColumn(name="id_subject", nullable=false)})
    private Set<Subject> subjects;

    public Long getId_teacher() { return this.id_teacher; }
    public void setId_teacher(Long id_teacher) { this.id_teacher = id_teacher; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public Faculty getFaculty() {
        return faculty;
    }
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }


    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }
}
