package staff.management;

import staff.Employee;

public class Manager extends Employee{

    public String deptName;

    public Manager(String name, int NI, double salary, String deptName){
        super(name, NI, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }
}
