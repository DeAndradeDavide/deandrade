 package persona;

/**
 *
 * @author davide.deandrade
 */
public class Persona4Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona4 p1 = new Persona4(1.80, "cognome1", "nome1", 80f, "11/10/2000");
        Persona4 p2 = new Persona4(1.80, "cognome1", "nome1", 80f, "11/10/2000");
        
        System.out.println(p1.verificaOmonimia(p2));
        
        System.out.print(p1.info());
        
        
    }
    
}
