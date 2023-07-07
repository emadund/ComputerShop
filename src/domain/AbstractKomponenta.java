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
public abstract class AbstractKomponenta implements Komponenta{

    private String naziv;
    private BigDecimal prodajnaCena;
    private String dobavljac; 
    
    public AbstractKomponenta(String naziv, BigDecimal prodajnaCena, String dobavljac){
        this.naziv=naziv;
        this.prodajnaCena=prodajnaCena;
        this.dobavljac=dobavljac;
    }
    
    @Override
    public String getNaziv() {
        return naziv;
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
