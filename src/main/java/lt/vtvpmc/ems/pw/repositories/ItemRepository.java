package lt.vtvpmc.ems.pw.repositories;

import lt.vtvpmc.ems.pw.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Minde on 2017.04.30.
 */
public interface ItemRepository extends JpaRepository<Item, Long> {
}
