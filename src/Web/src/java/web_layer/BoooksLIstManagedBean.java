package web_layer;

import Buissnes_Layer.Books_Facade_Remote;
import BusinessLayer.DTO.BookDTO;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author pmozola
 */
@Named(value = "bookListManaged")
@RequestScoped
public class BoooksLIstManagedBean implements Serializable {

    @EJB
    private Books_Facade_Remote booksFacade;
    
    private List<BookDTO> bookList;

    public Books_Facade_Remote getBooksFacade() {
        return booksFacade;
    }

    public void setBooksFacade(Books_Facade_Remote booksFacade) {
        this.booksFacade = booksFacade;
    }

    public List<BookDTO> getBookList() {
        return bookList;
    }

    public void setBookList(List<BookDTO> bookList) {
        this.bookList = bookList;
    }
    
      public String navigateToDetails() {
        return "/faces/bookdetails";
    }

    @PostConstruct
    public void init() {
        this.bookList = this.booksFacade.GetAllBooks();
    }
}
