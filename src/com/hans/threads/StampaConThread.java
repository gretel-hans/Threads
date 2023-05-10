package com.hans.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StampaConThread extends Thread {
   private Logger log=LoggerFactory.getLogger(StampaConThread.class);
   private char simbolo;

    public StampaConThread(char simbolo){
        this.simbolo=simbolo;
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            try{
                System.out.println( (i+1)+ " : "+ this.simbolo);
                Thread.sleep(1000);

            }catch(Exception e){
                log.warn("ERRORE!");
            }
        }
    }
}
