/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.jp24.zadacamapiranjeedunovajp24baze;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author valagic
 */
@Entity
    public class Smjer extends Entitet{
    
    @Id
    private Long sifra;
    
    @Column(nullable = false)
    private String naziv;
    
    @Column(nullable = false)
    private Integer trajanje;
    
    private BigDecimal cijena;
    
    private Boolean certifikat;

   

    public void setSifra(Long sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(Integer trajanje) {
        this.trajanje = trajanje;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public Boolean getCertifikat() {
        return certifikat;
    }

    public void setCertifikat(Boolean certifikat) {
        this.certifikat = certifikat;
    }
    
    
    
}
