/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona2;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *La classe persona indica alcune caratteristiche dell'essere umano
 * @author valerio.gravili
 * @version 1.0 del 28/09/22
 */

public class Persona2 {
    public Double altezza;
    public String cognome;
    public String dataDiNascita;
    public String nome;
    public Float  peso;
    private static Integer numeroIstanze=0;
    
    /**
     * Costruttore della classe persona senza i parametri per impostare i parametri
     * si possono usare i seguenti metodi:
     * {@link #setAltezza(Double altezza)} <br>
     * {@link #setCognome(String cognome)} <br> {@link #setNome(String nome)}
     * <br> {@link #setPeso(Float peso)} <br>
     * {@link #setDataDiNascita(String dataDiNascita)}
     */
    
    public Persona2() {
        numeroIstanze=numeroIstanze+1;
    }
    /**
     * 
     * @param altezza
     * @param cognome
     * @param dataDiNascita
     * @param nome
     * @param peso 
     */

    public Persona2(Double altezza, String cognome, String dataDiNascita, String nome, Float peso) {
        setDataDiNascita(dataDiNascita);
        setPeso(peso);
        setNome(nome);
        setCognome(cognome);
        setAltezza(altezza);
        numeroIstanze=numeroIstanze+1;
    }
    public Persona2(Persona2 persona){
    this(persona.getAltezza(),persona.getCognome(),persona.getDataDiNascita(),persona.getNome(),persona.getPeso());
    }
    /**
     * restituisce l'altezza
     * 
     * @return altezza
     */

    public Double getAltezza() {
        return altezza;
    }

    public static Integer getNumeroIstanze() {
        return numeroIstanze;
    }
    /**
     * imposta l'altezza della persona
     * @param altezza 
     */

    public void setAltezza(Double altezza) {
    boolean v=true;
    if(calcolaEta()!=null){
        if(calcolaEta()<10){
            if(altezza<0.5||altezza>1){
            v=false;
        }
        }if(calcolaEta()>=10){
            if (altezza<1.0||altezza>2.0){
                v=false;
            }        
        }
    
    }
    
    if(v==true){
        this.altezza=altezza;
    }
    
        
        
    }
    /**
     * restituisce il cognome
     * 
     * @return cognome
     */

    public String getCognome() {
        return cognome;
    }
    /**
     * imposta il cognome della persona
     * 
     * @param cognome 
     */

    public void setCognome(String cognome) {
        boolean v=true;
        if(cognome!=null){
        for(int i=0; i<cognome.length(); i++){
        if(i==0){
        if(cognome.charAt(i)<65||cognome.charAt(i)>90){
            v=false;
        }
        }
        if(i!=0){
            if(cognome.charAt(i)<97||cognome.charAt(i)>122){
            v=false;
        }
        }
        }
        }
        if(v==true){
        this.cognome = cognome;
        }
    }
    /**
    * Restituisce la data di nascita della Persona
    *
    * @return dataDiNascita
    */

    public String getDataDiNascita() {
        return dataDiNascita;
    }
    /**
    * Imposta la data di nascita della Persona
    * 
    * @param dataDiNascita Data di nascita
    */
    public Integer[] calcolaId(){
    ZoneId z = ZoneId.of("Europe/Rome");
        ZonedDateTime zdt = ZonedDateTime.now(z);     
        Integer data[]=new Integer [3];
        data[0]=zdt.getDayOfMonth();
        data[1]=zdt.getMonthValue();
        data[2]=zdt.getYear();
    return data;
    }
    public void setDataDiNascita(String dataDiNascita) {
        Integer attuale[]=calcolaId();
        Boolean verifica=true;
        String[] splitted = dataDiNascita.split("/");
        int intero[]=new int[splitted.length];
        for(int i=0; i<splitted.length; i++ ){
        intero[i] = Integer.parseInt(splitted[i]);
        }
        for(int i=0; i<splitted.length; i++ ){
            if (i==0){
                if(32<intero[i]){
                verifica=false;
                }
                if(intero[1]==2&&intero[i]>29){
                    verifica=false;
                }
                if(intero[1]==4&&intero[i]==31||intero[1]==6&&intero[i]==31||intero[1]==9&&intero[i]==31||intero[1]==11&&intero[i]==31){
                    verifica=false;
                }           
            }
            if(i==1){
                if(intero[i]>12){
                   verifica=false; 
                }               
            }
            if(i==2){
                if(intero[i]<1000){
                verifica=false;
                }
        }
        
        
    }
        if (intero[0]>attuale[0]&&intero[1]==attuale[1]&&intero[2]==attuale[2]){
            verifica=false;
        }
        if (intero[1]>attuale[1]&&intero[2]==attuale[2]){
            verifica=false;
        }
        if (intero[2]>attuale[2]){
            verifica=false;
        }
        if(verifica==true){
            this.dataDiNascita = dataDiNascita;
        } 
        
      
    }
    public Integer calcolaEta() {
        Integer eta=null;
        Integer attuale[]=calcolaId();
        Boolean falso=true;
        if (dataDiNascita!=null){
        String[] splitted = dataDiNascita.split("/");
        int intero[]=new int[splitted.length];
        for(int i=0; i<splitted.length; i++ ){
        intero[i] = Integer.parseInt(splitted[i]);
        }
        if (intero[1]<attuale[1]){
            falso=false;
        }
        if(intero[0]<attuale[0]&&intero[1]<=attuale[1]){
            falso=false;
        }
        if (falso==true){
            eta=attuale[2]-intero[2]-1;
        }else{
            eta=attuale[2]-intero[2];
        }                                                                                                                                                
        }
        return eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {      
        boolean v=true;
        if(nome!=null){
        for(int i=0; i<nome.length(); i++){
        if(i==0){
        if(nome.charAt(i)<65||nome.charAt(i)>90){
            v=false;
        }
        }
        if(nome.charAt(i)==32){
            if(nome.charAt(i+1)<65||nome.charAt(i)>90){
            v=false;
        }
        }
        }
        }
        if(v==true){
        this.nome = nome;
        }
        
        
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        if(peso>2 && peso<100){
        this.peso = peso;
        
        }
        
    }
    public boolean verificaOmonimia(Persona2 persona){
    boolean v=true;
    if(!this.nome.equals(persona.getNome())){
        v=false;   
    }
    if(!this.cognome.equals(persona.getCognome())){
        v=false;   
    }
    return v;
    }
    public String info(){
        Integer eta=calcolaEta();
        
        String testo="ciao";
        testo=(this.cognome!=null ? "cognome       : " + this.cognome :"cognome       : ")+ "\n"
             +(this.nome!=null ? "nome          : " + this.nome :"nome          : ")+ "\n"
             +(this.altezza!=null ? "altezza       : " + this.altezza :"altezza       : ")+ "\n"
             +(this.peso!=null ? "peso          : " + this.peso :"peso          : ")+ "\n"
             +(this.dataDiNascita!=null ? "data nascita  : "+this.dataDiNascita:"data nascita  : ")+"\n"
             +(eta!=null ? "eta           : "+eta:"eta           : ")+"\n";
        return testo;
    }
    
    /**
     * @param args the command line arguments
     */    
}

