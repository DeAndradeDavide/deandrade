/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author davide.deandrade
 */
public class Persona5Test {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Persona5 p = new Persona5(1.8, "congnome", "nome", 80f, "12/12/1212");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
}