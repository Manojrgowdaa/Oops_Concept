class Employee {
    public int id;
    public String name;
    public double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}


public class employe{
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Nisarga", 60000.0);
        Employee e2 = new Employee(2, "Surabhi", 70000.0);
        Employee e3 = new Employee(3, "Nagalakshmi", 65000.0);

        Employee[] employee = {e1, e2, e3};

        //Traverse the array using a for loop 
        for(int i = 0; i < employee.length; i++){
            System.out.println("Employee "+(i+1)+ ":");
            System.out.println("ID: "+ employee[i].id);
            System.out.println("Name: "+ employee[i].name);
            System.out.println("Salary: $"+employee[i].salary);
            System.out.println();
        }
    }
}