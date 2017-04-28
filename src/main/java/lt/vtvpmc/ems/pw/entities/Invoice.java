package lt.vtvpmc.ems.pw.entities;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

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

    public Invoice() {
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
