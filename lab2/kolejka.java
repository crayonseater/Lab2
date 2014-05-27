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
    
