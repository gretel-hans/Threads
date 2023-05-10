package com.hans.threads;

public class SommaConThread extends Thread {
    private int n;
    static public int somma=0;
    public SommaConThread(int n){
        this.n=n;
    }
    public SommaConThread(){
        
    }


    public int ritornaSomma(){
        return this.somma;
    }

    @Override
    public void run(){
        this.somma+=this.n;
       // System.out.println("Somma= "+this.somma);
    }
}
