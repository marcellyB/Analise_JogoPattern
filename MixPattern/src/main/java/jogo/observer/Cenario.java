/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class Cenario {
    
    List<Observer> cenarios = new ArrayList<>();    
    private String cenario;
    private String mensagem;
    
    public Cenario(){
        this.mensagem = "Personagem seu cenário atual é: ";
    }

    public List<Observer> getCenarios() {
        return cenarios;
    }

    public void setCenarios(List<Observer> cenarios) {
        this.cenarios = cenarios;
    }

    public String getCenario() {
        return cenario;
    }

    public void setCenario(String cenario) 
    {
        this.cenario = cenario;        
        notificarTodos(cenario);
    }
    
    public void addObserver(Observer cenario)
    {
        cenarios.add(cenario);
    }   
    
    public void notificarTodos(String cenario)
    {
        cenario = this.mensagem + cenario;
        for(Observer o: cenarios)
        {
            o.notificarCenarioAtual(cenario);
        }
    }
    
    
    
}
