/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domain.CPU;
import domain.CiscenjeVirusa;
import domain.InstalacijaOperativnogSistema;
import domain.Komponenta;
import domain.KomponentaUsluga;
import domain.Memorija;
import domain.Monitor;
import domain.Usluga;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cartman
 */
public class Ponuda {
    private static Ponuda instance;
    private List<Komponenta> komponente;
    
    private List<Usluga> usluge;

    public static Ponuda getInstance() {
        if(instance==null){
            instance = new Ponuda();
        }
        return instance;
    }
    

    private Ponuda() {
        
        komponente=new ArrayList<>();
        Komponenta k1=new Monitor("AOC", new BigDecimal(40000), "CT", 29, "1920x1080");
        Komponenta k2=new CPU("Intel", new BigDecimal(60000), "Saga", 4.2, 16);
        Komponenta k3=new Memorija("Kingston", new BigDecimal(8000), "CT", 8, 3.6);
        Komponenta k4=new Monitor("Lenovo", new BigDecimal(35000), "Saga", 15.6, "1920x1080");
        komponente.add(k1);
        komponente.add(k2);
        komponente.add(k3);
        komponente.add(k4);
        
        usluge=new ArrayList<>();
        Usluga u1=new InstalacijaOperativnogSistema("Instalacija operativnog sistema Windows", "1. Backup podataka, 2. instalacija sistema, 3. Podesavanje sistema", new BigDecimal(5000), new BigDecimal(1000), "Pera Peric", "Server 2016");
        Usluga u2=new CiscenjeVirusa("Ciscenje virusa i instalacija antivirusnog programa", "Uklanjanje virusa i instalacija programa", new BigDecimal(6000), new BigDecimal(1200), "Zika Zivkovic", "Kasperski");
        Usluga u3=new InstalacijaOperativnogSistema("Instalacija operativnog sistema Linux", "1. Backup podataka, 2. instalacija sistema, 3. Podesavanje sistema", new BigDecimal(4000), new BigDecimal(8000), "Pera Peric", "MINT");
        usluge.add(u1);
        usluge.add(u2);
        usluge.add(u3);
       
        for (Usluga usluga : usluge) {
            komponente.add(new KomponentaUsluga(usluga));
        }
    }
    
    public List<Komponenta> vratiSadrzajPonude(){
        return komponente;
    }
    
}
