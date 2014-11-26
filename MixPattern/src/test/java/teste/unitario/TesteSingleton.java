package teste.unitario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import jogo.strategy.Agua;
import junit.framework.TestCase;
import org.junit.Test;


/**
 *
 * @author Marcelly
 */
public class TesteSingleton extends TestCase
{
    
    public TesteSingleton() 
    {
        
    }
    private String esperadoAgua;
    private String atualAgua;
    
    
    public TesteSingleton(String testName)
    {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception 
    {
        System.out.println("Antes...");
        super.setUp();
    }
   
    
    @Override
    protected void tearDown() throws Exception 
    {
        System.out.println("Depois...\n");
        super.tearDown();
    }

    @Test
    public void testGetInstanceCenarioAgua() 
    {
        
        atualAgua = Agua.getInstancia().toString();
        esperadoAgua = Agua.getInstancia().toString();
        assertEquals(esperadoAgua, atualAgua);
        
    }
    
}
