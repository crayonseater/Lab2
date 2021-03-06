package sodysk;

import java.util.LinkedList;


   public class FCFS extends Kolejka {
    private OperacjaDyskowa operacja;
    
    public FCFS(){
        this.operacja = null;
    }
    
    public OperacjaDyskowa wykonaj(LinkedList<OperacjaDyskowa> lis) throws InterruptedException {
        
     if(lis.isEmpty()){
      return null;
          }
     else {
      operacja = lis.getFirst();
      
      if(operacja != null){
       System.out.println("Pierwszy Element na liscie : " + lis.getFirst());
       System.out.println("Teraz wykonuje : " + operacja);
        przesunGlowice(operacja);
         System.out.println("Glowica na miejscu bloku o numerze :" + getGlowica()
                            + " wykonano " + getSumaPrzem() + " przemieszczen glowicy");
          lis.removeFirst();
      if(lis.isEmpty()){
        return null;
       }
      operacja = lis.getFirst();
     }
      else {
       lis.removeFirst();
        }
        if(lis.isEmpty()){
         return null;
             }
        else {
        operacja = lis.getFirst();
       }
    }
   return operacja;
  }
  
    @Override
    public String toString(){
        return operacja + "glowica znajduje sie obecnie na miejscu " + getGlowica() + "wykonano " + getSumaPrzem() + " Przemieszczen.";
    }
    
 }
  
  
