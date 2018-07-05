/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web_layer;

import Buissnes_Layer.Books_Facade_Remote;
import BusinessLayer.DTO.BookDTO;
import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Pawel
 */
@Named(value = "bookManaged")
@SessionScoped
public class BookManagedBean implements Serializable {

    @EJB
    private Books_Facade_Remote books_Facade;
    private String description;
    private String name;
    private String imgPath;
    private String isbn;
    private Long bookId;
    private Boolean isLoan;

    public Boolean getIsLoan() {
        return isLoan;
    }

    public void setIsLoan(Boolean isLoan) {
        this.isLoan = isLoan;
    }

    public BookManagedBean() {
        String id = FacesContext
                .getCurrentInstance()
                .getExternalContext()
                .getRequestParameterMap()
                .get("id");

        this.bookId = Long.parseLong(id);
    }

    @PostConstruct
    public void init() {
        BookDTO bookDTO = this.books_Facade.GetBook(this.bookId);

        this.description = bookDTO.getDescription();
        this.name = bookDTO.getName();
        this.imgPath = bookDTO.getCoverLink();
        this.isbn = bookDTO.getISBN();
        this.isLoan = bookDTO.getLoan();
    }

    public Books_Facade_Remote getBooks_Facade() {
        return books_Facade;
    }

    public void setBooks_Facade(Books_Facade_Remote books_Facade) {
        this.books_Facade = books_Facade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public void Loan() throws IOException {
        this.books_Facade.Loan(this.bookId);
        this.isLoan = true;
       this.Redirect();
    }

    public void ReturnBack() throws IOException {
        this.books_Facade.ReturnBack(bookId);
        this.isLoan = false;
         this.Redirect();
    }
    
    private void Redirect()throws IOException{
         ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        context.redirect(context.getRequestContextPath() + "/faces/booklist.xhtml");
    }
}
