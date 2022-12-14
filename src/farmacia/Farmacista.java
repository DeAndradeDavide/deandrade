/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author davide.deandrade
 */
public class Farmacista {
    private String nome;
    private String cognome;
    private GestioneProdotti gpf;

    public Farmacista() {
        
    }

    public Farmacista(String nome, String cognome, GestioneProdotti gpf) {
        this.setNome(nome);
        this.setCognome(cognome);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public final void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public GestioneProdotti getGpf() {
        return gpf;
    }

    public void setGpf(GestioneProdotti gpf) {
        this.gpf = gpf;
    }
    
    
    
}
