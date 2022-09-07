package ObjectOrientedPrograms;

import java.util.Scanner;

// 35) Create class Product (pid, price, quantity) with parameterized constructor.Create a main function in different class (say XYZ) and perform following task:
//     • Accept five product information from user and store in an array
//     • Find Pid of product with highest price.
//     • Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products.
//      (amount spent on single product=price of product * quantity of product).

class Product
{
    private int product[];
    private int maxPid;
    private int max=0;
    public Product(int product[])
    {
        this.product = product;
    }
    public void findPid()
    {
        int  i=0;
        for(i=1;i<this.product.length;i+=3)
        {
            if(this.product[i]>this.max)
            {
                this.max = this.product[i];
                this.maxPid = this.product[i-1];
            }
        }
        System.out.println(this.maxPid);
    }
    public int getMaxPid()
    {
        return  this.maxPid;
    }

}

class Testclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int product[] = new int[15];
        int pid;
        int price;
        int qty;
        int j=0;
        for(int i=0;i<product.length;)
        {
            j++;
            System.out.println("Enter the "+j+" product id");
            pid = sc.nextInt();
            product[i++] = pid;
            System.out.println("Enter "+j+" product price");
            price = sc.nextInt();
            product[i++] = price;
            System.out.println("Enter "+j+" product quantity");
            qty = sc.nextInt();
            product[i++] = qty;
        }
        Product p1 = new Product(product);
        p1.findPid();
        System.out.println(p1.getMaxPid());
        sc.close();
        
    }
    
}
