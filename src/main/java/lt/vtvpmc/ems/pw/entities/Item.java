package lt.vtvpmc.ems.pw.entities;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Minde on 2017.04.30.
 */
@Entity
public class Item implements Serializable{
    private static final long serialVersionUID = 5L;

    @Id
    @GeneratedValue
    private long id;
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String price;
    @ManyToOne(optional = true, cascade = {CascadeType.ALL})
    private Invoice invoice;

    public Item() {
    }

    public Item(Invoice invoice) {
        this.invoice = invoice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
