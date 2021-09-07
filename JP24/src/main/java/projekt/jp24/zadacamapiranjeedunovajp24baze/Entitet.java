/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.jp24.zadacamapiranjeedunovajp24baze;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author valagic
 */
@MappedSuperclass
public abstract class Entitet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long sifra;

    public long getSifra() {
        return sifra;
    }

    public void setSifra(long sifra) {
        this.sifra = sifra;
    }
    
    
}
