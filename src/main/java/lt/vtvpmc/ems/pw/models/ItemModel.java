package lt.vtvpmc.ems.pw.models;

import lt.vtvpmc.ems.pw.entities.Item;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Minde on 2017.04.30.
 */
@Component
@Scope("session")
public class ItemModel {
    private Item item;
    private Item newItem;


    @PostConstruct
    public void init(){
        newItem = new Item();
    }

    public Item getNewItem() {
        return newItem;
    }

    public void setNewItem(Item newItem) {
        this.newItem = newItem;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
