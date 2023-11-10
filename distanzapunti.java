
package com.mycompany.pianocartesaino1_2;
import java.util.Scanner;
/**
 *
 * @author fabri
 */
public class distanzapunti {

    public void distanzapunti() {
   
    
    }
   
   void calcoli(int x, int y){        
        System.out.println("benvenuto nella funzione per caloclare la distanza tra due punti");
       Scanner scan=new Scanner(System.in);
      System.out.println("inserisci le coordinate x e y del secondo punto");
       int x1=scan.nextInt();
       int y1=scan.nextInt();
  int cat1,cat2;                            //creo due variabili di tipo int nel quale assocerò le misure dei cateti
  if(x1-x<0){
      cat1=-(x1-x);
  }else{
      cat1=x1-x;
  }
  if(y1-y<0){
      cat2=-(y1-y);
  }else{
      cat2=y1-y;
  }
  double ipotenusa;
  ipotenusa= java.lang.Math.sqrt((cat1*cat1)+(cat2*cat2));   //faccio un return del valore della distanza nella variabile ipotenusa all'interno del metodo controllo
System.out.println("la distanza tra i due punti misura: " + ipotenusa);
   }
   
   double distanza(int x, int y, int x1, int y1){   //creo un metodo da utilizzare nelle altre classi per calcolare la distanza tra punti
  int lx,ly;                            //creo due variabili di tipo int nel quale assocerò le misure dei cateti
  if(x1-x<0){
      lx=-(x1-x);
  }else{
      lx=x1-x;
  }
  if(y1-y<0){
      ly=-(y1-y);
  }else{
      ly=y1-y;
  }
 
       
       
       return java.lang.Math.sqrt((lx*lx)+(ly*ly));  //ritorno la distanza dei punti dati
       
   }
   }
    
    
  
