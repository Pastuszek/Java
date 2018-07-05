/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integration_layer_ejb;

import BusinessLayer.Entity.ReaderPerson;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Pawel
 */
@Stateless
public class ReaderPersonFacade extends AbstractFacade<ReaderPerson> implements ReaderPersonFacadeLocal {

    @PersistenceContext(unitName = "Library_EE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReaderPersonFacade() {
        super(ReaderPerson.class);
    }
    
}
