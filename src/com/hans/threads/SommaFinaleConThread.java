package com.hans.threads;

public class SommaFinaleConThread extends Thread {
private static int somma;

public void somma(int n){
    this.somma+=n;
}
public SommaFinaleConThread(){
  
}

public void ritornaTotale(){
    System.out.println("La somma totale alla fine è: "+this.somma);
}



}
