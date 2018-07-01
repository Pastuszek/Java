package BusinessLayer.Entity;

import javax.persistence.Entity;
import javax.persistence.Lob;

/**
 *
 * @author Pawel
 */
@Entity
public class Book extends BaseEntity {

    private String name;
    
    @Lob
    private String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
