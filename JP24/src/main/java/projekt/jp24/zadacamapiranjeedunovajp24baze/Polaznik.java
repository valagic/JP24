/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.jp24.zadacamapiranjeedunovajp24baze;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 *
 * @author valagic
 */
@Entity
    public class Polaznik{
    
    @Id
    private Long sifra;
 
    @ManyToOne
    private Osoba osoba;
    
    private Integer brojUgovora;

    public Long getSifra() {
        return sifra;
    }

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
