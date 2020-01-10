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
    /* @Test
    public void testGetHurrcane2WindSpeed() {
        Hurricane h2WS = new Hurricane();
        h2WS.setWindSpeed(140);
        h2WS.setTemp(34);
        Assert.assertEquals(140, h2WS.getWindSpeed());
    }
    /**
     * Test of getWarning method, of class Storm.
     */
   /* @Test
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
        Blizzard SS = new Blizzard("Steve", 34, -2);
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
        Blizzard SB = new Blizzard("Bertha", 78, -23);
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
        Blizzard B = new Blizzard("Belinda", 39, 12);
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
        Tornado U = new Tornado("Theresa", 39, 12);
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
        Tornado F0 = new Tornado("Timmothy", 58, 35);
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
        Tornado F1 = new Tornado("Tasha", 93, 8);
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
        Tornado F2 = new Tornado("Timmy", 127, 82);
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
        Tornado F3 = new Tornado("Tom", 167, 28);
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
        Tornado F4 = new Tornado("Tony", 237, 20);
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
        Tornado F5 = new Tornado("Terry", 280, 90);
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
        Hurricane h0 = new Hurricane("Harry", 60, 45);
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
        Hurricane h1 = new Hurricane("Heather", 86, 54);
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
        Hurricane h2 = new Hurricane("Henry", 100, 67);
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
        Hurricane h3 = new Hurricane("Katrina", 120, 34);;
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
        Hurricane h4 = new Hurricane("Hurk", 155, 32);
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
        Hurricane h5 = new Hurricane("Larry", 170, 13);
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
        Hurricane h7 = new Hurricane("Barry", 167, 12);
        Assert.assertEquals("Barry", h7.getName());
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
