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
public  class Clan {
    
    @Id
    private Long id;
    @ManyToOne
    private Grupa grupa;
    
    @ManyToOne
    private Polaznik polaznik;

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }

    public Polaznik getPolaznik() {
        return polaznik;
    }

    public void setPolaznik(Polaznik polaznik) {
        this.polaznik = polaznik;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
