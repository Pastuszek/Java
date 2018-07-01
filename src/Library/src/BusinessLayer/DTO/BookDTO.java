package BusinessLayer.DTO;

import java.io.Serializable;

/**
 *
 * @author Pawel
 */
public class BookDTO implements Serializable {
    
    public BookDTO(Long Id){
        this.id = Id;
    }
    
    public BookDTO(){}
    
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }
}