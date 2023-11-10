/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pianocartesaino1_2;
import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class punto {
  

    
 private int x,y;
 public void punto(){
    input();        //chiamo due metodi all'interno del programma
    controllo();
   
    
 }
 
 
 
 
 public void input(){
     Scanner scan=new Scanner(System.in);
     x=scan.nextInt();
     y=scan.nextInt();
    
    
 }
   
 public void controllo(){
     stampa stampa=new stampa();  //instanzio l'oggetto stampa che utilizzo per racchiudervi dentro tutti i messaggi da stampare
     int s;
     if(x>0){                 //eseguo i primi tre confronti nel caso x>0
         if(y>0){
             s=1;
         }else if(y<0){
             s=4;
         }else{
             s=6;
         }
        
     }else if(x<0){        //secondo caso x < 0
            if(y>0){
             s=2;
         }else if(y<0){
             s=3;
         }else{
             s=9;
         }
     }else{             //ultimo macro if x=0
            if(y>0){
             s=7;
         }else if(y<0){
             s=8;
         }else{
             s=5;
         }
     }
     stampa.Stampa(s);
    
     
 }
 
 public void distanza(){                                    //richiamo le funzione che hanno bisogno del primo punto per funzionare 
     distanzapunti distanzapunti=new distanzapunti();
     distanzapunti.calcoli(x, y);
 }
 public void cerchio(){
     cerchio cerchio=new cerchio();
     cerchio.datic(x, y);
 }





 
}
