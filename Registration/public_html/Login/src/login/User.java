/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.util.*;
import java.io.*;

/**
 *
 * @author Hannah
 */
public class User {
    
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String zip;
    private String phone;
    
    
    public User(){
        
    }
    
    public void getInfoForFile(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        firstName = s.nextLine();
        System.out.println("Please enter your last name: : ");
        lastName = s.nextLine();
        System.out.println("Please enter your email adress: ");
        email = s.nextLine();
        System.out.println("Please enter a password: ");
        password = s.nextLine();
        
    }
    
    public void getAdditionalInfoForFile(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your zip code: ");
        zip = s.nextLine();
        System.out.println("Please enter your phone number: ");
        phone = s.nextLine();
        
    }
    
    public void writeBasicInfoToFile() {
        try{
            PrintWriter out = new PrintWriter(new FileWriter("User_Info.txt"));
            out.println(firstName);
            out.println(lastName);
            out.println(email);
            out.println(password);
            out.close();
        }
        catch(IOException ex){
            System.out.println("Printing to file failed. IO exception.");
        }
    }
    public void writeAdditionalInfoToFile(){
        try{
            PrintWriter out = new PrintWriter(new FileWriter("User_Info.txt"));
            out.println(zip);
            out.println(phone);
            out.close();
        }
        catch(IOException ex){
            System.out.println("Printing to file failed. IO exception.");
        }
    }
    public String login(){
        String enteredEmail;
        String enteredPassword;
        String success = "Successful Login.";
        Scanner x = new Scanner(System.in);
        System.out.println("Please enter your e-mail: ");
        enteredEmail = x.nextLine();
        System.out.println("Please enter your password: ");
        enteredPassword = x.nextLine();
        
        return success; 
    }
    
    public void readInfoFromFile(String email, String password){
        try{
            boolean looping = true;
            BufferedReader in = new BufferedReader(new FileReader("User_Info.txt"));
            while(looping = true){
                String s = in.readLine();
                
            }
        }
        catch(EOFException ex){
            
        }
        catch(IOException ex){
            
        }
        
    }

}
