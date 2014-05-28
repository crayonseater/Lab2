
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

  /**
	 * Metoda odpowiadająca za menu programu za pomocą switcha.
	 */
	public void menu() throws InterruptedException
	{
		Scanner in = new Scanner(System.in);
		int wybor = in.nextInt();
		switch(wybor)
		{
	case 1:
                   do {
	             wyswietlMenu2();
                     Scanner sc = new Scanner(System.in);
                          int liczba = sc.nextInt();
                          
                     if(liczba == 1){
                       kolejka.krok();
                       if(kolejka.l.lista.size()>0){
                        wyswietlListe();
                        fcfs.wykonaj(kolejka.l.lista);
                            }
                        }
                     
                     if(liczba == 2){
                       for(int i=0; i<10; i++){
                           kolejka.krok();
                           if(kolejka.l.lista.size()>0){
                           wyswietlListe();
                            fcfs.wykonaj(kolejka.l.lista);
                            }
                          }
                     }
                     
                     if(liczba == 3){
                       Scanner tj = new Scanner(System.in);
                       String klucz = " ";
                         while(!(klucz.equals("stop"))){
                          kolejka.krok();
                           if(kolejka.l.lista.size()>0){
                            wyswietlListe();
                            fcfs.wykonaj(kolejka.l.lista);
                            }
                          klucz = tj.nextLine();
                         }
                     }
                     
                     if(liczba ==4){
                         zmienna = 0;
                         wyswietlMenu();
                         menu();
                     }
                   } while(zmienna == 1);
                   break; 
	case 2:
		     do {
	             wyswietlMenu2();
                     Scanner sc = new Scanner(System.in);
                     int liczba = sc.nextInt();
                          
                     if(liczba == 1){
                       kolejka.krok();
                       if(kolejka.l.lista.size()>0){
                        wyswietlListe();
                        scan.wykonaj(kolejka.l.lista);
                            }
                        }
                     
                     if(liczba == 2){
                       for(int i=0; i<10; i++){
                           kolejka.krok();
                           if(kolejka.l.lista.size()>0){
                           wyswietlListe();
                            scan.wykonaj(kolejka.l.lista);
                            }
                          }
                     }
                     
                     if(liczba == 3){
                       Scanner tj = new Scanner(System.in);
                       String klucz = " ";
                         while(!(klucz.equals("stop"))){
                          kolejka.krok();
                           if(kolejka.l.lista.size()>0){
                            wyswietlListe();
                            scan.wykonaj(kolejka.l.lista);
                            }
                          klucz = tj.nextLine();
                         }
                     }
                     
                     if(liczba ==4){
                         zmienna = 0;
                         wyswietlMenu();
                         menu();
                     }
                   } while(zmienna == 1);
		   break;
	case 3:
			
			do {
	             wyswietlMenu2();
                     Scanner sc = new Scanner(System.in);
                          int liczba = sc.nextInt();
                          
                     if(liczba == 1){
                       kolejka.krok();
                       if(kolejka.l.lista.size()>0){
                        wyswietlListe();
                        scan.wykonaj(kolejka.l.lista);
                            }
                        }
                     
                     if(liczba == 2){
                       for(int i=0; i<10; i++){
                           kolejka.krok();
                           if(kolejka.l.lista.size()>0){
                           wyswietlListe();
                            scan.wykonaj(kolejka.l.lista);
                            }
                          }
                     }
                     
                     if(liczba == 3){
                       Scanner tj = new Scanner(System.in);
                       String klucz = " ";
                         while(!(klucz.equals("stop"))){
                          kolejka.krok();
                           if(kolejka.l.lista.size()>0){
                            wyswietlListe();
                            scan.wykonaj(kolejka.l.lista);
                            }
                          klucz = tj.nextLine();
                         }
                     }
                     
                     if(liczba ==4){
                         zmienna = 0;
                         wyswietlMenu();
                         menu();
                     }
                   } while(zmienna == 1);
                   break;
	case 4:
	         do {
	             wyswietlMenu2();
                     Scanner sc = new Scanner(System.in);
                     int liczba = sc.nextInt();
                          
                     if(liczba == 1){
                       kolejka.krok();
                       if(kolejka.l.lista.size()>0){
                        wyswietlListe();
                        cscan.wykonaj(kolejka.l.lista);
                            }
                        }
                     
                     if(liczba == 2){
                       for(int i=0; i<10; i++){
                           kolejka.krok();
                           if(kolejka.l.lista.size()>0){
                           wyswietlListe();
                            cscan.wykonaj(kolejka.l.lista);
                            }
                          }
                     }
                     
                     if(liczba == 3){
                       Scanner tj = new Scanner(System.in);
                       String klucz = " ";
                         while(!(klucz.equals("stop"))){
                          kolejka.krok();
                           if(kolejka.l.lista.size()>0){
                            wyswietlListe();
                            cscan.wykonaj(kolejka.l.lista);
                            }
                          klucz = tj.nextLine();
                         }
                     }
                     
                     if(liczba ==4){
                         zmienna = 0;
                         wyswietlMenu();
                         menu();
                     }
                   } while(zmienna == 1);
                   break; 	
	case 5:
			
			do {
	             wyswietlMenu2();
                     Scanner sc = new Scanner(System.in);
                     int liczba = sc.nextInt();
                          
                     if(liczba == 1){
                       kolejka.innykrok();
                       if(kolejka.l.lista.size()>0){
                        wyswietlListe();
                        edf.wykonaj(kolejka.l.lista);
                        System.out.println("Obecnie wykonano " + edf.getWykonano() + " i przekroczono czas "
                                    + "żądania dla " + edf.getTerminated() + " operacji");
                            }
                        }
                     
                     if(liczba == 2){
                       for(int i=0; i<10; i++){
                           kolejka.innykrok();
                           if(kolejka.l.lista.size()>0){
                           wyswietlListe();
                            edf.wykonaj(kolejka.l.lista);
                            System.out.println("Obecnie wykonano " + edf.getWykonano() + " i przekroczono czas "
                                    + "żądania dla " + edf.getTerminated() + " operacji");
                            }
                          }
                     }
                     
                     if(liczba == 3){
                       Scanner tj = new Scanner(System.in);
                       String klucz = " ";
                         while(!(klucz.equals("stop"))){
                          kolejka.innykrok();
                           if(kolejka.l.lista.size()>0){
                            wyswietlListe();
                            edf.wykonaj(kolejka.l.lista);
                            System.out.println("Obecnie wykonano " + edf.getWykonano() + " i przekroczono czas "
                                    + "żądania dla " + edf.getTerminated() + " operacji");
                            }
                          klucz = tj.nextLine();
                         }
                     }
                     
                     if(liczba ==4){
                         zmienna = 0;
                         wyswietlMenu();
                         menu();
                     }
                   } while(zmienna == 1);
                   break; 	
                    
        case 6:
                        do {
	             wyswietlMenu2();
                     Scanner sc = new Scanner(System.in);
                     int liczba = sc.nextInt();
                          
                     if(liczba == 1){
                       kolejka.innykrok();
                       if(kolejka.l.lista.size()>0){
                        wyswietlListe();
                        fdscan.wykonaj(kolejka.l.lista);
                        System.out.println("Obecnie wykonano " + fdscan.getWykonano() + " i przekroczono czas "
                                    + "żądania dla " + fdscan.getTerminated() + " operacji");
                            }
                        }
                     
                     if(liczba == 2){
                       for(int i=0; i<10; i++){
                           kolejka.innykrok();
                           if(kolejka.l.lista.size()>0){
                           wyswietlListe();
                            fdscan.wykonaj(kolejka.l.lista);
                            System.out.println("Obecnie wykonano " + fdscan.getWykonano() + " i przekroczono czas "
                                    + "żądania dla " + fdscan.getTerminated() + " operacji");
                            }
                          }
                     }
                     
                     if(liczba == 3){
                       Scanner tj = new Scanner(System.in);
                       String klucz = " ";
                         while(!(klucz.equals("stop"))){
                          kolejka.innykrok();
                           if(kolejka.l.lista.size()>0){
                            wyswietlListe();
                            fdscan.wykonaj(kolejka.l.lista);
                            System.out.println("Obecnie wykonano " + fdscan.getWykonano() + " i przekroczono czas "
                                    + "żądania dla " + fdscan.getTerminated() + " operacji");
                            }
                          klucz = tj.nextLine();
                         }
                     }
                     
                     if(liczba ==4){
                         zmienna = 0;
                         wyswietlMenu();
                         menu();
                     }
                   } while(zmienna == 1);
                   break; 	
                    
        case 7:
                        System.out.println("Zakończono");
                        break;
                    
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		SODysk  dysk = new SODysk();
		dysk.wyswietlMenu();
		dysk.menu();
	}
}
    
              
   