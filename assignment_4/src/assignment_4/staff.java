/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

/**
 *
 * @author GeNDii
 */
public interface staff {
    public void set_data( String name, int id,int age , double salay );
    public void get_salary();
    public void get_years_of_work();
    public void print_data();
}
