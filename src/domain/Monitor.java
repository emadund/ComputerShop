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
public class Monitor implements Komponenta{
    
    private String naziv;
    private double dijagonala;
    private String rezolucija;
    private BigDecimal prodajnaCena;
    private String dobavljac;
    
    public Monitor(String naziv, BigDecimal prodajnaCena, String dobavljac, double dijagonala, String rezolucija){
        this.naziv=naziv;
        this.prodajnaCena=prodajnaCena;
        this.dobavljac=dobavljac;
        this.dijagonala=dijagonala;
        this.rezolucija=rezolucija;
    }
    
    @Override
    public String getNaziv() {
        return naziv;
    }

    @Override
    public String getSpecifikacija() {
        return "Dijagonala ekrana: "+dijagonala+"\", Rezolucija: "+rezolucija+";";
    }

    @Override
    public BigDecimal getProdajnaCena() {
        return prodajnaCena;
    }

    @Override
    public String getDobavljac() {
        return dobavljac;
    }
    
}
