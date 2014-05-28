package sodysk;
import java.util.*;

public class Kolejka {
    Random wiecej = new Random();
    int duzowiecej;
    private int glowica = 1;
    private int sumaprzemieszczen;
    private int b;
    ListaOperacji l = new ListaOperacji();
    OperacjaDyskowa o = new OperacjaDyskowa();
    public int ZcJ = 0;
    
    
   /**
    * przesuwanie głowicy do podanego argumentu metody. Automatycznie dobiera czy ma odejmować czy dodawać obszary.
    * 
    */ 
    
   public void przesunGlowice(OperacjaDyskowa o){
       this.o= o;
       
        if(o.getNrBloku()< 0 || o.getNrBloku()>100){
        throw new RuntimeException("Na dysku nie ma takiego obszaru");
      }
   
        while(!(glowica == o.getNrBloku())){
            if(o.getNrBloku()> glowica){
                glowica++;
                b++;
                System.out.println("Glowica obszar nr " + glowica);
            }
            if(o.getNrBloku() < glowica){
                glowica--;
                b++;
                System.out.println("Glowica obszar nr " + glowica);
            }
        }
        sumaprzemieszczen = b;
        glowica = o.getNrBloku(); 
   }
   
    /**
    * Przesuwanie głowicy od początku do końca obszaru dyskowego. Jednak można dostać się z zewnątrz setterem do ZcJ
    * i zmieniając wartość wymusić ruch głowicy w drugą strone.
    */
   
   public void przesuwajGlowice(){
       if(ZcJ == 0){
           glowica++;
           b++;
           System.out.println("Glowica obszar nr " + glowica);
       }
       if(ZcJ == 1){
           glowica --;
           b++;
           System.out.println("Glowica obszar nr " + glowica);
       }
       if(glowica == 100){
           ZcJ = 1;
       }
       if(glowica == 1){
           ZcJ = 0;
       }
      sumaprzemieszczen = b; 
   }
   
   
   public int getSumaPrzem(){
       return sumaprzemieszczen;
   }
   
   public int getGlowica(){
       return glowica;
   }
   
   public int getZcJ(){
       return ZcJ;
   }
   
   public void setZcJ(int cokolwiek){
       ZcJ = cokolwiek;
   }
    
      /**
    *  Krok odpowiadający za wygenerowanie i dodanie do listy elementów.
    *  Cały krok znajduje się w menu.
    */
   
   public void krok(){
      duzowiecej = wiecej.nextInt(3-1+1)+1;  // dodatkowe losowanie ze względu na pochodzenie generatora (tablica)
      for(int z=0; z<=duzowiecej; z++){
      OperacjaDyskowa  x = l.getRandom();
       if(x != null){
       l.dodajDoListy(x);
       }
      }
   }
   
   /**
    *  To samo co wyżej tylko losowanie następuje z metody 2 zapewniającej długość i deadline operacji.
    */
   
   public void innykrok(){
        duzowiecej = wiecej.nextInt(2-1+1)+1;
      for(int z=0; z<=duzowiecej; z++){
      OperacjaDyskowa  x = l.getRandom2();
       if(x != null){
       l.dodajDoListy(x);
       }
      }
   }
   
}
    
