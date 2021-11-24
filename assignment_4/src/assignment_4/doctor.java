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
public class doctor implements staff {
    String name;
    int id;
    int age;
    double salary;

    @Override
    public void get_salary()
    {
        System.out.println("salary is 255");
    }

    @Override
    public void get_years_of_work() 
    {
        System.out.println("years of work is 15 ");
    }

    @Override
    public void set_data(String name, int id, int age, double salary) 
    {
       this.name=name;
        this.id=id;
        this.age=age;
        this.salary=salary;

    }

    @Override
    public void print_data()
    {
        System.out.println("doctor_name is "  + name);
        System.out.println("doctor_id is "  + id);
        System.out.println("doctor_age is "  + age);
        System.out.println("doctor_salary is "  + salary);
    }


}

