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
public class Farmacia {
    
    private String nome;
    private Farmacista[] dipendenti;
    private GestioneProdotti gp;

    public Farmacia() {
        this.gp = new GestioneProdotti();
    }
    
    public Farmacia(GestioneProdotti gp) {
        this.gp = new GestioneProdotti();
    }
    
    public Farmacia(String nome, Farmacista[] dipendenti, GestioneProdoti gp) {
        this(nome, dipendenti);
        this.setGp(gp);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public Farmacista[] getDipendenti() {
        return dipendenti.clone();
    }

    public void setDipendenti(Farmacista[] dipendenti) {
        this.dipendenti = dipendenti.clone();
        for(int i=0; i<dipendenti.length; i++){
            dipendenti[i].setGPF(gp);
        }
    }

    public GestioneProdotti getGp() {
        return gp;
    }

    public void setGp(GestioneProdotti gp) {
        this.gp = gp;
    }
    
    
    
}
