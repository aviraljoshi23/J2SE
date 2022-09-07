package ObjectOrientedPrograms;

import java.util.Scanner;

// 36) Make list of Students having name, roll no., age, score. 
// Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].

class Student
{
    private int rollNo,age,score;
    private String name;
    public Student(String name,int rollNo,int age,int score)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }
    public String toString() {

		return name + " " + rollNo + " " + age + " "+score;
	}
}
public class StudentClass {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        Student[] s = new Student[3];
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter the name of student ;- ");
            String name = sc.nextLine();
            System.out.println("Enter the Roll No of Student");
            int rollNO = sc.nextInt();
            System.out.println("Enter the age of Student");
            int age = sc.nextInt();
            System.out.println("Enter the Score");
            int score  = sc.nextInt();

            s[i] = new Student(name,rollNO,age,score);
        }
        for(int i = 0;i<3;i++)
        {
            System.out.println(s[i].toString());
        }
        sc.close();
        
    }
}
