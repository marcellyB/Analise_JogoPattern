/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mixpattern;

/**
 *
 * @author Luis
 */
public class Agua implements Estrategia{
    
    private static Agua instancia = null;
    
    private Agua(){}
    
    public static Agua getInstancia(){             
        
        // A LINHA ABAIXO COMENTADA CASO DESCOMENTADA FARÁ COM QUE O TESTE FALHE.
        //instancia = null;    
        
        if(instancia == null){
            synchronized(Agua.class){
                if(instancia == null){                    
                    instancia = new Agua();
                    System.out.println("Cenário Água foi criado. (" + instancia.toString() + ")");
                }
            }
        }
        else{
            System.out.println("Cenário Água foi reutilizado. (" + instancia.toString() + ")");
        }         
        return instancia;
    }

    @Override
    public void apertarBarraEspaco() {
        System.out.println("Você está Nadando...\n");
    }
    
}
