package persona;

/**
 *
 * @author davide.deandrade
 */
public class Persona2Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona2 p1 = new Persona2();
        Persona2 p2 = new Persona2(1.80, "cognome", "nome", 70f);
        p2.setDataDiNascita("05/10/2022");
        String info = p2.info();
        System.out.print(info);
    }
    
}
