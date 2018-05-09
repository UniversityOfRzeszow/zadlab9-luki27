/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Patrycja
 */
public class Zadanie4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> slowa = new HashMap<>();
        slowa.put("kot", "cat");
        slowa.put("pies", "dog");
        slowa.put("czlowiek", "human");
        slowa.put("kobieta", "woman");
        slowa.put("mezczyna", "man");
        slowa.put("jesc", "eat");
        slowa.put("pic", "drink");
        slowa.put("spac", "sleep");
        slowa.put("grac", "play");
        slowa.put("czarny", "black");
        slowa.put("bialy", "white");
        slowa.put("czerwony", "red");
        slowa.put("zielony", "green");
        slowa.put("lozko", "bed");
        slowa.put("warzywa", "vegetables");
        slowa.put("owoce", "fruit");
        slowa.put("chomik", "hamster");
        slowa.put("sklep", "shop");
        slowa.put("tata", "dad");
        slowa.put("mama", "mom");
        
        Scanner input = new Scanner(System.in);
        String slowo = null;
        System.out.println("Wpisz jedno z podanych słów aby otrzymać tłumaczenie: \n kot\n pies\n czlowiek\n kobieta\n mezczyzna\n jesc\n pic\n spac\n grac\n czarny\n bialy\n czerwony\n zielony\n lozko\n warzywa\n owoce\n chonik\n sklep\n tata\n mama");
        do {
        
        slowo = input.nextLine();
        System.out.println("" + slowo + " ---- " + slowa.get(slowo));
        }
        while( !"koniec".equals(slowo));
    }

}
