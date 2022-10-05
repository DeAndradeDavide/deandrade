package persona;

/**
 * La classe Persona1 definisce alcune caratteristiche di un essere umano
 *
 * @author davide.deandrade
 * @version 1.0 28/09/2022
 */
public class Persona2 {

    public Double altezza;
    public String cognome;
    public String nome;
    public Float peso;
    private String dataDiNascita;

    /**
     * Costruttore della classe Persona senza parametri
     */
    public Persona2() {
    }

    /**
     * Costruttore della classe Presona con parametri
     *
     * @param altezza Altezza
     * @param cognome Cognome
     * @param nome Nome
     * @param peso Peso
     */
    public Persona2(Double altezza, String cognome, String nome, Float peso) {
        this.altezza = altezza;
        this.cognome = cognome;
        this.nome = nome;
        this.peso = peso;
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
    public void setAltezza(Double altezza) {
        this.altezza = altezza;
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
    public void setCognome(String cognome) {
        this.cognome = cognome;
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
    public void setNome(String nome) {
        this.nome = nome;
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
    public void setPeso(Float peso) {
        this.peso = peso;
    }

    /**
     * Restituisce la data di nascita della persona
     *
     * @return dataDiNascita
     */
    public String getDataDiNascita() {
        return dataDiNascita;
    }

    /**
     * Imposta la data di nascita della persona
     *
     * @param dataDiNascita DataDiNascita
     */
    public void setDataDiNascita(String dataDiNascita) {

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
     * Restituisce le informazione legate alla persona
     *
     * @return Riepilogo Caratteristiche
     */
    public String info() {
        String info;

        info = "Altezza:         " + this.altezza + "\n"
                + "Cognome:         " + this.cognome + "\n"
                + "Data di nascita: " + this.dataDiNascita + "\n"
                + "Nome:            " + this.nome + "\n"
                + "Peso:            " + this.peso + "\n";

        return info;
    }
}
