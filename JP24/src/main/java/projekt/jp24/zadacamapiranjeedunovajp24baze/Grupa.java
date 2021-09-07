/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.jp24.zadacamapiranjeedunovajp24baze;

import com.sun.istack.NotNull;
import java.util.Date;
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
public class Grupa{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sifra;
    
    @Column(nullable = false)
    private String naziv;
 
    private Date datumPocetka;
    
    @ManyToOne
    @NotNull
    @JoinColumn(name = "smjer")
    private Smjer smjer;
    
    @ManyToOne
    @JoinColumn(name = "predavac")
    private Predavac predavac;

    public Long getSifra() {
        return sifra;
    }

    public void setSifra(Long sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }

  
    
}
