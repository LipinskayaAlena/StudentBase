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
@Table(name="time_of_pair")
public class Time_of_pair implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_time_of_pair", nullable = false)
    private Long id_time_of_pair;

    @Column(name = "time", nullable = false)
    private String time;

    public Long getId_time_of_pair() { return this.id_time_of_pair; }
    public void setId_time_of_pair(Long id_time_of_pair) { this.id_time_of_pair = id_time_of_pair; }

    public String getTime() { return this.time; }
    public void setTime(String time) { this.time = time; }
}
