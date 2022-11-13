public class Employee  extends Users{

    private double salary;
    private String type_of_employee;

    public Employee(){
        super.setName(null);
        super.setID();
        this.salary=0.0;
        this.type_of_employee=null;
    }

    public Employee(String name, double salary, String type){
        super(name);
        this.salary=salary;
        this.type_of_employee=type;
        super.setID();
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getID() {
        return super.ID;
    }

    public void SetSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public void SetType(String type){
        this.type_of_employee=type;
    }

    public String getType(){
        return this.type_of_employee;
    }

    public void SetNewSalary(double perc){
        double incre= salary * perc;
        this.salary+=incre;
    }

    public boolean isManager(){
        boolean type=false;
        if (type_of_employee.equals("Manager")) {
            type=true;
        }
        return type;
    }

    @Override
    public String toString() {
        return "Employee:"+"("+getType()+")"+ getName()+" "+"("+getID()+")"+" has "+getSalary()+" RY.";
    }

}
