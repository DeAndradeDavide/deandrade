
package SchedaPersonaggioDandD;

/**
 * Creazione di una scheda personaggio di Dungeons and Dragons
 * @author davide.deandrade
 */
public class SchedaPersonaggioDandD {
    
    public String nome;
    public String sesso;
    public String razza;
    public String caratterePersonaggio;
    private String classe;
    private String coloreCapelli;
    private String coloreOcchi;
    private Float altezza;
    private Integer armatura;
    private Integer intelligenza;
    private Integer dannoFisico;
    private Integer dannoMagico;
    
    
    /**
     * Costruttore senza parametri
     */
    public SchedaPersonaggioDandD() {
    }

    
    /**
     * Costruttore con parametri
     * @param nome
     * @param sesso
     * @param razza
     * @param caratterePersonaggio
     * @param classe
     * @param coloreCapelli
     * @param coloreOcchi
     * @param altezza
     * @param armatura
     * @param intelligenza
     * @param dannoFisico
     * @param dannoMagico 
     */
    public SchedaPersonaggioDandD(String nome, String sesso, String razza, String caratterePersonaggio, String classe, String coloreCapelli, String coloreOcchi, Float altezza, Integer armatura, Integer intelligenza, Integer dannoFisico, Integer dannoMagico) {
        this.nome = nome;
        this.sesso = sesso;
        this.razza = razza;
        this.caratterePersonaggio = caratterePersonaggio;
        this.classe = classe;
        this.coloreCapelli = coloreCapelli;
        this.coloreOcchi = coloreOcchi;
        this.altezza = altezza;
        this.armatura = armatura;
        this.intelligenza = intelligenza;
        this.dannoFisico = dannoFisico;
        this.dannoMagico = dannoMagico;
    }
    
    /**
     * Restituisce il nome del personaggio
     * @return nome
     */
    public String getNome() {
        if (nome != null)
            if (nome.length() >= 2)
                return nome;
        return null;
    }
    
    /**
     * 
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * 
     * @return sesso
     */
    public String getSesso() {
        return sesso;
    }
    
    /**
     * 
     * @param sesso 
     */
    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public String getCaratterePersonaggio() {
        return caratterePersonaggio;
    }

    public void setCaratterePersonaggio(String caratterePersonaggio) {
        this.caratterePersonaggio = caratterePersonaggio;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getColoreCapelli() {
        return coloreCapelli;
    }

    public void setColoreCapelli(String coloreCapelli) {
        this.coloreCapelli = coloreCapelli;
    }

    public String getColoreOcchi() {
        return coloreOcchi;
    }

    public void setColoreOcchi(String coloreOcchi) {
        this.coloreOcchi = coloreOcchi;
    }

    public Float getAltezza() {
        return altezza;
    }

    public void setAltezza(Float altezza) {
        this.altezza = altezza;
    }
    
    
    public void Statistiche(Integer armatura, Integer intelligenza, Integer dannoFisico, Integer dannoMagico){        
        
        System.out.println("Inserisci armatura:");
        this.armatura = armatura;
     
    }
    /**
     * Stampa le caratteristiche del personaggio
     * @return 
     */
    public String infoPersonaggio(){
        String testo;
        
        testo = "Nome                  : " + this.nome       + "\n" +
                "Sesso                 : " + this.sesso       + "\n" +
                "Razza                 : " + this.razza       + "\n" +
                "Classe                : " + this.classe + "\n" +
                "Colore capelli        : " + this.coloreCapelli     + "\n" +
                "Colore occhi          : " + this.coloreOcchi  + "\n" +
                "Armatura              : " + this.armatura      + "\n" +
                "Intelligenza          : " + this.intelligenza      + "\n" +
                "Danno fisico          : " + this.dannoFisico      + "\n" +
                "Danno magico          : " + this.dannoMagico      + "\n" +
                "Carattere personaggio : " + this.caratterePersonaggio + "\n";
        return testo;
    }
}
