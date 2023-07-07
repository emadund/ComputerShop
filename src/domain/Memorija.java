/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.math.BigDecimal;

/**
 *
 * @author Cartman
 */
public class Memorija extends AbstractKomponenta{

    private int kapacitet;
    private double radniTakt;

    public Memorija(String naziv, BigDecimal prodajnaCena, String dobavljac, int kapacitet, double radniTakt) {
        super(naziv, prodajnaCena, dobavljac);
        this.kapacitet = kapacitet;
        this.radniTakt = radniTakt;
    }
    
    
    
    @Override
    public String getSpecifikacija() {
        return "Kapacitet: "+kapacitet+"Gb, Radni takt: "+radniTakt+"GHz";
    }
    
}
