package lt.vtvpmc.ems.pw.ui;

import lt.vtvpmc.ems.pw.entities.Invoice;
import lt.vtvpmc.ems.pw.models.InvoiceModel;
import lt.vtvpmc.ems.pw.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by JP16_2 on 2017.04.28.
 */
@Controller
@Scope("request")
public class InvoiceList {
    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private InvoiceModel invoiceModel;

    public List<Invoice> findAll(){
        return invoiceRepository.findAll();
    }

    public Invoice findCurrent(){
        return invoiceModel.getCurrentInvoice();
    }

}
