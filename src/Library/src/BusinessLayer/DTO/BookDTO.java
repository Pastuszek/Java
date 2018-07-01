package BusinessLayer.DTO;

import java.io.Serializable;

/**
 *
 * @author Pawel
 */
public class BookDTO implements Serializable {

    public BookDTO(Long id,String name, String description, String ISBN, String CoverLink) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ISBN = ISBN;
        this.CoverLink = CoverLink;
    }

    private String name;

    private String description;

    public Long getId() {
        return id;
    }

    private String ISBN;

    private String CoverLink;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCoverLink() {
        return CoverLink;
    }

    public void setCoverLink(String CoverLink) {
        this.CoverLink = CoverLink;
    }

    public BookDTO(Long Id) {
        this.id = Id;
    }

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

}
