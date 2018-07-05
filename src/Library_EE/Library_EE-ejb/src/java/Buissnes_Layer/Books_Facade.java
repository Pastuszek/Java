/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buissnes_Layer;

import BusinessLayer.DTO.BookDTO;
import BusinessLayer.Entity.Book;
import Integration_layer_ejb.BookFacadeLocal;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
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
                        book.getCoverLink(),
                        book.getLoan()
                )
        );

    }

    @Override
    public List<BookDTO> GetAllBooks() {

        List<Book> books = this.bookDatabaseFacade.findAll();
        List<BookDTO> resultList = new ArrayList<>();

        for (Book book : books) {
            BookDTO dto = new BookDTO(book.getId(), book.getName(), book.getDescription(), book.getISBN(), book.getImgUrl(), book.getIsLoan());
            resultList.add(dto);
        }

        return resultList;
    }

    @Override
    public BookDTO GetBook(Long bookId) {
        Book bookEntity = bookDatabaseFacade.find(bookId);

        return new BookDTO(
                bookEntity.getId(),
                bookEntity.getName(),
                bookEntity.getDescription(),
                bookEntity.getISBN(),
                bookEntity.getImgUrl(),
                bookEntity.getIsLoan()
        );
    }

    @Override
    public void Loan(Long bookId) {
       Book book = this.bookDatabaseFacade.find(bookId);
       book.setIsLoan(Boolean.TRUE);
       this.bookDatabaseFacade.edit(book);
    }

    @Override
    public void ReturnBack(Long bookId) {
       Book book = this.bookDatabaseFacade.find(bookId);
       book.setIsLoan(Boolean.FALSE);
       this.bookDatabaseFacade.edit(book);
    }
}