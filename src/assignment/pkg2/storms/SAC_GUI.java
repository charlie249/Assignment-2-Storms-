/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.storms;

import javax.swing.JFrame;

/**
 *
 * @author charlie
 */
public class SAC_GUI extends JFrame {
    
    
    public SAC_GUI(Company SAC)
    {
        // layout
        
        
        // add list box
        
        
        // give storms to list box
        
        
        // listen to list item being clicked
        
           // show editor for this list item
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        
        // create company
        Company SAC = new Company();
        
        // look how your sample code createa a new frame
        SAC_GUI frame = new SAC_GUI(SAC);
        frame.pack();
        
    }
    
}
