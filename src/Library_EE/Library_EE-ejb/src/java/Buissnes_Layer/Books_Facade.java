/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buissnes_Layer;

import BusinessLayer.DTO.BookDTO;
import BusinessLayer.Entity.Book;
import Integration_layer_ejb.BookFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Pawel
 */
@Stateless
public class Books_Facade implements Books_Facade_Remote {

    @EJB
    private BookFacadeLocal bookDatabaseFacade;



    @Override
    public void AddBook(BookDTO book) {

        this.bookDatabaseFacade.create(
                new Book(
                        book.getName(),
                        book.getDescription(),
                        book.getISBN(),
                        book.getCoverLink()
                )
        );

    }
}
