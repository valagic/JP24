/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.jp24.vjezbanjemapiranje.nasljedivanje;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author valagic
 */
@MappedSuperclass
public class Klub {
    
    @Id
    private long id;
    private String naziv;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    
    
}
