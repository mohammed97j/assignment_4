
import assignment_4.doctor;
import assignment_4.staff;
import assignment_4.teaching_assistant;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GeNDii
 */
public class factory {
    
    public staff get_staff(String desired_member)
    {
      if(desired_member==null)
             return null;
          else if (desired_member.equalsIgnoreCase("DOCTOR"))
             return new doctor();

          else if (desired_member.equalsIgnoreCase("TEACHINGASSISTANT"))
              return new teaching_assistant();
      return null;

    }

}
