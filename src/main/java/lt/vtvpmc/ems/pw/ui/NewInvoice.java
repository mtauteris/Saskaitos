package lt.vtvpmc.ems.pw.ui;

import lt.vtvpmc.ems.pw.entities.Invoice;
import lt.vtvpmc.ems.pw.models.InvoiceModel;
import lt.vtvpmc.ems.pw.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * Created by JP16_2 on 2017.04.28.
 */
@Controller
@Scope("request")
public class NewInvoice {

    public static final String NAV_SHOW_INVOICE ="invoiceView";
    public static final String NAV_SHOW_MAIN = "main";

    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private InvoiceModel invoiceModel;

    public String save(){
        invoiceRepository.save(invoiceModel.getNewInvoice());
        invoiceModel.setNewInvoice(new Invoice());
        return NAV_SHOW_MAIN;
    }

    public String review(Invoice invoice){
        invoiceModel.setCurrentInvoice(invoice);
        return NAV_SHOW_INVOICE;
    }

    public String edit(){
        invoiceRepository.save(invoiceModel.getCurrentInvoice());
        return NAV_SHOW_INVOICE;
    }


}
