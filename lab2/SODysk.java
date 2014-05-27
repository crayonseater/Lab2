
package sodysk;
import java.util.*;

public class SODysk{
  Kolejka kolejka = new Kolejka();
  FCFS fcfs = new FCFS();
  SSTF sstf = new SSTF();
  SCAN scan = new SCAN();
  C_Scan cscan = new C_Scan();
  EDF edf = new EDF();
  FD_SCAN fdscan = new FD_SCAN();
  int zmienna =1;
  
	
	/**
	 * Metody wyświetlające menu programu.
	 */
	public void wyswietlMenu()
        {
		System.out.println("Wybierz numer algorytmu którego chcesz użyć : ");
                System.out.println(" ");
		System.out.println("1. FCFS");
		System.out.println("2. SSTF");
		System.out.println("3. SCAN");
		System.out.println("4. C-SCAN");
		System.out.println("5. EDF");
		System.out.println("6. FD-SCAN");
                System.out.println("7. Zakończ");
                System.out.println(" ");
	}
        
        public void wyswietlMenu2(){
            
                System.out.println(" ");
                System.out.println("Ile kroków chcesz wykonać?");
                System.out.println("1. Jeden krok");
                System.out.println("2. 10 kroków");
                System.out.println("3. Wykonuj cały czas (Przytrzymujac enter, aby zakończyć wpisz : stop)");
                System.out.println("4. Powrot do menu glownego");
                System.out.println(" ");
        }
        
        public void wyswietlListe(){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Elementy listy to : ");
             for(int k=0; k<kolejka.l.lista.size(); k++){
               System.out.println(kolejka.l.lista.get(k));        
                }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        }
