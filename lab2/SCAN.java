
package sodysk;

import java.util.Iterator;
import java.util.LinkedList;

public class SCAN extends Kolejka{
    public OperacjaDyskowa operacja;
    public OperacjaDyskowa operacjaPomocnicza;
    
    public SCAN (){
        this.operacja = null;
    }
    
    public OperacjaDyskowa wykonaj(LinkedList<OperacjaDyskowa> lis) throws InterruptedException { 
    
     if(lis.isEmpty()){
      return null;
     }
     
     else{
         operacja = lis.getFirst();
          do{
             przesuwajGlowice();
             for (Iterator<OperacjaDyskowa> it = lis.iterator(); it.hasNext();) {
                operacjaPomocnicza = it.next();
                if(operacjaPomocnicza.getNrBloku() == getGlowica()){
                    operacja = operacjaPomocnicza;
                }
           }
          }while(!(operacja.getNrBloku() == getGlowica()));
                System.out.println("Teraz wykonuje : " + operacja);
                System.out.println("Glowica na miejscu bloku o numerze :" + getGlowica()
                            + " wykonano " + getSumaPrzem() + " przemieszczen Glowicy");
                lis.remove(operacja);
       
    }
          
     return operacja;
   }
}
