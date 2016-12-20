package by.bsu.famcs.lipinskaya.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Asus on 12.12.2016.
 */
@Entity
@Table(name="student")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_student", nullable = false)
    private Long id_student;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_faculty")
    private Faculty faculty;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_course")
    private Course course;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_group")
    private Group fk_group;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name="student_debts", joinColumns = {
            @JoinColumn(name="id_student", nullable=false)},
            inverseJoinColumns = {@JoinColumn(name="id_debts", nullable=false)})
    private Set<Debts> debts;

    public Long getId_student() { return this.id_student; }

    public void setId_student(Long id_student) { this.id_student = id_student; }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return  this.email; }

    public void setEmail(String email) { this.email = email; }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Faculty getFaculty() {
        return faculty;
    }
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }


    public Set<Debts> getDebts() {
        return debts;
    }
    public void setDebts(Set<Debts> debts) {
        this.debts = debts;
    }

    public Group getGroup() {
        return fk_group;
    }
    public void setGroup(Group fk_group) {
        this.fk_group = fk_group;
    }
}
