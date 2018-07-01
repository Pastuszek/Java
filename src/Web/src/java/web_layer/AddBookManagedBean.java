/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web_layer;

import Buissnes_Layer.Books_Facade_Remote;
import BusinessLayer.DTO.BookDTO;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Pawel
 */
@Named(value = "addBooksManaged")
@RequestScoped
public class AddBookManagedBean implements Serializable {

    @EJB
    private Books_Facade_Remote books_Facade;
    
    private String name;
    private String ISBN;
    private String description;
    private String cover;

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void zapisz(){
        BookDTO dto = new BookDTO(
                0L, // TOD konstruktor bez longa!
                this.name,
                this.description,
                this.ISBN,
                this.cover);
        
        this.books_Facade.AddBook(dto);
    }
}