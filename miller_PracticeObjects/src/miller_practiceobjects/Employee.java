
package miller_practiceobjects;

/**
 *
 * @author Nick
 */
public class Employee {
    private String employeeName;
    private int idNumber;
    private String department;
    private String position;
    
    
     
    public Employee(String nm, int id, String dp, String ps){
        employeeName = nm;
        idNumber = id;
        department = dp;
        position = ps;
    }
            
    public Employee(String nm, int id){
        employeeName = nm;
        idNumber = id;
        department = " ";
        position = " ";
    }
            
    public Employee(){
        employeeName = " ";
        idNumber = 0;
        department = " ";
        position = " ";
    }        
    
      public void set_employeeName(String empName) {

    employeeName = empName;

 }

 public String get_employeeName() {

   return employeeName;

 }

 public void set_employeeId(int empId) {

   idNumber = empId;

 }

 public int get_employeeId() {

   return idNumber;

 }      

       

 public void setDepartment(String dept) {

   department = dept;

 }          

 public String getDepartment() {

   return department;

 }

   

 public void setPosition(String ps) {

   position = ps;

 }

   

 public String getPosition() {

   return position;

 }
}


