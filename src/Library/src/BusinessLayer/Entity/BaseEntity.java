package BusinessLayer.Entity;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Pawel
 */
@MappedSuperclass
public class BaseEntity  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        
        if (id == 0) {
            return new Long(0);
        }
        
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}