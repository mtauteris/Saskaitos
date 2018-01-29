package lt.vtvpmc.ems.pw.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by JP16_2 on 2017.04.28.
 */
@Entity
public class Invoice implements Serializable{
    private static final long serialVersionUID = 5089035398648855772L;
    @Id
    @GeneratedValue
    private long id;
    @NotNull
    @NotBlank
    private String writtenBy;
    @NotNull
    @NotBlank
    private String receiver;
    @Temporal(TemporalType.DATE)
    private Date date;
    @OneToMany( mappedBy = "invoice", fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<Item> items;

    public Invoice() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWrittenBy() {
        return writtenBy;
    }

    public void setWrittenBy(String writtenBy) {
        this.writtenBy = writtenBy;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
