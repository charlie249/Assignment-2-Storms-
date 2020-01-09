/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.storms;
import java.util.Scanner;
/**
 *
 * @author charlie
 */
public class Company {
    
    
    Storm[] storms = new Storm[20];
    
    public Company ()
    {
        for(int i=0;i<20;i++)
        {
            storms[i] = null;
        }
    }
  
    public Storm newHurricane()
    {
        return newStorm(new Storm.Hurricane("Hurricane"), "Hurricane");
    }
    
    public Storm newBlizzard()
    {
        return newStorm(new Storm.Blizzard("Blizzard"), "Blizzard");
    }
    
    public Storm newTornado()
    {
        return newStorm(new Storm.Tornado("Tornado"), "Tornado");
    }
    
    public Storm newStorm(Storm storm, String name)
    {
        System.out.println("Enter the name of the " + name + ": ");
        Scanner scanIn = new Scanner(System.in);
        storm.setName(scanIn.nextLine());
        
        System.out.println("Enter the storms Wind Speed: ");
        storm.setWindSpeed(Integer.parseInt(scanIn.nextLine()));
        
        System.out.println("Enter the storms temperature: ");
        storm.setTemp(Integer.parseInt(scanIn.nextLine()));
        
        return storm;
    }

public Storm getStorm(String name)
{
    for (int i = 0; i < storms.length; i++ )
    {
        Storm thisStorm = storms[i];
        if(thisStorm != null)
        {
            boolean matches = thisStorm.getName().equals(name);
        
        if(matches == true)
        {
            return thisStorm;
        }
        }
    }
return null;
}

}