/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author ekech
 */
public class TestUserprofile {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String userName = input.nextLine();

        System.out.println("Enter the name of your favourite actor: ");
        String favActor = input.nextLine();
        
        
        
        System.out.println("Hello! " + userName + " your user profile has been created");
    }
        
     
 
    
   
}
