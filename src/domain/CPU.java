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
public class CPU extends AbstractKomponenta{//implements Komponenta{

    //private String naziv;
    //private BigDecimal prodajnaCena;
    //private String dobavljac;
    private double radniTakt;
    private int brojJezgara;
    
    public CPU(String naziv, BigDecimal prodajnaCena, String dobavljac, double radniTakt, int brojJezgara){
        //this.naziv=naziv;
        //this.prodajnaCena=prodajnaCena;
        //this.dobavljac=dobavljac;
        super(naziv, prodajnaCena, dobavljac);
        this.radniTakt=radniTakt;
        this.brojJezgara=brojJezgara;
    }
    
//    @Override
//    public String getNaziv() {
//        return naziv;
//    }

    @Override
    public String getSpecifikacija() {
        return "Radni takt: "+radniTakt+"GHz, Broj jezgara: "+brojJezgara+";";
    }

//    @Override
//    public BigDecimal getProdajnaCena() {
//        return prodajnaCena;
//    }
//
//    @Override
//    public String getDobavljac() {
//        return dobavljac;
//    }
    
}
