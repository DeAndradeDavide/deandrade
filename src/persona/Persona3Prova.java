 package persona;

/**
 *
 * @author davide.deandrade
 */
public class Persona3Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona3 p1 = new Persona3();
        Persona3 p2 = new Persona3(1.80, "cognome", "nome", 70f);
        p2.setDataDiNascita("11/10/2000");
        String info = p2.info();
        System.out.print(info);
        
        p2.calcoloEta(p2.getDataDiNascita());
        
    }
    
}
