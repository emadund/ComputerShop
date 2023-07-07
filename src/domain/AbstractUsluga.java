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
public abstract class AbstractUsluga implements Usluga{

    private String naziv;
    private String opisAktivnosti;
    private BigDecimal cenaBezPDVa;
    private BigDecimal iznosPDVa;
    private String serviser;

    public AbstractUsluga(String naziv, String opisAktivnosti, BigDecimal cenaBezPDVa, BigDecimal iznosPDVa, String serviser) {
        this.naziv = naziv;
        this.opisAktivnosti = opisAktivnosti;
        this.cenaBezPDVa = cenaBezPDVa;
        this.iznosPDVa = iznosPDVa;
        this.serviser = serviser;
    }
    
    
    
    @Override
    public String getNaziv() {
        return naziv;
    }

    @Override
    public String getOpisAktivnosti() {
        return opisAktivnosti;
    }

    @Override
    public BigDecimal getCenaBezPDVa() {
        return cenaBezPDVa;
    }

    @Override
    public BigDecimal getIznosPDVa() {
        return iznosPDVa;
    }

    @Override
    public String getServiser() {
        return serviser;
    }
    
}
