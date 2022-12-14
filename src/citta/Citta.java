/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citta;

/**
 *
 * @author davide.deandrade
 */
public class Citta {
    
    private Persona4[] abitanti;
    private String nome;
    private Persona4 sindaco;
    private String superficie;

    public Citta() {
    }

    public Citta(Persona4[] abitanti, String nome, Persona4 sindaco, String superficie) {
        this.abitanti = abitanti;
        this.nome = nome;
        this.sindaco = sindaco;
        this.superficie = superficie;
    }

    public Persona4[] getAbitanti() {
        return abitanti;
    }

    public void setAbitanti(Persona4[] abitanti) {
        this.abitanti = abitanti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Persona4 getSindaco() {
        return sindaco;
    }

    public void setSindaco(Persona4 sindaco) {
        this.sindaco = sindaco;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }
    
    public Integer densitaPopolazione(){
        Integer densita=0;
        
        
        return densita;
    }
    
}
