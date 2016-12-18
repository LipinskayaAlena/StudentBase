package by.bsu.famcs.lipinskaya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Asus on 18.12.2016.
 */
@Entity
@Table(name="day_of_week")
public class DayOfWeek implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_day_of_week", nullable = false)
    private Long id_day_of_week;

    @Column(name = "name", nullable = false)
    private String name;

    public Long getId_day_of_week() { return this.id_day_of_week; }
    public void setId_day_of_week(Long id_day_of_week) { this.id_day_of_week = id_day_of_week; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
}
