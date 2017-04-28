package lt.vtvpmc.ems.pw.repositories;

import lt.vtvpmc.ems.pw.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by JP16_2 on 2017.04.28.
 */
public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

}
