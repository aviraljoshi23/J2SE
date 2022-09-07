package ObjectOrientedPrograms.Inheritance;

import java.util.Scanner;

// 5) Create class OneBHK with instance variable roomArea , hallArea and price.
//     • Create default and parameterized constructor.
//     • Method show(): to print OneBHK data member information.
// 6) Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.
//     • Create default and parameterized constructor.
//     • Method show(): to print all data member information.
// Write main function in another class(Say XYZ) and store three TwoBHK flat’s.information and print information using show method.
// Also print total amount of all flats.
class OneBHK
{
    private int roomArea;
    private int hallArea;
    private int price;
    public OneBHK()
    {
        roomArea = 0;
        hallArea = 0;
        price = 0;

    }
    OneBHK(int roomArea,int hallArea,int price)
    {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }
    void show()
    {
        System.out.println("Room One Area :- "+roomArea+"\nHall Area: -"+hallArea+"\nPrice :-"+price);
    }
}
class TwoBHK extends OneBHK
{
    private int room2Area;
    public TwoBHK()
    {
        room2Area = 0;
    }
    TwoBHK(int roomArea,int roomArea2,int hallArea,int price)
    {
        super(roomArea,hallArea,price);
        this.room2Area = roomArea;
    }
    void show()
    {
        super.show();
        System.out.print("Room Two :-"+room2Area+"\n");
    }
}

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many flat details you want to enter :- ");
        int n = sc.nextInt();
        TwoBHK flat[] = new TwoBHK[n];
		System.out.println("Enter the Flat Details");
		for(int i=0;i<n;i++)
		{
            System.out.println("FLAT "+i+" Details\n\n");
            System.out.println("Enter the Room 1 Area");
            int r1 = sc.nextInt();
            System.out.println("Enter the Room 2 Area");
            int r2 = sc.nextInt();
            System.out.println("Enter the HAll Area");
            int hall = sc.nextInt();
            System.out.println("Enter the Price Area");
            int p1 = sc.nextInt();
			flat[i] =new TwoBHK(r1,r2,hall,p1);
		}
        for(int i =0;i<n;i++)
        {
            flat[i].show();
            System.out.println("---------------------------------------------------------------------");
        }
        sc.close();

    }
    
}
