/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integration_layer_ejb;

import BusinessLayer.Entity.ReaderPerson;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Pawel
 */
@Local
public interface ReaderPersonFacadeLocal {

    void create(ReaderPerson readerPerson);

    void edit(ReaderPerson readerPerson);

    void remove(ReaderPerson readerPerson);

    ReaderPerson find(Object id);

    List<ReaderPerson> findAll();

    List<ReaderPerson> findRange(int[] range);

    int count();
    
}
