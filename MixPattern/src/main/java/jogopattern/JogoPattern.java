/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogopattern;

import jogo.strategy.Estrategia;
import java.util.Scanner;
import jogo.factory.Factory;
import jogo.observer.Cenario;
import jogo.observer.Personagem;

/**
 *
 * @author Luis
 */
public class JogoPattern {
    
    public static void main(String[] args) {
        
        String leitor;
        Scanner scanner = new Scanner(System.in);
        
        Cenario cenario = new Cenario();
        Personagem personagem = new Personagem();
        cenario.addObserver(personagem);
        
        System.out.println("\nENTRADAS POSSÍVEIS: ( agua ) | ( terra ) | ( exit )\n");
        
        do{
            System.out.print("Digite um cenário: ");
            leitor = scanner.next();
            
            if(leitor.equalsIgnoreCase("exit"))
                break;
            
            
            
            Factory factory = new Factory();
            Estrategia estrategia;
            try{
                estrategia = factory.criarEstrategia(leitor);
                cenario.setCenario(leitor);
                estrategia.apertarBarraEspaco();            
            }
            catch(Exception ex){
                System.out.println("Erro: " + ex.getMessage() + "\n");
            }            
            
        }while(true);      
        
    }
    
}
