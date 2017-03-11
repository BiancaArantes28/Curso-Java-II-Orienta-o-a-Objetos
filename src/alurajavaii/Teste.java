/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alurajavaii;

/**
 *
 * @author Bianca Arantes
 */
public class Teste {
    
    public void inverte(String texto) {
            for (int i = texto.length() - 1; i >= 0; i--) {
                System.out.print(texto.charAt(i));
            }
            System.out.println("");
        }
    public void bagunca(String texto){
        String[] bag = texto.split(" "); 
        for(int i = bag.length - 1; i>=0;i--){
            System.out.print(bag[i] + " ");
        }
        System.out.println(" ");
    }
    
}
