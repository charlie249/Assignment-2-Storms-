/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.storms;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author charlie
 */
public abstract class Storm {
    String name;
    int windSpeed;
    int temp;
   
    public abstract String getWarning();
    
    public void setName(String nameIn) 
    {
        name = nameIn;
    }
    
    public String toString()
    {
        return name + " " + windSpeed + " " + temp;
    }
    
    public void setWindSpeed(int windSpeedIn)
    {
      windSpeed = windSpeedIn;
    }  
    
    public void setTemp(int tempIn)
    {
        temp = tempIn;
    }

      
    public String getName()
    {
        return name;
    }
    
    public int getWindSpeed()
    {
        return windSpeed;
    }
    
    public int getTemp()
    {
        return temp;
    }
    
    public void edit()
    {
        System.out.println("Enter the new name of the storm: ");
        Scanner scanIn = new Scanner(System.in);
        setName(scanIn.nextLine());
        
        System.out.println("Enter the storms new windspeed: ");
        setWindSpeed(Integer.parseInt(scanIn.nextLine()));
        
        System.out.println("Enter the storms new temperature: ");
        setTemp(Integer.parseInt(scanIn.nextLine()));
    }

   
    public static class Tornado extends Storm
    {
            public String getWarning()
            {
                String result;
                if(windSpeed > 261)
                {
                    result = "This is an F5 Tornado. " + 
                            "You are advised to find underground shelter immediately, crouch near to the floor covering your head with your hands.";
                }   
                else if( windSpeed >= 206)
                {
                    result = "This is an F4 Tornado. " + 
                            "You are advised to find underground shelter as soon as possible, crouch near to the floor covering your head with your hands.";
                }
                else if(windSpeed >= 158)
                {
                    result = "This is an F3 Tornado. " + 
                    "You are advised to find underground shelter quickly, crouch near to the floor covering your head with your hands.";
                }
                else if( windSpeed >= 113)
                {
                    result = "This is an F2 Tornado " + 
                            "You are advised to find underground shelter, crouch near to the floor covering your head with your hands.";
                }
                else if(windSpeed >= 73)
                {
                    result = "This is an F1 Tornado " + 
                    "Find a safe room/ shelter immediately, and shield yourself from debris";
                }
                else if(windSpeed >= 40)
                {
                   result = "This is an F0 Tornado" + 
                           "Find a safe room/ shelter as soon as possible, and shield yourself from debris";
                }
                else
                {
                    result = "This is an unclassified Tornado " +
                             "There is no need to panic.";
                }
                  
                return result;
            }

    }
    
    public static class Hurricane extends Storm
    {
            public String getWarning()
            {
                String result;
                if(windSpeed > 156)
                {
                  result = "Catagory five Hurricane!!!!! " +
                 "You are advised to evacuate as soon as possible.";
                }
                else if( windSpeed >= 130)
                {
                    result = "Catagory four Hurricane!!!! " +
                    "You are advised to evacuate as soon as possible.";
                }
                else if(windSpeed >= 111)
                {
                   result = "This is a catagory three Hurricane. " + 
                     "If you live in a coastal region you are advised to evacuate.";
                }
                else if(windSpeed >= 96)
                {
                    result = "This is a catagory two Hurricane. " +
                            "You are advised to close storm shutters and stay away from your windows.";     
                }
                else if(windSpeed >= 74)
                {
                   result = "This is a category one Hurricane. " +
                   "You are advised to close storm shutters and stay away from your windows.";
                }
                else
                {
                    result = "This is a tropical Storm. " +
                    "You are advised to close storm shutters and stay away from your windows.";
                }
                return result;
            }
        
    }
    
    public static class Blizzard extends Storm
    {
            public String getWarning()
            {
                String result;
                if(windSpeed >= 45 && temp <= -12 )
                {
                   result = "This is a Servere Blizzard " +
                    "Keep warm and avoid travel at all costs";
                }
                else if(windSpeed >= 35)
                {
                    result = "This is a Blizzard " + 
                  "Keep warm and do not travel unless you have to";
                }
                else 
                {
                    result = "This is a Snow Storm " + 
                    "Take care and avoid travel if possible";
                }
                return result;
            }
        
    }
    
    public void print()
    {
        System.out.println("This storm is called: " + getName()); 
        System.out.println("The temperature of this storm is: " + getTemp() + " degrees.");
        System.out.println("The windspeed of this storm is: " + getWindSpeed() + "mph.");
    }


}
