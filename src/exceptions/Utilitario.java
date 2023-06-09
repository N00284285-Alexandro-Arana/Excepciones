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
public class Utilitario {
    
    // Esta función permite converitr un texto en número y 
    //controlar los errores que se pueden presentar a partir de ello.
    //numeroEnTexto
    public static int convertir(String numeroEnTexto)
            throws MiExcepcionNumerica, MiExcepcionGenerica{
        
        try{
        return Integer.parseInt(numeroEnTexto);
        }catch(NumberFormatException s){
            throw new MiExcepcionNumerica();
        }catch(Exception ex){
            throw new MiExcepcionGenerica();   
        }
    } 
}
