package com.hans.threads;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class RegistroPresenze {
	private Logger log=LoggerFactory.getLogger(StampaConThread.class);
    private static File file=new File("testFile/test.txt");
    private String nome;
    private String cognome;
    private int presenze;

    public RegistroPresenze(String nome, String cognome , int presenze){
        this.nome=nome;
        this.cognome=cognome;
        this.presenze=presenze;
    }

    public void scriviNelRegistro(RegistroPresenze utente){
        try {
        	String s=utente.nome + " " +utente.cognome +"@"+utente.presenze+"#";
			FileUtils.writeStringToFile(file, s,"UTF-8",true);
		} catch (IOException e) {
			log.warn("ERRORE" +e);
		}
    }

    
}
