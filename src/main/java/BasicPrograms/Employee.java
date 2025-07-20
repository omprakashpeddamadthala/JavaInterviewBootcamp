package BasicPrograms;

class Employee {

    private int id;

    private String name;

    private double salary;


    public Employee(int id, String name, double salary) {

        this.id = id;

        this.name = name;

        this.salary = salary;

    }


    public double getSalary() {

        return salary;

    }


    public String getName() {

        return name;

    }


    @Override

    public String toString() {

        return "Employee{" +

                "id=" + id +

                ", name='" + name + '\'' +

                ", salary=" + salary +

                '}';

    }

}