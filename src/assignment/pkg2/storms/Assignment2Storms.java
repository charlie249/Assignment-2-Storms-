/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.storms;

/**
 *
 * @author charlie
 */
import java.util.Scanner;

public class Assignment2Storms {

    /** get the choice from the user
     * 
     * @return values  1-8
     */
    private static int getChoice() {
        System.out.println("What do you wish to do. Please enter the corresponding number.");
        System.out.println("1: Add a Hurricane to the list");
        System.out.println("2: Add a Tornado to the list");
        System.out.println("3: Add a Blizzard to the list");
        System.out.println("4: View the current recorded storms");
        System.out.println("5: Edit a current storms data");
        System.out.println("6: View data about a current recorded storm");
        System.out.println("7: Remove a storm from the system");
        System.out.println("8: EXIT the system");

        try {
            Scanner scanner = new Scanner(System.in);
            int result = Integer.parseInt(scanner.nextLine());
            return result;
        } catch (NumberFormatException be) {
            System.out.println("Please enter a value");
            return 0;
        }

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Centre SAC = new Centre();

        int choice = getChoice();

        while (choice != 8) {
            if (choice > 0 && choice < 4) {
                Storm newStorm = null;
                if (choice == 1) {
                    newStorm = SAC.newHurricane();
                } else if (choice == 2) {
                    newStorm = SAC.newTornado();
                } else {
                    newStorm = SAC.newBlizzard();
                }

                for (int i = 0; i < SAC.storms.length; i++) {
                    Storm anotherStorm = SAC.storms[i];

                    if (anotherStorm == null) {
                        SAC.storms[i] = newStorm;
                        break;
                    } else {
                        System.out.println("Our system is busy at the moment, please try again later.");
                    }
                }
                
            } else if (choice == 4) {
                System.out.println("Here are all the recorded current storms: ");

                for (int i = 0; i < SAC.storms.length; i++) {
                    Storm thisStorm = SAC.storms[i];
                    if (thisStorm == null) {
                        System.out.println(i + " is empty");
                    } else {
                        thisStorm.print();
                    }
                }
                
            } else if (choice == 5) {
                System.out.println("Please enter the name of the storm you wish to edit.");
                Scanner newScanner = new Scanner(System.in);
                String stormName = newScanner.nextLine();
                Storm storm = SAC.getStorm(stormName);
                if(storm != null)
                {
                    storm.edit();                    
                }
                else
                {
                    System.out.println("This storm was not recorded on our system.");
                }
            } else if (choice == 6) {
                System.out.println("Which current recorded storm would you like to view data about? ");

                Scanner newScanner = new Scanner(System.in);
                String stormNumb = newScanner.nextLine();
                Storm storm = SAC.getStorm(stormNumb);
                if(storm != null)
                {
                    storm.print();
                    System.out.println(storm.getWarning());                    
                }
                else
                {
                    System.out.println("This storm was not recorded on our system.");
                }
            } else if (choice == 7) {
                System.out.println("Please enter the name of the storm that you wish to remove from the system.");

                Scanner inScan = new Scanner(System.in);
                String stormName = inScan.nextLine();

                boolean deleted = false;
                for (int i = 0; i < SAC.storms.length; i++) {
                    Storm thisStorm = SAC.storms[i];
                    if (thisStorm != null && stormName.equals(thisStorm.getName())) {
                        SAC.storms[i] = null;
                        System.out.println("Storm deleted");
                        deleted = true;
                    } else {
                    }
                }
                
                if(!deleted)                   
                    System.out.println("This storm was not recorded on our system.");

                
                
            } else if (choice == 8) {
                System.exit(0);
            }

            choice = getChoice();

        }
    }

}
