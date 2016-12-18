package by.bsu.famcs.lipinskaya.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Asus on 12.12.2016.
 */
@Entity
@Table(name="student")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_student", nullable = false)
    private String id_student;

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_debts")
    private Debts fk_debts;

    public String getId_student() { return this.id_student; }

    public void setId_student(String id_student) { this.id_student = id_student; }

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

    public Debts getDebts() {
        return fk_debts;
    }
    public void setDebts(Debts fk_debts) {
        this.fk_debts = fk_debts;
    }

    public Group getGroup() {
        return fk_group;
    }
    public void setGroup(Group fk_group) {
        this.fk_group = fk_group;
    }
}
