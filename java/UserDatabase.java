
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Merve
 */
public class UserDatabase {
    
    static ArrayList<User> users = new ArrayList<>();
    
    public static void loadData(){
    User costumer1 = new Costumer("Merve","Demir","123","Merve");
    User costumer2 = new Costumer("Kübra","Demir","234","Kübra");
    User costumer3 = new Costumer("Arif","Demir","345","Arif");
    
    User employee1 = new Librarien("Fatma", "Demir", "1", "Fatma");
    User employee2 = new Librarien("Abdullah", "Demir"," 1", "Apo");
    
    users.add(employee1);
    users.add(employee2);
    
    users.add(costumer1);
    users.add(costumer2);
    users.add(costumer3);
    
    }
}
