/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/**
 *
 * @author 75verifica16
 */
public class Libro {
    
    private String[] autori;
    private String casaEditrice;
    private Double costoFisso;
    private Integer nPagine;
    private String titolo;
    
    
    public Libro() {
    }

    public Libro(String titolo, String casaEditrice, String[] autori, Integer nPagine) {
        setAutori(autori);
        setCasaEditrice(casaEditrice);
        setTitolo(titolo);
        setnPagine(nPagine);
        
    }

    public String[] getAutori() {
        return autori.clone();
    }

    final public void setAutori(String[] autori) {
        
        int n=0;
        if(autori != null){
            for(int i=0; i<autori.length;i++){
                
                for(int j=0; j<autori[i].length(); j++)
                    if((int)autori[i].charAt(j) == 255)
                        n++;
                
                if(n%2==1)
                this.autori[i] = autori[i];
        
            }
        }
    }

    final public String getCasaEditrice() {
        return casaEditrice;
    }

    final public void setCasaEditrice(String casaEditrice) {
        boolean a = true;
        if(casaEditrice != null)
            for(int i=0; i<casaEditrice.length();i++)
                if(casaEditrice.charAt(i) == (char)255)
                    a = false;
        
        if(a)
        this.casaEditrice = casaEditrice;
    }

    final public void setCostoFisso(Double costoFisso) {
        this.costoFisso = 5.4;
    }

    final public Integer getnPagine() {
        return nPagine;
    }

    final public void setnPagine(Integer nPagine) {
        if(nPagine != null && nPagine%2==0)
            this.nPagine = nPagine;
    }

    final public String getTitolo() {
        return titolo;
    }

    final public void setTitolo(String titolo) {
        if(titolo != null){
            int s = (int)titolo.charAt(0);
            if(s>64 && s<91)
                this.titolo = titolo;
        }
    }
    
    public void ordinaAutori(){
       
        for(int i = 0; i<autori.length; i++){
            boolean flag = false;
            
            for(int j=0; j<autori[i].length(); j++){
                if(autori[j].charAt(0) > autori[j+1].charAt(0)){
                    String temp = autori[j];
                    autori[j] = autori[j+1];
                    autori[j+1] = temp;
                }
            }
            if(flag) break; 
        }
    }
    
    public Integer ContaAutori(){
    
        Integer n = 0;
        for(int i=0; i<autori.length;i++){                
                for(int j=0; j<autori[i].length(); j++)
                    if((int)autori[i].charAt(j) == 255)
                        n++;
                
        }
        return n;
    }
    
    private Double prezzo(){
        Double prezzo = costoFisso + (nPagine*0.01);
        
        return prezzo;
    }
    
    public String info(){
        
        String info = "Autore: " + autori
                    + "Casa Editrice:" + casaEditrice 
                    + "Costo libro" + prezzo() 
                    + "Numero pagine: " + nPagine 
                    + "Titolo:" + titolo;
        
        
        return info;
    }
}
