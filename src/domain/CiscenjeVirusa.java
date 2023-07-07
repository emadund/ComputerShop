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
public class CiscenjeVirusa extends AbstractUsluga{
    private String antivirusniProgram;

    public CiscenjeVirusa(String naziv, String opisAktivnosti, BigDecimal cenaBezPDVa, BigDecimal iznosPDVa, String serviser, String antivirusniProgram) {
        super(naziv, opisAktivnosti, cenaBezPDVa, iznosPDVa, serviser);
        this.antivirusniProgram = antivirusniProgram;
    }

    @Override
    public String getNaziv() {
        return super.getNaziv() +" ["+antivirusniProgram+"]";
    }
    
    
}
