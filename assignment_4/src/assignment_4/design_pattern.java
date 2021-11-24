/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import java.util.Scanner;

/**
 *
 * @author GeNDii
 */
public class design_pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter desierd member");
        String str=input.nextLine();
        factory f = new factory ();
        staff s=f.get_staff(str);
        s.get_salary();
        s.get_years_of_work();
        s.set_data("mohammed", 5, 21, 3000);
        s.print_data();


    }
    
}
