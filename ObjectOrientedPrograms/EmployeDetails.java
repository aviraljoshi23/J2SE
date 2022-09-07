package ObjectOrientedPrograms;

// 34) Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
//     • Only parameterized constructor;
//     • totalSalary always represent total of all the salaries of all employees created.
//     • empNo should be auto incremented.
//     • display total employees and totalSalary using class method.

class Employee{
    private static int empNo=0,totalSalary=0;
    private int salary=0;
    public Employee(int salary)
    {
        this.salary  = salary;
        totalSalary = totalSalary+this.salary;
        empNo++;
    }
    public Employee()
    {

    }
    public int getTotalSalary()
    {
        return totalSalary;
    }
    public int getTotalEmployes()
    {
        return empNo;
    }
}
public class EmployeDetails {
    public static void main(String[] args) {
        Employee emp = new Employee();

        Employee e1[] = new Employee[5];

        e1[0] = new Employee(56600);
		e1[1] = new Employee(63500);
		e1[2] = new Employee(87400);
		e1[3] = new Employee(63000);
        e1[4] = new Employee(7525);

        System.out.println("Total Salary"+emp.getTotalSalary());
        System.out.println("Total Employee"+emp.getTotalEmployes());
    }
    
}
