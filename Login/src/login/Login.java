/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.util.*;
/**
 *
 * @author Hannah
 */
public class Login {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String newUser;
        String success;
        System.out.println("Hello. Are you already a user?");
        Scanner x = new Scanner(System.in);
        newUser = x.nextLine();
        if(newUser.equalsIgnoreCase("n")|newUser.equalsIgnoreCase("no")){
            User user = new User();
            user.getInfoForFile();
            user.writeBasicInfoToFile();
            success = user.login();
            if(success.equals("Login Successful.")){
                user.getAdditionalInfoForFile();
                user.writeAdditionalInfoToFile();
            }
        }
        else if(newUser.equalsIgnoreCase("y")|newUser.equalsIgnoreCase("yes")){
            User pastUser = new User();
            pastUser.login();
        } 
    }
}
