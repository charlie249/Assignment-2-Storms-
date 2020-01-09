/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.storms;

import assignment.pkg2.storms.Storm.Blizzard;
import assignment.pkg2.storms.Storm.Hurricane;
import assignment.pkg2.storms.Storm.Tornado;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author charlie
 */
public class StormTest {
    
    public StormTest() {
    }
     /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetHurrcane2WindSpeed() {
        Hurricane h2WS = new Hurricane();
        h2WS.setWindSpeed(140);
        h2WS.setTemp(34);
        Assert.assertEquals(140, h2WS.getWindSpeed());
    }
    /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetHurrcane1WindSpeed() {
        Hurricane h1WS = new Hurricane();
        h1WS.setWindSpeed(120);
        h1WS.setTemp(34);
        Assert.assertEquals(120, h1WS.getWindSpeed());
    }
     /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningBlizzardSS() {
        Blizzard SS = new Blizzard();
        SS.setWindSpeed(34);
        SS.setTemp(-2);
        System.out.println(SS.getWarning());
        Assert.assertEquals("This is a Snow Storm " + 
                    "Take care and avoid travel if possible",
                    SS.getWarning());
    }
     /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningBlizzardSB() {
        Blizzard SB = new Blizzard();
        SB.setWindSpeed(78);
        SB.setTemp(-23);
        System.out.println(SB.getWarning());
        Assert.assertEquals("This is a Servere Blizzard " +
                    "Keep warm and avoid travel at all costs",
                    SB.getWarning());
    }
    /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningBlizzardB() {
        Blizzard B = new Blizzard();
        B.setWindSpeed(39);
        B.setTemp(12);
        System.out.println(B.getWarning());
        Assert.assertEquals("This is a Blizzard " + 
                  "Keep warm and do not travel unless you have to",
                  B.getWarning());
    }
    /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningTornadoU() {
        Tornado U = new Tornado();
        U.setWindSpeed(39);
        U.setTemp(12);
        System.out.println(U.getWarning());
        Assert.assertEquals("This is an unclassified Tornado " +
                             "There is no need to panic.",
                             U.getWarning());
    }
    /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningTornadoF0() {
        Tornado F0 = new Tornado();
        F0.setWindSpeed(58);
        F0.setTemp(35);
        System.out.println(F0.getWarning());
        Assert.assertEquals("This is an F0 Tornado" + 
                           "Find a safe room/ shelter as soon as possible, and shield yourself from debris",
                           F0.getWarning());
    }
    /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningTornadoF1() {
        Tornado F1 = new Tornado();
        F1.setWindSpeed(93);
        F1.setTemp(8);
        System.out.println(F1.getWarning());
        Assert.assertEquals("This is an F1 Tornado " + 
                    "Find a safe room/ shelter immediately, and shield yourself from debris",
                    F1.getWarning());
    }
    /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningTornadoF2() {
        Tornado F2 = new Tornado();
        F2.setWindSpeed(127);
        F2.setTemp(82);
        System.out.println(F2.getWarning());
        Assert.assertEquals("This is an F2 Tornado " + 
                            "You are advised to find underground shelter, crouch near to the floor covering your head with your hands.", 
                             F2.getWarning());
    }
     /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningTornadoF3() {
        Tornado F3 = new Tornado();
        F3.setWindSpeed(167);
        F3.setTemp(28);
        System.out.println(F3.getWarning());
        Assert.assertEquals("This is an F3 Tornado. " + 
                    "You are advised to find underground shelter quickly, crouch near to the floor covering your head with your hands.", 
                    F3.getWarning());
    }
     /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningTornadoF4() {
        Tornado F4 = new Tornado();
        F4.setWindSpeed(237);
        F4.setTemp(20);
        System.out.println(F4.getWarning());
        Assert.assertEquals("This is an F4 Tornado. " + 
                            "You are advised to find underground shelter as soon as possible, crouch near to the floor covering your head with your hands.", 
                            F4.getWarning());
    }
     /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningTornadoF5() {
        Tornado F5 = new Tornado();
        F5.setWindSpeed(280);
        F5.setTemp(90);
        System.out.println(F5.getWarning());
        Assert.assertEquals("This is an F5 Tornado. " + 
                            "You are advised to find underground shelter immediately, crouch near to the floor covering your head with your hands.",
                            F5.getWarning());
    }
    
    /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningHurrcaneCat0() {
        Hurricane h0 = new Hurricane();
        h0.setWindSpeed(60);
        h0.setTemp(45);
        System.out.println(h0.getWarning());
        Assert.assertEquals("This is a tropical Storm. " +
                    "You are advised to close storm shutters and stay away from your windows.",
                    h0.getWarning());
    }
    
    /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningHurrcaneCat1() {
        Hurricane h1 = new Hurricane();
        h1.setWindSpeed(86);
        h1.setTemp(54);
        System.out.println(h1.getWarning());
        Assert.assertEquals("This is a category one Hurricane. " +
                   "You are advised to close storm shutters and stay away from your windows.",
                    h1.getWarning());
    }
    /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningHurrcaneCat2() {
        Hurricane h2 = new Hurricane();
        h2.setWindSpeed(100);
        h2.setTemp(67);
        System.out.println(h2.getWarning());
        Assert.assertEquals("This is a catagory two Hurricane. " +
                            "You are advised to close storm shutters and stay away from your windows.",
                            h2.getWarning());
    }
        /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningHurrcaneCat3() {
        Hurricane h3 = new Hurricane();
        h3.setWindSpeed(120);
        h3.setTemp(34);
        System.out.println(h3.getWarning());
        Assert.assertEquals("This is a catagory three Hurricane. " + 
                     "If you live in a coastal region you are advised to evacuate.",
                h3.getWarning());
    }

    /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningHurrcaneCat4() {
        Hurricane h4 = new Hurricane();
        h4.setWindSpeed(155);
        h4.setTemp(32);
        System.out.println(h4.getWarning());
        Assert.assertEquals("Catagory four Hurricane!!!! " +
                    "You are advised to evacuate as soon as possible.",
                h4.getWarning());
    }

        /**
     * Test of getWarning method, of class Storm.
     */
    @Test
    public void testGetWarningHurrcaneCat5() {
        Hurricane h5 = new Hurricane();
        h5.setWindSpeed(170);
        h5.setTemp(13);
        System.out.println(h5.getWarning());
        Assert.assertEquals("Catagory five Hurricane!!!!! " +
                 "You are advised to evacuate as soon as possible.", 
                h5.getWarning());
    }

    /**
     * Test of setName method, of class Storm.
     */
    @Test
    public void testSetName() {
    }

    /**
     * Test of setWindSpeed method, of class Storm.
     */
    @Test
    public void testSetWindSpeed() {
    }

    /**
     * Test of setTemp method, of class Storm.
     */
    @Test
    public void testSetTemp() {
    }

    /**
     * Test of getName method, of class Storm.
     */
    @Test
    public void testGetName() {
    }

    /**
     * Test of getWindSpeed method, of class Storm.
     */
    @Test
    public void testGetWindSpeed() {
    }

    /**
     * Test of getTemp method, of class Storm.
     */
    @Test
    public void testGetTemp() {
    }

    /**
     * Test of edit method, of class Storm.
     */
    @Test
    public void testEdit() {
    }

    /**
     * Test of print method, of class Storm.
     */
    @Test
    public void testPrint() {
    }

    
}
