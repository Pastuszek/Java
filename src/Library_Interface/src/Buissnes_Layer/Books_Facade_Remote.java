/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buissnes_Layer;

import BusinessLayer.DTO.BookDTO;
import javax.ejb.Remote;

/**
 *
 * @author Pawel
 */
@Remote
public interface Books_Facade_Remote {
    void AddBook(BookDTO book);
}
