package persona;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * La classe Persona1 definisce alcune caratteristiche di un essere umano
 *
 * @author davide.deandrade
 * @version 3.0 19/10/2022
 */
public class Persona4 {

    private Double altezza;
    private String cognome;
    private String nome;
    private Float peso;
    private String dataDiNascita;
    
    private static int numeroIstanze; //attributo statico, di classe

    /**
     * Costruttore della classe Persona senza parametri
     */
    public Persona4() {
        numeroIstanze++;
    }

    /**
     * Costruttore della classe Presona con parametri
     * 
     * @param altezza
     * @param cognome
     * @param nome
     * @param peso 
     * @param dataDiNascita 
     */
    public Persona4(Double altezza, String cognome, String nome, Float peso, String dataDiNascita) {
        this();
        
        setAltezza(altezza);
        setCognome(cognome);
        setNome(nome);
        setPeso(peso);
        setDataDiNascita(dataDiNascita);
        
        //numeroIstanze++; o this()
    }
    
    public Persona4(Persona4 persona){
        this.altezza =      persona.altezza; //copia
        this.cognome =      persona.cognome;
        this.nome=          persona.nome;
        this.peso=          persona.peso;
        this.dataDiNascita= persona.dataDiNascita;
        
        numeroIstanze++;
    }
    
    /**
     * Restituisce l'altezza della persona
     *
     * @return altezza
     */
    public Double getAltezza() {
        return altezza;
    }

    /**
     * Imposta il valore dell'altezza della persona
     *
     * @param altezza Altezza
     */
    public final void setAltezza(Double altezza) {
        if(altezza != null){
            if(calcoloEta()<=10){
                if(altezza>0.5 && altezza<1)
                    this.altezza = altezza;
                else
                    this.altezza = null;
            }else{
                if(altezza>1 && altezza<2)
                    this.altezza = altezza;
                else
                    this.altezza = null;
            }
        }
    }

    /**
     * Restituisce il cognome della persona
     *
     * @return cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il cognome della persona
     *
     * @param cognome Cognome
     */
    public final void setCognome(String cognome) {
        if(cognome != null){
            for(int i=0; i<cognome.length();i++)
                if((int)cognome.charAt(i)>=97 && (int)cognome.charAt(i)<=122)
                    this.cognome = cognome;
        }else{
            this.cognome = null;
        }
    }

    /**
     * Restituisce il nome della persona
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome della persona
     *
     * @param nome Nome
     */
    public final void setNome(String nome) {
        if(nome != null && (int)nome.charAt(0)>=65 && (int)nome.charAt(0)<=90)
            for(int i=0; i<nome.length();i++)
                if(nome.charAt(i) == (char)255 && (int)nome.charAt(i+1)<65 || (int)nome.charAt(i+1)>90){
                    this.nome = null;
                    break;
                }else
                    this.nome = nome;
        else
            this.nome = null;
    }
        
    /**
     * Restituisce il peso della persona
     *
     * @return peso
     */
    public Float getPeso() {
        return peso;
    }

    /**
     * Imposta il peso della persona
     *
     * @param peso Peso
     */
    public final void setPeso(Float peso) {
        int randomNumber1 = (int) ((Math.random() * 100))+1;
        int randomNumber2 = (int) ((Math.random() * 100))+1;
        
        if(peso>randomNumber1 && peso<randomNumber2)
            this.peso = peso;
        else
            this.peso = null;
    }

    /**
     * Restituisce la data di nascita della persona
     *
     * @return dataDiNascita
     */
    final public String getDataDiNascita() {
        return dataDiNascita;
    }

    /**
     * Imposta la data di nascita della persona
     *
     * @param dataDiNascita DataDiNascita
     */
    final public void setDataDiNascita(String dataDiNascita) {
        
        Calendar calendar = new GregorianCalendar();
        Date trialTime = new Date();
        calendar.setTime(trialTime);
        
        Boolean valida = false;
        String[] d = dataDiNascita.split("/");
        Integer data[] = new Integer[d.length];
        
        for (int i = 0; i < d.length; i++) {
            data[i] = Integer.valueOf(d[i]);
        }

        if (data[2] >= 0 && data[2] <= 9999) {
            switch (data[1]) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (data[0] >= 1 && data[0] <= 31) {
                        valida = true;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (data[0] >= 1 && data[0] <= 30) {
                        valida = true;
                    }
                    break;
                case 2:
                    if (data[2] % 400 == 0 || data[2] % 4 == 0 && data[2] % 100 != 0) {
                        if (data[0] >= 1 && data[0] <= 29) {
                            valida = true;
                        }

                    } else {
                        if (data[0] >= 1 && data[0] <= 28) {
                            valida = true;
                        }
                    }
                    break;
                default:
                    valida = false;
            }

        }
        if (valida == true) {
            this.dataDiNascita = dataDiNascita;
        }else{
            this.dataDiNascita = null;
        }
    }
    
    
    /**
     * Restituisce il nome della persona
     * 
     * @return numeroIstanze
     */
    public static int getNumeroIstanze() {
        return numeroIstanze;
    }
    //non si fa il set perchè è un attributo derivato
    
    public Integer calcoloEta(){
        Integer eta;
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendario = Calendar.getInstance();

        Date dateObj = calendario.getTime();
        String dataOggi = formato.format(dateObj);
        
        String[] data = dataDiNascita.split("/");
        
        Integer gg = Integer.valueOf(data[0]);
        Integer mm = Integer.valueOf(data[1]);
        Integer aaaa = Integer.valueOf(data[2]);
        
        String[] dOggi = dataOggi.split("/");
        
        Integer ggOggi = Integer.valueOf(dOggi[0]);
        Integer mmOggi = Integer.valueOf(dOggi[1]);
        Integer aaaaOggi = Integer.valueOf(dOggi[2]);
        
        eta = aaaaOggi - aaaa - 1;
        
        if(mm == mmOggi){
            if(gg <= ggOggi)
                eta = eta + 1;
        }
        
        if(mm < mmOggi)
                eta = eta + 1;
        
        return eta;
    }
    
    /**
     * Restituisce le informazione legate alla persona
     *
     * @return Riepilogo Caratteristiche
     */
    public String info() {
        String info;
        
        info =    "Altezza:         " + altezza + "\n"
                + "Cognome:         " + cognome + "\n"
                + "Data di nascita: " + this.dataDiNascita + "\n"
                + "Nome:            " + nome + "\n"
                + "Peso:            " + peso + "\n"
                + "Eta:             " + calcoloEta() + " anni\n"
                + "N.Istanze        " + numeroIstanze + "\n";

        return info;
    }
    
    public Boolean verificaOmonimia(Persona4 p){
        Boolean verifica = false;
        if (nome.equals(p.nome) && this.cognome.equals(p.cognome)){
            verifica = true;
        }
        return verifica;
    }
}