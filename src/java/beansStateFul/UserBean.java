/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beansStateFul;

import DAL.Bedrijven;
import javax.ejb.Stateful;

/**
 *
 * @author yvex
 */
@Stateful
public class UserBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    
    private Bedrijven user;
//    private Integer id;
//     private String naam;
//     private String userId;
//     private String paswoord;
//     private String email;

    public UserBean() {
        user = new Bedrijven();
    }

    public Bedrijven getUser() {
        return user;
    }

    public void setUser(Bedrijven user) {
        this.user = user;
    }
     
     
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getNaam() {
//        return naam;
//    }
//
//    public void setNaam(String naam) {
//        this.naam = naam;
//    }
//
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
//    public String getPaswoord() {
//        return paswoord;
//    }
//
//    public void setPaswoord(String paswoord) {
//        this.paswoord = paswoord;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

    
    public void userRegister(Bedrijven incUser) {
        this.setUser(incUser);
//        this.setId(user.getId());
//        this.setNaam(user.getNaam());
//        this.setUserId(user.getUserId());
//        this.setPaswoord(user.getPaswoord());
//        this.setEmail(user.getEmail());
    }

 
    public void userRegister() {
       
    }
     
     
}
