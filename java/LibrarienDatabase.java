
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Merve
 */
public class LibrarienDatabase {
     ArrayList<Librarien> employeeDatabase = new ArrayList<>();

    public void loadData() {
        for (User user : UserDatabase.users) {
            if (user instanceof Librarien) {
                Librarien employee = (Librarien)user;
                employeeDatabase.add(employee);
                
                
            }

        }

    }
}
