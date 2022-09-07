package ObjectOrientedPrograms.Inheritance;

import java.util.Scanner;

// 8) Create a class Student with two members : rollno and percentage.
// 	Create default and parameterized constructors. Create method show() to 	display information.
// 	Create another class CollegeStudent inherits Student class. Add a new membersemester to it. Create default and parameterized constructors.
//     Also override show() method.
// 	Create another class SchoolStudent inherits Student class. Add a new memberclassname(eg 12 th ,10 th etc.) to it. 
//     Create default and parameterized 	constructors. Also override show() method.
// 	Create a class(say XYZ) with main method that carries out the operation of the project :
//     • has array to store objects of any class(Student or CollegeStudent, SchoolStudent).
//     • create two CollegeStudent and three SchoolStudent record objects and store Them inside the array.
//     • display all record from the array.
//     • search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.
//     • count how many students are having A grade,if for A grade percentage >75.

class Student{
     private int rollNo;
     private double percentage;
     public Student()
     {
        rollNo = 0;
        percentage=0;
     }
     public Student(int rollNo,double percentage)
     {
         this.rollNo = rollNo;
         this.percentage = percentage;
     }
     void show()
     {
         System.out.println("Roll No :- "+rollNo+"\n Percenatage :- "+percentage);
     }
     public int getRollNo()
     {
         return this.rollNo;
     }
     public double getPercentage()
     {
         return this.percentage;
     }
}
class CollegeStudent extends Student{

    private int year;
    CollegeStudent()
    {
        year = 0;
    }
    CollegeStudent(int rollNo,double percenatage,int year)
    {
        super(rollNo,percenatage);
        this.year =year;
    }
    void show()
    {
        System.out.println("COLLEGE STUDENT");
        System.out.println("Roll No.:-"+getRollNo()+"\n Percentage:- "+getPercentage()+"\n B-TECH year "+year);
    }
}
class SchoolStudent extends Student{

    private int std;
    SchoolStudent()
    {
        std = 0;
    }
    SchoolStudent(int rollNo,double percenatage,int std)
    {
        super(rollNo,percenatage);
        this.std =std;
    }
    void show()
    {
        System.out.println("SCHOOL STUDENT");
        System.out.println("Roll No.:-"+getRollNo()+"\n Percentage:- "+getPercentage()+"\n Standard "+std);
    }
}
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HOW MANY SCHOOL STUDENTS? -> ");
        //int TotalSchoolStudent = sc.nextInt();
        Student[] arr = new Student[5];
        System.out.println("HOW MANY COLLEGE STUDENTS? -> ");
       //int TotalCollegeStudent = sc.nextInt();
        //CollegeStudent[] cs = new CollegeStudent[TotalCollegeStudent];
        arr[0] = new SchoolStudent(101,25,12);
        arr[1] = new SchoolStudent(102,75,12);
        arr[2] = new SchoolStudent(103,64,12);
        arr[3] = new CollegeStudent(101,77.5,1);
        arr[4] = new CollegeStudent(102,89.5,2);

        /*System.out.println("Enter School Student Details");
        for(int  i = 0;i<ss.length;i++)
        {
            System.out.println("ROll NO:- ");
            int rollno = sc.nextInt();
            System.out.println("Percentage :- ");
            double per = sc.nextDouble();
            System.out.println("Standard :- ");
            int std = sc.nextInt();
            ss[i] = new SchoolStudent(rollno, per, std);
        }
        System.out.println("Enter School Student Details");
        for(int  i = 0;i<cs.length;i++)
        {
            System.out.println("ROll NO:- ");
            int rollno = sc.nextInt();
            System.out.println("Percentage :- ");
            double per = sc.nextDouble();
            System.out.println("Year :- ");
            int year = sc.nextInt();
            cs[i] = new CollegeStudent(rollno, per, year);
        }
        for(int i = 0;i<ss.length;i++)
        {
            if(ss[i].getPercentage()>=75)
            {
                ss[i].show();
            }
        }
        for(int i = 0;i<cs.length;i++)
        {
            if(cs[i].getPercentage()>=75)
            {
                cs[i].show();
            }
        }*/
        for(int  i= 0;i<arr.length;i++)
        {
            if(arr[i].getPercentage()>=75)
            {
                arr[i].show();
            }
        }
        sc.close();
    }
}
