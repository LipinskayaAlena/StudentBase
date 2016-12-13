package by.bsu.famcs.lipinskaya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Asus on 13.12.2016.
 */
@Entity
@Table(name="course")
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_course", nullable = false)
    private Long id_course;

    public Long getId_course() { return this.id_course; }

    public void setId_course(Long id_course) { this.id_course = id_course; }


}
