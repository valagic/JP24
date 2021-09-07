/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.jp24.vjezbanjemapiranje.visenapremajedan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author valagic
 */
@Entity
public class Stanovnik {
    
    @Id
    private Long id;
    private String ime;
    private String prezime;
    
    @ManyToOne
    private Opcina opcina;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Opcina getOpcina() {
        return opcina;
    }

    public void setOpcina(Opcina opcina) {
        this.opcina = opcina;
    }
    
    
    
}
