/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import excepcionesPersonalizadas.MiExcepcionGenerica;
import excepcionesPersonalizadas.MiExcepcionNumerica;

/**
 *
 * @author Piero354
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
         String ValorNumerico = "16ñl";
         int numero = Utilitario.convertir(ValorNumerico);
         System.out.println("El número es: " + numero);
            
        }catch (MiExcepcionNumerica e){
            //Con el comando err el código se imprime en rojo.
            System.err.println(e.getMessage());
            
        } catch (MiExcepcionGenerica e){
            
            System.err.println(e.getMessage());
        }
    }
}
