package persona;

/**
 *
 * @author davide.deandrade
 */
public class Persona1Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona1 p1 = new Persona1();
        Persona1 p2 = new Persona1(1.80, "cognome", "32/09/2022", "nome", 70f);
        
        String info = p2.info();
        System.out.print(info);
    }
    
}
