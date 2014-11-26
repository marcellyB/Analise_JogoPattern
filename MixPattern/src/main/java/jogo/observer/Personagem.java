/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.observer;

import com.mycompany.mixpattern.Estrategia;
import com.mycompany.mixpattern.Terra;

/**
 *
 * @author Luis
 */
public class Personagem implements Observer{
    
    Estrategia estrategiaAtual;
    Terra terra = Terra.getInstancia();
    
    public Personagem(){
        this.estrategiaAtual = terra;
    }
    
    @Override
    public void notificarCenarioAtual(String cenario) {       
        System.out.println(cenario);   
    }

    public Estrategia getEstrategiaAtual() {
        return estrategiaAtual;
    }

    public void setEstrategiaAtual(Estrategia estrategiaAtual) {
        this.estrategiaAtual = estrategiaAtual;
    } 
    
}
