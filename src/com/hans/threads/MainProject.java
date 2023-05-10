package com.hans.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainProject {
	public static Logger log = LoggerFactory.getLogger(MainProject.class);

	public static void main(String[] args) {

		StampaConThread s1 = new StampaConThread('*');
		StampaConThread s2 = new StampaConThread('#');

		SommaConThread st1 = new SommaConThread();
		SommaConThread st2 = new SommaConThread();
		SommaConThread st3 = new SommaConThread();
		SommaFinaleConThread s = new SommaFinaleConThread();

		// s1.start();
		// s2.start();

		int[] arrayNumeri = new int[3000];
		for (int i = 0; i < arrayNumeri.length; i++) {
			arrayNumeri[i] = (int) (Math.random() * 100);
			//System.out.println((i + 1) + " : " + arrayNumeri[i]);
		}

		for (int i = 0; i < 1000; i++) {
			st1 = new SommaConThread(arrayNumeri[i]);
			st1.start();
			try {
				st1.join();
				s.somma(st1.ritornaSomma());
			} catch (Exception e) {
				log.warn("ERRORE "+e);
			}
		}

		for (int i = 1000; i < 2000; i++) {
			st2 = new SommaConThread(arrayNumeri[i]);
			st2.start();
			try {
				st2.join();
				s.somma(st2.ritornaSomma());
			} catch (Exception e) {
				log.warn("ERRORE "+e);
			}
			
		}

		for (int i = 2000; i < 3000; i++) {
			st3 = new SommaConThread(arrayNumeri[i]);
			st3.start();
			try {
				st3.join();
				s.somma(st3.ritornaSomma());
			} catch (Exception e) {
				log.warn("ERRORE "+e);
			}
		}

		try {
			st1.join();
			st2.join();
			st3.join();
			s.ritornaTotale();
		} catch (Exception e) {
			log.warn("ERRORE "+e);
		}
		



		
		RegistroPresenze u1=new RegistroPresenze("Hansel","Adjei",10);
		u1.scriviNelRegistro(u1);
		

	}

}
