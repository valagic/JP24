/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.jp24.zadacamapiranjeedunovajp24baze;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 *
 * @author valagic
 */
@Entity
    public class Polaznik extends Entitet{
    
    @Id
    private Long sifra;
 
    @ManyToOne
    @NotNull
    @JoinColumn(name = "osoba")
    private Osoba osoba;
    
    private Integer brojUgovora;

    

    public void setSifra(Long sifra) {
        this.sifra = sifra;
    }

    public Integer getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(Integer brojUgovora) {
        this.brojUgovora = brojUgovora;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }
    
    
    
    
}
