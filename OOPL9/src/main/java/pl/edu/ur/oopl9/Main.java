package pl.edu.ur.oopl9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;


public class Main {


    static void print(int[] tab){
        for(int i = 0; i < tab.length; i++){
            System.out.println(" " + tab[i]);
            }
        }

    public static void main(String[] args) {
        int[] tab = new int[100];
        Random generator = new Random();
        for(int i = 0; i < tab.length; i++){
            tab[i] = generator.nextInt(101);
        }
        print(tab);
        Arrays.sort(tab);
        print(tab);
        
        System.out.println("zad2");
        
        TreeSet x = new TreeSet <> ();
        for(int i =0; i < 100; i++){
           int a = generator.nextInt(201);
           x.add(a);
        }
        Iterator it = x.iterator();
        
        while(it.hasNext()){  
            System.out.println(it.next());  
        }  
        
        System.out.println("zad3");
        
        List<Samochod> lista = new ArrayList<>();
        Samochod s1 = new Samochod("syrena", "morskaxD", 180, 10000);
        Samochod s2 = new Samochod("fiat", "126p", 120, 5000);
        Samochod s3 = new Samochod("nissan", "GTR", 300, 1000000);
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        lista.get(0).wynik();
        lista.get(1).wynik();
        lista.get(2).wynik();
        
    }
}
