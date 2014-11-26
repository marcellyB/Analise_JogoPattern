/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.factory;

import jogo.strategy.Agua;
import jogo.strategy.Estrategia;
import jogo.strategy.Terra;

/**
 *
 * @author Marcelly
 */
public class Factory
{
    public Estrategia criarEstrategia(String cenario) throws Exception
    {
        
        if(cenario.equalsIgnoreCase("agua"))
        {
            Agua agua = Agua.getInstancia();
            return agua;
        }
        else if(cenario.equalsIgnoreCase("terra"))
        {
            Terra terra = Terra.getInstancia();
            return terra;
        }
        
        throw new Exception("Cenário inexistente!");
    }
}
