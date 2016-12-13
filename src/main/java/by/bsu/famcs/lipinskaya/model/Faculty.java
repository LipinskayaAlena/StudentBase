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
@Table(name="faculty")
public class Faculty implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_faculty", nullable = false)
    private long id_faculty;

    @Column(name = "name", nullable = false)
    private String name;

    public long getId_faculty() { return this.id_faculty; }

    public void setId_faculty(long id_faculty) { this.id_faculty = id_faculty; }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

}
