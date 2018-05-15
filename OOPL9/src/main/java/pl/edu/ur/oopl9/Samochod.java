package pl.edu.ur.oopl9;


public class Samochod {
    private String nazwa, marka;
    private int maxV, cena;

    public Samochod(String marka, String nazwa, int maxV, int cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.maxV = maxV;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getMaxV() {
        return maxV;
    }

    public void setMaxV(int maxV) {
        this.maxV = maxV;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
   
    public void wynik() {
        System.out.println(getMarka() + " " + getNazwa() + " max predkosc: " + getMaxV() + " cena: " + getCena()); 
    }
}
