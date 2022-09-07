
package ObjectOrientedPrograms;
//36) Make list of Students having name, roll no., age, score.
//Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].
import java.util.*;

class Student
{
	private String name;
	private int rollNo;
	private int age;
	private int score;
	public Student(String name,int rollNo,int age,int score)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.score = score;
	}
	public int getScore()
	{
		return score;
	}
	public void showStudent()
	{
		System.out.println("STUDENT NAME:- "+name+"\nSTUDENT ROLL NO :- "+rollNo+"\nSTUDENT AGE:-"+age+"\nSTUDENT SCORE :- "+score);
	}
}
public class Question36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student stu[] = new Student[5];
		System.out.println("Enter the Student Details");
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the Name:-");
			String sname=sc.next();
			System.out.println("Enter the RollNo:-");
			int rollno = sc.nextInt();
			System.out.println("Enter the Age:-");
			int age = sc.nextInt();
			System.out.println("Enter the Score:-");
			int score = sc.nextInt();
			stu[i] = new Student(sname,rollno,age,score);
		}
		System.out.println("STUDENT BETWEEN 0-50");
		for(int i=0;i<stu.length;i++)
		{
			if(stu[i].getScore()>=0&&stu[i].getScore()<=50)
			{
				stu[i].showStudent();
			}
		}
		System.out.println("STUDENT BETWEEN 50-65");
		for(int i=0;i<stu.length;i++)
		{
			if(stu[i].getScore()>=50&&stu[i].getScore()<=65)
			{
				stu[i].showStudent();
			}
		}
		System.out.println("STUDENT BETWEEN 65-80");
		for(int i=0;i<stu.length;i++)
		{
			if(stu[i].getScore()>=65&&stu[i].getScore()<=80)
			{
				stu[i].showStudent();
			}
		}
		System.out.println("STUDENT BETWEEN 80-100");
		for(int i=0;i<stu.length;i++)
		{
			if(stu[i].getScore()>=80&&stu[i].getScore()<=100)
			{
				stu[i].showStudent();
			}
		}
		sc.close();
	}

}
