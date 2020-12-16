//Nicholas Miller
//ITDEV110
//Assignment 5
package miller_practiceobjects;

/**
 *
 * @author Nick
 */
public class Miller_PracticeObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee meyers = new Employee ("Susan Meyers", 47899, "Accounting", 
        "Vice President");
        System.out.println(meyers.get_employeeName() + "\t" + meyers.get_employeeId() 
        + "\t" + meyers.getDepartment() + "\t" + meyers.getPosition());
        Employee jones = new Employee ("Mark Jones", 39119, "IT", 
        "Programmer");
        System.out.println(jones.get_employeeName() + "\t" + jones.get_employeeId()
        + "\t" + jones.getDepartment() + "\t" + "\t" + jones.getPosition());
        Employee rogers = new Employee ("Joy Rogers", 81774, "Manufacturing",
        "Engineer");
        System.out.println(rogers.get_employeeName() + "\t" + rogers.get_employeeId()
        + "\t" + rogers.getDepartment() + "\t" + rogers.getPosition());
    }
    
}
