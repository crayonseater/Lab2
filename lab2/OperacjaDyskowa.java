
package sodysk;

public class OperacjaDyskowa {
    private int id=0;
    private int nrBloku;
    private int glowica = 0;
    private int czas;
    public int deadline;
    
    public OperacjaDyskowa(){
        
    }
    
    public OperacjaDyskowa(int nrBloku, int id, int czas , int deadline){
        if(nrBloku<0 || nrBloku>100){
             throw new RuntimeException("Na dysku nie ma takiego obszaru");
        }
        this.id = id;
        this.nrBloku = nrBloku;
        this.czas = czas;
        this.deadline = deadline;
    }
    
    public OperacjaDyskowa(int nrBloku, int id){
        if(nrBloku<0 || nrBloku>100){
             throw new RuntimeException("Na dysku nie ma takiego obszaru");
        }
        this.id = id;
        this.nrBloku = nrBloku;
    }
    
    
    public int getNrBloku(){
        return nrBloku;
    }
    public int getId(){
        return id;
    }
    public int getGlowica(){
        return glowica;
    }
    public int getCzas(){
        return czas;
    }
    public int getDeadline(){
        return deadline;
    }
    
    @Override
    public String toString(){
        return "Operacja Dyskowa nr "+ getId() + " W bloku numer " + getNrBloku() + " Czas wykonania : " + getCzas()
               + " Deadline : " + getDeadline();
    }
  
  }
    

