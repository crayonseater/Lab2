
package sodysk;

import java.util.LinkedList;

public class ListaOperacji extends GeneratorIterujacy{
    LinkedList<OperacjaDyskowa > lista = new LinkedList<>();
      
   public void dodajDoListy(OperacjaDyskowa  op){
       lista.add(op);
         }
   public void usunEle(OperacjaDyskowa  od){
       lista.remove(od);
   }
   
   public void wyswietlEle(){
      for(int i=0; i<lista.size(); i++){
         if(!(lista.isEmpty())){
           System.out.println(lista.get(i));
         }  
     }
   }
  
 }

