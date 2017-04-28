package lt.vtvpmc.ems.pw.models;

import lt.vtvpmc.ems.pw.entities.Invoice;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by JP16_2 on 2017.04.28.
 */
@Component
@Scope("session")
public class InvoiceModel {

    private Invoice newInvoice;
    private Invoice currentInvoice;

    @PostConstruct
    public void init(){
        newInvoice = new Invoice();
    }

    public Invoice getNewInvoice() {
        return newInvoice;
    }

    public void setNewInvoice(Invoice newInvoice) {
        this.newInvoice = newInvoice;
    }

    public Invoice getCurrentInvoice() {
        return currentInvoice;
    }

    public void setCurrentInvoice(Invoice currentInvoice) {
        this.currentInvoice = currentInvoice;
    }
}
