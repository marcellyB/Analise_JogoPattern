/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mixpattern;

/**
 *
 * @author Marcelly
 */
public class Terra implements Estrategia
{
    private static Terra instancia = null;
    
    private Terra(){}
    
    public static Terra getInstancia()
    {        
        //instancia = null;
        
        if(instancia == null)
        {                    
            instancia = new Terra();
            System.out.println("Cenário Terra foi criado. (" + instancia.toString() + ")");
        }
            
        else
        {
            System.out.println("Cenário Terra foi reutilizado. (" + instancia.toString() + ")");
        }
        return instancia;
    }

    @Override
    public void apertarBarraEspaco() 
    {
        System.out.println("Você está Saltando!! \n");
    }
}
     
