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
public class teaching_assistant implements staff {
       String name;
    int id;
    int age;
    double salary;


    @Override
    public void get_salary()
    {
        System.out.println("salay is 100");
    }

    @Override
    public void get_years_of_work() 
    {
        System.out.println("years of work is 23");
    }

    @Override
    public void print_data()
    {

        System.out.println(" TeachingAssistant_name is  "  + name);
        System.out.println(" TeachingAssistant_id is  "  + id);
        System.out.println(" TeachingAssistant_ age  is    "  + age);
        System.out.println(" TeachingAssistant_salary is  "  + salary);

    }


    public void serdata(String name, int id, int age, double salary)
    {
        this.name=name;
        this.id=id;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public void set_data(String name, int id, int age, double salay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
