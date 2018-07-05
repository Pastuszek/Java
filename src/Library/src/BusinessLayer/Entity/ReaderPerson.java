/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer.Entity;

import javax.persistence.Entity;

/**
 *
 * @author Pawel
 */
@Entity
public class ReaderPerson extends BaseEntity {

    private String FirstName;
    private String LastName;

    public ReaderPerson() {
    }

    public ReaderPerson(String firstName, String lastName) {
        this.FirstName = firstName;
        this.LastName = lastName;
    }
}
