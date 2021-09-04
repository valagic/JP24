/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.jp24.vjezbanjemapiranje.osnovno;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author valagic
 */
@Entity
public class Auto {
    
    @Id
    private Long id;
    private String model;
    private String boja;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }
    
    
    
}
