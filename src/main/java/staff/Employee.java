package staff;

public abstract class Employee {

    private String name;
    private int NI;
    private double salary;

    public Employee(String name, int NI, double salary){
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getNI(){
        return this.NI;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(Double increase){
        Double raise = this.salary * increase;
        this.salary += raise;
    }

    public double payBonus(){
       return this.salary * 0.01;
    }


}
