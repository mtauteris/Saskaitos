package lt.vtvpmc.ems.pw.ui;

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
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private ItemModel itemModel;

    public void save(){
        itemRepository.save(itemModel.getItem());
    }
}
