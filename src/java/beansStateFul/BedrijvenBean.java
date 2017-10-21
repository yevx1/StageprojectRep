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
public class BedrijvenBean {

    
 private Bedrijven bedrijf;
 
 public BedrijvenBean() {
        bedrijf = new Bedrijven();
    }

   
 
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public Bedrijven getBedrijf() {
        return bedrijf;
    }

    public void setBedrijf(Bedrijven bedrijf) {
        this.bedrijf = bedrijf;
    }
    
    public void userRegister(Bedrijven incBedrijf) {
        
        this.setBedrijf(incBedrijf);
    }

    
}
