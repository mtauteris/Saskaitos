package lt.vtvpmc.ems.pw.models;

import lt.vtvpmc.ems.pw.entities.Item;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Minde on 2017.04.30.
 */
@Component
@Scope("session")
public class ItemModel {
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
