/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pianocartesaino1_2;
import java.util.Scanner;
public class Pianocartesaino1_2 {

    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        int sc=0;  

    
      stampa stampa= new stampa();               //instanzio l'oggetto stampa nel quale ho racchiuso tutti i println
       stampa.Stampa(0);                       //stampo messaggio di benvenuto
       punto Punto= new punto();                    //instanzio l'oggetto punto nel quale racchiuderò tutto il mio codice
       Punto.punto();                              //chiamo punto
     
      stampa.Stampa(12);                    //stampo un menu a scelta per utilizzare una funzione
      sc=scan.nextInt();
       switch(sc){
           case 1:
               
                Punto.distanza();
                break;
           case 2:
                                  
                Punto.cerchio();
                break;
           case 3:                  
                poligoni poligoni= new poligoni();
                poligoni.poligoni();
                break;
       
       
       }
     
     
          
        
                          
        
      
       
                                         
        
      
      
      
      
    
       
       
       
    
    }


}
           

