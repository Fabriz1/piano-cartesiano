
package com.mycompany.pianocartesaino1_2;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class cerchio {
    
    public void cerchio(){
        stampa stampa=new stampa();
        stampa.Stampa(11);  //stampo il messaggio di presentazione della funzione per calcolare i dati di un cerchio
         }
    
    
    public void datic(int x, int y){   //racchiudo tutti i calcoli in questo metodo
       distanzapunti r=new distanzapunti();  //instanzio l'ogetto per il calcolo della distanza tra i due vertici ovvero il raggio
       stampa stampa=new stampa();
        double raggio;  //creo la variabile corrispondente al raggio
        Scanner scan=new Scanner(System.in);
        int x1=scan.nextInt();
        int y1=scan.nextInt();
    System.out.println("ecco i dati del tuo cerchio:");
    
   raggio= r.distanza(x, y, x1, y1);
   System.out.println("raggio: " + raggio);  //stampo il valore del raggio
   
   System.out.println("la misura della circonferenza è: "+ raggio*2*3.14);          //stampo i dati del cerchio senza creare variabili aggiuntive
   System.out.println("l'area del cerchio è: "+ raggio*raggio*3.14);
           
   
   
    }
    
}
