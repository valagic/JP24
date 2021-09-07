/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.jp24.zadacamapiranjeedunovajp24baze;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author valagic
 */
@Entity
    public  class Osoba extends Entitet{
    
    @Id
    private Long sifra;
    
    @Column(nullable = false)
    private String ime;
    @Column(nullable = false)
    private String prezime;
    
    @Column(columnDefinition = "char(11)")
    private Integer oib;
    
    private String email;

    

    public void setSifra(Long sifra) {
        this.sifra = sifra;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Integer getOib() {
        return oib;
    }

    public void setOib(Integer oib) {
        this.oib = oib;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
