package pl.edu.ur.oopl9;

import java.util.HashMap;
import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {
        
        HashMap<String, String> slowa = new HashMap<>();
        slowa.put("tata", "dad");
        slowa.put("mama", "mom");
        slowa.put("kot", "cat");
        slowa.put("pies", "dog");
        slowa.put("czlowiek", "human");
        slowa.put("kobieta", "woman");
        slowa.put("mezczyna", "man");
        slowa.put("zwierze", "animal");
        slowa.put("pic", "drink");
        slowa.put("spac", "sleep");
        slowa.put("grac", "play");
        slowa.put("jesc", "eat");
        slowa.put("szafa", "wardrobe");
        slowa.put("powtorz", "repeat");
        slowa.put("trawa", "grass");
        slowa.put("lozko", "bed");
        slowa.put("warzywa", "vegetables");
        slowa.put("owoce", "fruit");
        slowa.put("gaz lzawiacy", "tear gas");
        slowa.put("sklep", "shop"); 
        Scanner input = new Scanner(System.in);
        String slowo = null;
        System.out.println("Wpisz jedno z podanych slow aby otrzymac tlumaczenie: \n tata\t mama\t kot\t pies\t czlowiek\t kobieta\t mezczyzna\t zwierze\t pic\t spac\n grac\t jesc\t szafa\t powtorz\t trawa\t lozko\t warzywa\t owoce\t gaz lzawiacy\t sklep\n-------------------------------------------------------------------------\n");
        do {
            slowo = input.nextLine();
            System.out.println("" + slowo + " - " + slowa.get(slowo));
        }
        while( !"koniec".equals(slowo));
    }
}
