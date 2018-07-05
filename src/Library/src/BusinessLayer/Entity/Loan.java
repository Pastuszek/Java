/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer.Entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Pawel
 */
@Entity
public class Loan extends BaseEntity {

    private Date From;
    private Date To;
    @OneToOne
    private ReaderPerson ReaderPerson;

    public Book getBook() {
        return Book;
    }

    public void setBook(Book book) {
        this.Book = book;
    }
    @OneToMany
    private Book Book;
    private Boolean IsReturned;

    public Boolean getIsReturned() {
        return this.From.after(this.To);
    }

    public Date getFrom() {
        return From;
    }

    public void setFrom(Date From) {
        this.From = From;
    }

    public Date getTo() {
        return To;
    }

    public void setTo(Date To) {
        this.To = To;
    }

    public ReaderPerson getReaderPerson() {
        return ReaderPerson;
    }

    public void setReaderPerson(ReaderPerson ReaderPerson) {
        this.ReaderPerson = ReaderPerson;
    }

    public Loan() {
    }

    public Loan(Date from, Date to, ReaderPerson person, Book book) {
        this.From = from;
        this.To = to;
        this.ReaderPerson = person;
        this.Book = book;
    }
}
