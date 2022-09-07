package ObjectOrientedPrograms.Interface;

// 12) Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. Create abstract method calcTax().
//     • Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
//     • Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product.
//     • Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax
//      and sales tax respectively.

interface Taxable
{
    final double salesTax = 7;
    final double incomeTax = 10.5;
    public double calcTax();
    public void display();
}
class Employee implements Taxable
{
    private int empId;
    private String name;
    private int Salary;
    public Employee(int empId,String name,int Salary)
    {
        this.empId = empId;
        this.name = name;
        this.Salary = Salary;
    }
    @Override
    public double calcTax() {
        return (Salary*incomeTax)/100;
    }
    public void display(){
        System.out.println("Employe Id -> "+empId+"\n Employee Name -> "+name+"\n Salary ->"+Salary);
        System.out.println(calcTax());
    }
}
class Product implements Taxable
{
    private int pid;
    private int price;
    private int quantity;
    public Product(int pid,int price,int quantity)
    {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public double calcTax() {
        // TODO Auto-generated method stub
        return ((price*quantity) * salesTax)/100;
    }
    public void display(){
        System.out.println("Product Id -> "+pid+"\nProduct Price -> "+price+"\nProduct Quanity ->"+quantity);
        System.out.println(calcTax());
    }

}
public class Interface12 {
    public static void main(String[] args) {
        Product p1 = new Product(15,500,50);
        Employee e1 = new Employee(101,"Abhi", 5000);
        e1.display();
    }
    
}
