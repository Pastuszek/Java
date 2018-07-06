package web_layer;

import Buissnes_Layer.Books_Facade_Remote;
import BusinessLayer.DTO.BookDTO;
import BusinessLayer.DTO.BookListFilterDTO;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author pmozola
 */
@Named(value = "bookListManaged")
@SessionScoped
public class BoooksLIstManagedBean implements Serializable {

    @EJB
    private Books_Facade_Remote booksFacade;
    
    private List<BookDTO> bookList;
    private Integer filterValue;

    public Integer getFilterValue() {
        return filterValue;
    }

    public void setFilterValue(Integer filterValue) {
        this.filterValue = filterValue;
    }
    
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
      
      public void Filter(){
          BookListFilterDTO filter;
          if (this.filterValue == 3) {
              filter = BookListFilterDTO.Avabile;
          }else if(this.filterValue == 2){
              filter = BookListFilterDTO.Loan;
          }else{
              
              filter = BookListFilterDTO.All;
          }
          this.bookList = this.booksFacade.GetBooks(filter);
      }

    @PostConstruct
    public void init() {
        this.bookList = this.booksFacade.GetAllBooks();
    }
}
