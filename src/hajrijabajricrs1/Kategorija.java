/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hajrijabajricrs1;

/**
 *
 * @author Korisnik
 */

enum spol {muski, zenski};

public class Kategorija {
    private Integer godiste;
    private  spol spol;

    public spol getSpol() {
        return spol;
    }

    public void setSpol(spol spol) {
        this.spol = spol;
    }

    public Kategorija() {
    }

    public Kategorija(Integer godiste) {
        this.godiste = godiste;
    }

    public Integer getGodiste() {
        return godiste;
    }

    public void setGodiste(Integer godiste) {
        this.godiste = godiste;
    }
    
    
}
