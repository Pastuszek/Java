/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integration_layer_ejb;

import BusinessLayer.DTO.BookDTO;
import BusinessLayer.Entity.Book;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Pawel
 */
@Stateless
public class BookFacade extends AbstractFacade<Book> implements BookFacadeLocal {

    @PersistenceContext(unitName = "Library_EE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookFacade() {
        super(Book.class);
    }

    private String loanBookQueryString() {
        return "SELECT c FROM Book as c where c.IsLoan = :loan";
    }

    @Override
    public List<Book> GetAvabileBook() {
        Query query = em.createQuery(
                "SELECT c FROM Book as c where c.IsLoan = 0",
               Book.class );

        return (List<Book>) query
                .getResultList();
    }

    @Override
    public List<Book> GetLoanBook() {
        Query query = em.createQuery(
                "SELECT c FROM Book as c where c.IsLoan = 1",
                Book.class);

        return (List<Book>) query
                .getResultList();
    }
}
