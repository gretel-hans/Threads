package com.hans.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainProject {
	public static Logger log = LoggerFactory.getLogger(MainProject.class);
	public static int  sommaFinale=0;

	public static void main(String[] args) {

		StampaConThread s1 = new StampaConThread('*');
		StampaConThread s2 = new StampaConThread('#');

		

		

		int[] arrayNumeri = new int[3000];
		for (int i = 0; i < arrayNumeri.length; i++) {
			arrayNumeri[i] = (int) (Math.random() * 100);
		}

		SommaConThread sm1=new SommaConThread(arrayNumeri,0,1000);
		SommaConThread sm2=new SommaConThread(arrayNumeri,1000,2000);
		SommaConThread sm3=new SommaConThread(arrayNumeri,2000,3000);
		
		SommaFinaleConThread s= new SommaFinaleConThread();
		
		
		try {
			s1.start();
			 s2.start();
			 s1.join();
			 s2.join();
			sm1.run();
			sm1.join();
			s.somma(sm1.ritornaSomma());
			sm2.run();
			sm2.join();
			s.somma(sm2.ritornaSomma());
			sm3.run();
			sm3.join();  
			s.somma(sm3.ritornaSomma());
			System.out.println("Totale somma Thread 1: "+sm1.ritornaSomma());
			System.out.println("Totale somma Thread 2: "+sm2.ritornaSomma());
			System.out.println("Totale somma Thread 3: "+sm3.ritornaSomma());
			s.ritornaTotale();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//RegistroPresenze u1=new RegistroPresenze("Hansel","Adjei",10);
		//u1.scriviNelRegistro(u1);
		

	}

}
