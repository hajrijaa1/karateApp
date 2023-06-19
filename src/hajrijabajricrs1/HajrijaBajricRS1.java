/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hajrijabajricrs1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Korisnik
 */
public class HajrijaBajricRS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Takmicar> takmicari = new Stack<Takmicar>();
        Scanner in = new Scanner(System.in);
        int izbor = 0;
        do{
            System.out.println("*****---------------------******");
            System.out.println("1. Unos takmičara.");
            System.out.println("2. Ispis takmičara. ");
            System.out.println("3. Pretraga po klubu");
            System.out.println("4. Generiši parove za kategoriju. ");
            System.out.println("Vaš izbor------->");
            izbor = in.nextInt();
            
            switch(izbor){
                case 1:
                    in.nextLine();
                    Takmicar t = new Takmicar();
                    System.out.println("Unosi ime takmičara: ");
                    t.setIme(in.nextLine());
                    System.out.println("Unesi prezime takmičara: ");
                    t.setPrezime(in.nextLine());
                    System.out.println("Unesi klub: ");
                    t.setKlub(in.nextLine());
                    
                    Kategorija k = new Kategorija();
                    System.out.println("*****--------Unesi kategoriju---------***** ");
                    System.out.println("Unesi godiste kategorije: ");
                    k.setGodiste(in.nextInt());
                    System.out.println("Unesite spol: 1. muški 2.ženski");
                    int odabirSpola = in.nextInt();
                    if(odabirSpola == 1){
                        k.setSpol(spol.muski);
                    }else{
                         k.setSpol(spol.zenski);
                    }
                   t.setKategorija(k);
                    takmicari.push(t);
                    break;
                    
                case 2:
                    
                    Kategorija kat = new Kategorija();
                    System.out.println("******----------Unesi kategoriju--------******* ");
                    System.out.println("Unesi godiste kategorije: ");
                    kat.setGodiste(in.nextInt());
                    System.out.println("Unesite spol: 1. muški 2.ženski");
                    int odabirSpola2 = in.nextInt();
                    if(odabirSpola2 == 1){
                        kat.setSpol(spol.muski);
                    }else{
                         kat.setSpol(spol.zenski);
                    }
                    
                    List<Takmicar> takmicariPoKategoriji = new ArrayList<>();
                    for(Takmicar t2  : takmicari)
                            {
                               Kategorija temp = t2.getKategorija();
                               if(temp.getGodiste().equals(kat.getGodiste()) && temp.getSpol().equals(kat.getSpol())){
                                  takmicariPoKategoriji.add(t2);
                               }
                            }
                    if(takmicariPoKategoriji.size() == 0){
                        System.out.println("Nema takmicara u toj kategoriji!");
                    }else{
                        for(Takmicar t3 : takmicariPoKategoriji){
                            t3.ispis();
                        }
                    }
                    break;
                case 3:
                    in.nextLine();
                    System.out.println("Unesi klub: ");
                    String imeKluba = in.nextLine();
                    List<Takmicar> takmicariPoKlubu = new ArrayList<>();
                    for(Takmicar t2  : takmicari)
                            {
                               if(t2.getKlub().equals(imeKluba)){
                                   takmicariPoKlubu.add(t2);
                               }
                            }
                    if(takmicariPoKlubu.size() == 0){
                        System.out.println("Nema takmicara u tom klubu!");
                    }else{
                        for(Takmicar t3 : takmicariPoKlubu){
                            t3.ispis();
                        }
                    }
                    break;
                    
                case 4:
                    break;
            }
            
          
           
        }while(izbor!=0);
        
    }
    
}
