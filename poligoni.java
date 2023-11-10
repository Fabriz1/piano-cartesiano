
package com.mycompany.pianocartesaino1_2;
import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author fabri
 */
public class poligoni {
   
    
    public void poligoni(){
      
        stampa stampa=new stampa(); 
        stampa.Stampa(10);                          //stampo il messaggio di presentazione della funzione
    Scanner scan= new Scanner(System.in);       //faccio scegliere all'utente di quale poligono vuole i dati 
    int scelta= scan.nextInt();
    switch(scelta){                                  //switch per richiamare i metodi della classe
        case 1 -> quadrato();
                case 2 -> rettangolo();
                    case 3 -> rombo();
                        case 4 -> triangolo();
                                   
    }
    
    }
    
    
    
   public void quadrato(){
       Scanner scan= new Scanner(System.in);
       System.out.println("inserisci le due coordinate dei vertici consecutivi a piacere: ");       //facacio inserire all'utente le coordinate di un lato a piacere siccome i lati sono tutti uguali
       System.out.println("x1 y1: ");   
       int x= scan.nextInt();
       int y= scan.nextInt();
       
        System.out.println("x2 y2: "); 
       int x1= scan.nextInt();
       int y1= scan.nextInt();
       
       distanzapunti lat= new distanzapunti();
     double lato= lat.distanza(x, y, x1, y1);                                       //creo il lato calcolando la distanza tra i due vertici
     System.out.println("perimetro: " + lato*4);                                    //stampo direttamente i dati del quadrato senza creare variabili aggiuntive 
     System.out.println("area: " + lato*lato);
   }
   
   
   public void rettangolo(){
     distanzapunti lat= new distanzapunti();
       Scanner scan= new Scanner(System.in);
       System.out.println("inserisci le due coordinate dei vertici della base: ");              //creo la base del rettangolo con due vertici
       System.out.println("x1 y1: "); 
       int xb= scan.nextInt();
       int yb= scan.nextInt();
       
        System.out.println("x2 y2: "); 
       int x1b =scan.nextInt();
       int y1b= scan.nextInt(); 
     double base= lat.distanza(xb, yb, x1b, y1b);
     
     
      System.out.println("inserisci le due coordinate dei vertici dell'altezza: ");         //faccio inserire le coordinate dei due vertici dell'altezza, o la seconda base
       System.out.println("x1 y1: "); 
       int xh=scan.nextInt();
       int yh=scan.nextInt();
       
        System.out.println("x2 y2: "); 
       int x1h=scan.nextInt();
       int y1h=scan.nextInt(); 
     double altezza= lat.distanza(xh, yh, x1h, y1h);
    
     System.out.println("base: "+ base);                                    //stampo i dati del rettangolo senza creare variabili aggiuntive
     System.out.println("altezza: "+ altezza);
     System.out.println("perimetro: " + (base+altezza)*2);
     System.out.println("area: " + base*altezza);
   }
   
   
   public void rombo(){
        
       distanzapunti lat= new distanzapunti();
       Scanner scan= new Scanner(System.in);
       int [] x=new int[4];                         //creo due array per le coordinate dei vertici
       int [] y=new int[4];
       System.out.println("inserisci le coordinate dei quattro vertici in ordine");             
     int st=0;                                      //variabile di tipo int per il print all'interno del ciclo
       for(int c=0;c<4;c++){
           st=c+1;
           System.out.println("x"+st+":"); 
           x[c]=scan.nextInt();
           System.out.println("y"+st+":");
           y[c]=scan.nextInt();     }
             
      double lato=lat.distanza(x[0], y[0], x[1], y[1]);             //creo uno dei 4 lati del rompo, tanto sono tutti uguali
       double [] alt= new double[2];            //creo un array che conterrài valori delle altezze, per calcolare l'area 
       alt[0]=lat.distanza(x[0], y[0], x[2], y[2]);
       alt[1]=lat.distanza(x[1], y[1], x[3], y[3]);
       
       System.out.println("i dati del tuo rombo sono:");
       System.out.println("lato: " + lato);
       System.out.println("altezza minore e maggiore:"+ alt[0]+ " ; " + alt[1] );
       System.out.println("perimetro: "+lato*4);
       System.out.println("area: " + (alt[0]*alt[1])/2);
       
   }
   
   
  /*public void triangolo(){
    int st;
       Scanner scan= new Scanner(System.in);
        distanzapunti lat= new distanzapunti();
      double [] x= new double[3];
      double [] y= new double[3];
      System.out.println("inserisci le due coordinate degli angoli del triangolo in ordine partendo dal vertice con la x minore della base: ");
      for(int c=0;c<3;c++){
          st=c+1;
          System.out.println("x"+st+": ");
          x[c]=scan.nextInt();
          System.out.println("y"+st+": ");
          y[c]=scan.nextInt();
      }
      boolean inv=false;
      if(y[0]<y[1]){
           inv=true;
      double cass=x[0];  //swappo gli elementi nel vettore
      x[0]=x[1];
      x[1]=cass;
     
      cass=y[0];  //swappo gli elementi nel vettore
      y[0]=y[1];
      y[1]=cass;
      }
      double xA= x[0];
      double yA= y[1];
      double a=y[0]-yA ;
      double b=x[0]-xA;
      if(a<0){
          a=-a;
      }
      if(b<0) {
         b= -b;
      }
      double betar=0;
      if(inv){
          betar= Math.atan(-a/b); //trovo l'angolo beta in radianti e lo inverto
      }else{
          betar= Math.atan(a/b); //trovo l'angolo beta in radianti
      }
      
       
      double beta = Math.toDegrees(betar); // converto langolo in gradi 
   
      
      
double coseno = Math.cos(betar);
double seno = Math.sin(betar);
System.out.println("Coseno di 45 gradi: " + coseno);

     for(int c=0;c<3;c++){
         if(c==1){continue; }
         x[c]= (x[c]*coseno)-(y[c]*seno);
         y[c]= (x[c]*seno)+(y[c]*coseno);
         
         System.out.println(" x e y nuove "+ x[c] +"  "+ y[c]);
     }
      
      
   }*/
    
   
   public void triangolo(){
    int st;
       Scanner scan= new Scanner(System.in);
        distanzapunti lat= new distanzapunti();
      int [] x= new int[3];    //creo due array, uno per le coordinate dei vertici di x e uno di y
      int [] y= new int[3];
      System.out.println("inserici le coordinate dei vertici della base: ");
      for(int c=0;c<2;c++){                                         //inserisco le coordinate della base attraverso un ciclo for
          st=c+1;
          System.out.println("x"+st+": ");      //la variabile st serve solo per far capire all'utente quale coordinata sta immettendo
          x[c]=scan.nextInt();
          System.out.println("y"+st+": ");
          y[c]=scan.nextInt();       
      }
      System.out.println("base creata con successo, inserisci le coordinate x e y mancanti: ");
    x[2]=scan.nextInt();    //inserisco le coordinate del vertice mancante
    y[2]=scan.nextInt();
          //creo un int che verrà utilizzato per stampare se il triangolo è isosciele, o ....
   double[] lati = new double[3];
   lati[0]=lat.distanza(x[0], y[0], x[1], y[1]);   //creo i lati per verificare se il triangolo sia isoscelle equi.....
   lati[1]=lat.distanza(x[1], y[1], x[2], y[2]);    
   lati[2]=lat.distanza(x[0], y[0], x[2], y[2]);
   String carlat= "";
   if(lati[0] == lati[1] && lati[1] == lati[2]){
    carlat="equilatero";
   }else if(lati[0] == lati[1] || lati[1] == lati[2] || lati[0]== lati[2]){
       carlat="isosciele";
       
   }else{
       carlat="scaleno";
   }
   double perimetro= lati[0]+lati[1]+lati[2];
   double area= sqrt(perimetro/2)*(perimetro/2-lati[0])*(perimetro/2-lati[1])*(perimetro/2-lati[2]);  //calcolo l'area con la formula di erone
  System.out.println("i dati del tuo triangolo sono:");
  System.out.println("il triangolo che hai creato è "+carlat);
  System.out.println("il perimetro misura: "+perimetro);
  System.out.println("l'area misura: "+area);
  
  
  
  
   
   
   
   }
    
}