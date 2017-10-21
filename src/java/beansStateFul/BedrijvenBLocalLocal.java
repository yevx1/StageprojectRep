/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beansStateFul;

import DAL.Bedrijven;
import javax.ejb.Local;

/**
 *
 * @author yvex
 */
@Local
public interface BedrijvenBLocalLocal {
    
   
    void userRegister(Bedrijven incBedrijf) ;

    public void setBedrijf(Bedrijven bedrijf);

    public Bedrijven getBedrijf();
    
}
