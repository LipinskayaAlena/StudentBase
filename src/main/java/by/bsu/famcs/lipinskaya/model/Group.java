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
@Table(name="group")
public class Group implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_group", nullable = false)
    private Long id_group;

    @Column(name = "speciality", nullable = false)
    private String speciality;

    @Column(name = "number", nullable = false)
    private Long number;


    public Long getId_group() { return this.id_group; }

    public void setId_group(Long id_group) { this.id_group = id_group; }

    public String getSpeciality() { return this.speciality; }

    public void setSpeciality(String speciality) { this.speciality = speciality; }

    public Long getNumber() { return this.number; }

    public void setNumber(Long number) { this.number = number; }
}
