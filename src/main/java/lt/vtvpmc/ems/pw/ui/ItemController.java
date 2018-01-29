package lt.vtvpmc.ems.pw.ui;

import lt.vtvpmc.ems.pw.entities.Item;
import lt.vtvpmc.ems.pw.models.InvoiceModel;
import lt.vtvpmc.ems.pw.models.ItemModel;
import lt.vtvpmc.ems.pw.repositories.InvoiceRepository;
import lt.vtvpmc.ems.pw.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by Minde on 2017.04.30.
 */
@Controller
@Scope("request")
public class ItemController {

    public static final String NAV_SHOW_INVOICE ="invoiceView";
    public static final String NAV_SHOW_MAIN = "main";
    public static final String NAV_SHOW_ADD_ITEM = "addItemPage";

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private ItemModel itemModel;
    @Autowired
    private InvoiceModel invoiceModel;

    public String save(){
        invoiceModel.getCurrentInvoice();
        itemRepository.save(itemModel.getNewItem());
        return NAV_SHOW_INVOICE;
    }

}
