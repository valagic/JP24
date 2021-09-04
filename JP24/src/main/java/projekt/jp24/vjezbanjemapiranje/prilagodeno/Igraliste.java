/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.jp24.vjezbanjemapiranje.prilagodeno;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author valagic
 */

@Entity(name = "igraonica")
public class Igraliste {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int brojDjece;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBrojDjece() {
        return brojDjece;
    }

    public void setBrojDjece(int brojDjece) {
        this.brojDjece = brojDjece;
    }
    
    
    
}
