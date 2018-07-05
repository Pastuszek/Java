/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer.DTO;

import BusinessLayer.Entity.ReaderPerson;
import java.util.Date;
import javax.persistence.OneToOne;

/**
 *
 * @author Pawel
 */
public class LoanDTO {
    private Date From;

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

    public Boolean getIsReturned() {
        return IsReturned;
    }

    public void setIsReturned(Boolean IsReturned) {
        this.IsReturned = IsReturned;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    private Date To;
    private ReaderPerson ReaderPerson;
    private Boolean IsReturned;
    private long id;

     public LoanDTO(long id, Date from, Date to, ReaderPerson person) {
        this.From = from;
        this.To = to;
        this.ReaderPerson = person;
        this.id = id;
    }
}
