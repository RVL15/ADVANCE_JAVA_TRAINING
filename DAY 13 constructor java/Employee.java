class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
       	System.out.println("Name of Employee: " + name );
	System.out.println("Employee id : " + id );
	System.out.println("Employee Salary : " + salary );

    }
 public static void main(String[] args) {
        Employee e1 = new Employee("Rishabh", 428823, 23232323);
        Employee e2 = new Employee("Priya", 342323, 33232323);

        e1.display();
	System.out.println("" );
        e2.display();
    }
}