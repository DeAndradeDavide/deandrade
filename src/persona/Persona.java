package persona;

/**
 * La classe Persona definisce alcune caratteristiche di un essere umano
 * 
 * @author davide.deandrade
 * @version 1.0 28/09/2022
 */
public class Persona {
    
    public Double altezza;
    public String cognome;
    public String dataDiNascita;
    public String nome;
    public Float  peso;
    
    /**
     * Costruttore della classe Persona senza parametri 
     */
    public Persona() {
    }
    
    /**
     * Costruttore della classe Presona con parametri
     * 
     * @param altezza Altezza
     * @param cognome Cognome 
     * @param dataDiNascita Data Di Nascita 
     * @param nome Nome
     * @param peso Peso
     */
    public Persona(Double altezza, String cognome, String dataDiNascita, String nome, Float peso) {
        this.altezza = altezza;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.nome = nome;
        this.peso = peso;
    }
    
    /**
     * Restituisce l'altezza della persona
     * @return altezza
     */
    public Double getAltezza() {
        return altezza;
    }
    
    /**
     * Imposta il valore dell'altezza della persona
     * @param altezza Altezza
     */
    public void setAltezza(Double altezza) {
        this.altezza = altezza;
    }
    
    /**
     * Restituisce il cognome della persona
     * @return cognome 
     */
    public String getCognome() {
        return cognome;
    }
    
    /**
     * Imposta il cognome della persona
     * @param cognome Cognome
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    /**
     * Restituisce la data di nascita della persona
     * @return dataDiNascita
     */
    public String getDataDiNascita() {
        return dataDiNascita;
    }
    
    /**
     * Imposta la data di nascita della persona
     * @param dataDiNascita DataDiNascita
     */
    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
    
    /**
     * Restituisce il nome della persona
     * @return nome
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Imposta il nome della persona
     * @param nome Nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Restituisce il peso della persona
     * @return peso
     */
    public Float getPeso() {
        return peso;
    }
    
    /**
     * Imposta il peso della persona
     * @param peso Peso
     */
    public void setPeso(Float peso) {
        this.peso = peso;
    }
    
    /**
     * Restituisce le informazione legate alla persona
     * @return Riepilogo Caratteristiche
     */
    public String info(){
        String info;
        
        info = "Altezza:         " + this.altezza       + "\n"  
             + "Cognome:         " + this.cognome       + "\n" 
             + "Data di nascita: " + this.dataDiNascita + "\n" 
             + "Nome:            " + this.nome          + "\n"
             + "Peso:            " + this.peso          + "\n";
        
        return info;
    }
}
