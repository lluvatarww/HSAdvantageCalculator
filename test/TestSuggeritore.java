/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import it.derrik.Modello.Giocatore;
import it.derrik.Modello.Suggeritore;
import it.derrik.Vista.VistaPrincipale;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author derrik
 */
public class TestSuggeritore {
    
    public TestSuggeritore() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    VistaPrincipale vp = new VistaPrincipale();
    Giocatore giocatore1 = new Giocatore(30, 0, 4, 26, 0,0,"Ladro");
    Giocatore giocatore2 = new Giocatore(30,0,4,26,0,0,"Mago");
    Suggeritore suggeritore;
    
    @Before
    public void setUp() {
        suggeritore = new Suggeritore(giocatore1, giocatore2, vp);
    }
    
    @After
    public void tearDown() {
    }

    public void testSuggeritore(){
        
        
    }
   
}
