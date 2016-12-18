package by.bsu.famcs.lipinskaya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Asus on 14.12.2016.
 */
@Entity
@Table(name="debts")
public class Debts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_debts", nullable = false)
    private Long id_debts;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price", nullable = false)
    private Float price;


    public Long getId_debts() { return this.id_debts; }
    public void setId_debts(Long id_debts) { this.id_debts = id_debts; }

    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public Float getPrice() { return this.price; }
    public void setPrice(Float price) { this.price = price; }
}
