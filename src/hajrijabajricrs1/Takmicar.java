/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hajrijabajricrs1;

import java.util.Scanner;

/**
 *
 * @author Korisnik
 */
public class Takmicar {
    private String ime;
    private String prezime;
    private String klub;
    private Kategorija kategorija;

    public Takmicar() {
    }

    public Takmicar(String ime, String prezime, String klub, Kategorija kategorija) {
        this.ime = ime;
        this.prezime = prezime;
        this.klub = klub;
        this.kategorija = kategorija;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public Kategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }
    
    public void ispis(){
        System.out.println(this.ime + " " + this.prezime + ". Klub: " + this.klub + ", kategroija: " + this.kategorija.getGodiste());
    }
}
