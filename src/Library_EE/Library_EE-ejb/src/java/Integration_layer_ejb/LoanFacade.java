/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integration_layer_ejb;

import BusinessLayer.Entity.Loan;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Pawel
 */
@Stateless
public class LoanFacade extends AbstractFacade<Loan> implements LoanFacadeLocal {

    @PersistenceContext(unitName = "Library_EE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LoanFacade() {
        super(Loan.class);
    }
    
}
