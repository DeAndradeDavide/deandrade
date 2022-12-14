/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona2;

/**
 *
 * @author valerio.gravili
 */
public class ProvaPersona2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona2 p=new Persona2();
        Persona2 p2=new Persona2(1.80, "Gravili","12/12/2000", "Valerio", 70f);
        Persona2 p3=new Persona2(1.80, "Gravili","12/11/2000", "Valerio", 70f);
        Persona2 p4=new Persona2(p2);
        String info= p4.info();
        System.out.println(info);
        System.out.println(p2.verificaOmonimia(p3));
        
        
    }
    
}
