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
public abstract class Storm {
    String name;
    int windSpeed;
    int temp;
    String type;
   
    public abstract String getWarning();
    
    public Storm(String typeIn)
    {
      type = typeIn;
    }
    
    public Storm(String typeIn, String nameIn, int windSpeedIn, int tempIn)
    {
        type = typeIn;
        name = nameIn;
        windSpeed = windSpeedIn;
        temp = tempIn;
    }
    
    public void setName(String nameIn) 
    {
        name = nameIn;
    }
    
    public String toString()
    {
        if(name != null)
            return type + ":" + name + " " + windSpeed + " " + temp;
        else
            return "Pending";
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
        
        try {
        System.out.println("Enter the storms new windspeed: ");
        setWindSpeed(Integer.parseInt(scanIn.nextLine()));
        }
        catch(NumberFormatException nfe) {
            System.out.println("Please enter an integer(number) for the new storms WindSpeed.");
        }
        try {
        System.out.println("Enter the storms new temperature: ");
        setTemp(Integer.parseInt(scanIn.nextLine()));
        }
         
         catch(NumberFormatException nfe) {
            System.out.println("Please enter an integer(number) for the new storms Temperature.");
        }
    }

    public String getType() {
        return type;
    }

   
    public static class Tornado extends Storm
    {

        public Tornado(String nameIn, int windSpeedIn, int tempIn) {
            super("Tornado", nameIn, windSpeedIn, tempIn);
        }

        Tornado() {
            super("Tornado");
        }
            public String getWarning()
            {
                String result;
                if(name == null){
                    result = "pending";
                }
                else if(windSpeed > 261)
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

        Hurricane(String name, int speed, int temp) {
            super("Hurricane", name, speed, temp);
        }

        Hurricane() {
            super("Hurricane");
        }
            public String getWarning()
            {
                String result;
                if(name == null){
                    result = "pending";
                }
                else if(windSpeed > 156)
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

        public Blizzard(String nameIn, int windSpeedIn, int tempIn) {
            super("Blizzard", nameIn, windSpeedIn, tempIn);
        }

        Blizzard() {
            super("Blizzard");
        }
            public String getWarning()
            {
                 String result;
                if(name == null){
                    result = "pending";
                }
                else if(windSpeed >= 45 && temp <= -12 )
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
        System.out.print("Type: " + getType()); 
        System.out.print(" Name: " + getName()); 
        System.out.print(" Temperature: " + getTemp() + " degrees.");
        System.out.println(" Windspeed: " + getWindSpeed() + "mph.");
    }


}
