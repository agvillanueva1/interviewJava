package Interface;

public class EmployeeData {

    // private data variables
    private int ssn;
    private String empName;
    private int empAge;

    // create get and setters AND you must declare them public in nature. If you declare them private then
    //no one can access it. Only within class. Want them to be accessed from outside the class as well

    public static void main(String[] args) {
        EmployeeData emp = new EmployeeData();
         emp.setEmpName("Tom Peter");
         emp.setEmpAge(25);
         emp.setSsn(123456);

        System.out.println(emp.getEmpName());
        System.out.println(emp.getEmpAge());
        System.out.println(emp.getSsn());

    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }


}



