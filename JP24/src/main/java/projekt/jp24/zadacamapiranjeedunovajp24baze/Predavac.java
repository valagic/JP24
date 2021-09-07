/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.jp24.zadacamapiranjeedunovajp24baze;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 *
 * @author valagic
 */
@Entity
    public class Predavac extends Entitet{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sifra;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "osoba")
    private Osoba osoba;
    
    private Integer iban;

    

    public void setSifra(Long sifra) {
        this.sifra = sifra;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public Integer getIban() {
        return iban;
    }

    public void setIban(Integer iban) {
        this.iban = iban;
    }

}
