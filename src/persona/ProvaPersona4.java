/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import persona.Persona4;

/**
 *
 * @author valerio.gravili
 */
public class ProvaPersona4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona4 p=new Persona4();
        Persona4 p2=new Persona4(1.80, "Gravili","12/12/2000", "Valerio", 70f);
        Persona4 p3=new Persona4(1.80, "Gravili","12/11/2000", "Valerio", 70f);
        Persona4 p4=new Persona4(p2);
        String info= p4.info();
        System.out.println(info);
        System.out.println(p2.verificaOmonimia(p3));
        
        
    }
    
}
