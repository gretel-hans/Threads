package com.hans.threads;

public class SommaFinaleConThread extends Thread {
private int somma;

public void somma(int n){
    this.somma+=n;
}
public SommaFinaleConThread(){
  
}

public void ritornaTotale(){
    System.out.print("La somma totale alla fine è: "+this.somma);
}



}
