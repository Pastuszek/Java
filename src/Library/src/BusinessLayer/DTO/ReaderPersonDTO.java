/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer.DTO;

/**
 *
 * @author Pawel
 */
public class ReaderPersonDTO {
    private String FirstName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    private String LastName;
    private Long id;

 
    public ReaderPersonDTO(Long id, String firstName, String lastName) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.id = id;
    }
}
