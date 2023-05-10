package com.hans.threads;

public class SommaConThread extends Thread {
     private int somma=0;
    
    private int[] numeri;
    private int indiceFinale;
    private int indiceIniziale;
    

public SommaConThread(int[] numeri,int indiceIniziale, int indiceFinale){
        this.numeri=numeri;
        this.indiceIniziale=indiceIniziale;
        this.indiceFinale=indiceFinale;
    }


    public int ritornaSomma(){
        return this.somma;
    }

    @Override
    public void run(){
    	for(int i=this.indiceIniziale;i<this.indiceFinale;i++) {
    		this.somma+=this.numeri[i];
    	}
    	
    }
}
