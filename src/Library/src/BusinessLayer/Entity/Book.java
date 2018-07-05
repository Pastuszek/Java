package BusinessLayer.Entity;

import javax.persistence.Entity;
import javax.persistence.Lob;

/**
 *
 * @author Pawel
 */
@Entity
public class Book extends BaseEntity {

    private String description;

    private String ISBN;

    private String ImgUrl;
    private String name;
    
    private Boolean IsLoan;

    public Boolean getIsLoan() {
        return IsLoan;
    }

    public void setIsLoan(Boolean IsLoan) {
        this.IsLoan = IsLoan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book() {
    }

    public Book(String name, String description, String ISBN, String ImgUrl, Boolean isLoan) {
        this.description = description;
        this.ISBN = ISBN;
        this.ImgUrl = ImgUrl;
        this.name = name;
        this.IsLoan = isLoan;
    }

}
