/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     *
     * @param tablica
     */
    static void print(int[] tab){
        for(int i = 0; i < tab.length; i++){
            System.out.println(" " + tab[i]);
            }
        }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] tab = new int[100];
        Random generator = new Random();
        for(int i = 0; i < tab.length; i++){
            tab[i] = generator.nextInt(101);
        }
        print(tab);
        Arrays.sort(tab);
        print(tab);
        
        System.out.println("-----------Zadanie 2-------------");
        
        TreeSet x = new TreeSet <> ();
        for(int i =0; i < 100; i++){
           int a = generator.nextInt(201);
           x.add(a);
        }
        Iterator it = x.iterator();
        
        while(it.hasNext()){  
            System.out.println(it.next());  
        }  
        
        System.out.println("-----------Zadanie 3-------------");
        
        List<Samochod> lista = new ArrayList<>();
        Samochod s1 = new Samochod("Łada", "Samara", 180, 10000);
        Samochod s2 = new Samochod("Fiat", "126p", 120, 5000);
        Samochod s3 = new Samochod("Czerwony", "Najszybszy", 300, 1000000);
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        lista.get(0).wynik();
        lista.get(1).wynik();
        lista.get(2).wynik();
        
    }
}
