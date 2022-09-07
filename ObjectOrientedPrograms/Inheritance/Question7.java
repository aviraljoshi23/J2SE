package ObjectOrientedPrograms.Inheritance;

// 7) Create three classes  Faculty  (facultyid, salary), FullTimeFaculty  (basic, allowance) inherits class Faculty, PartTimeFaculty  (hour, rate) inherits class Faculty. 
//  Create   a   method   for   accepting   input   in   FullTimeFaculty  and  PartTimeFaculty,  but   salary  should   not   be   accepted.
//  Salary   is  calculated   on   the   basis   of   (basic+allowance)   for   FullTimeFaculty   and  (hour*rate)   for   PartTimeFaculty.
//  Also   create   method   in   above   classes   to  display faculty data. 
//  Create   another   class(say   XYZ)   for   main   method   and   store   2 fulltime and 2 parttime faculty information. Also print their details. 

class Faculty
{
    private int facultyid;
    private int salary;
    void setFacultyId(int FacultyId)
    {
        this.facultyid = FacultyId;
    }
    void setSalary(int salary)
    {
        this.salary = salary;
    }
    void DisplayFacultyData()
    {
        System.out.println("Faculty Id:- "+facultyid+"\nSalary :- "+salary);
    }

} 
class FullTimeFaculty extends Faculty
{
    private int basicwage;
    private int allowances;
    void setFullTimeFacultyInput(int facultyId,int basic,int allowance)
    {
        super.setFacultyId(facultyId);
        this.basicwage = basic;
        this.allowances = allowance;
        setSalary(basicwage+allowances);
    }
}
class PartTimeFaculty extends Faculty
{
    private int hour;
    private int rate;
    void setPartTimeFacultyInput(int facultyId,int basic,int allowance)
    {
        super.setFacultyId(facultyId);
        this.hour = basic;
        this.rate = allowance;
        setSalary(rate*hour);
    }
}
public class Question7 {
    public static void main(String[] args) {
        FullTimeFaculty f1 = new FullTimeFaculty();
        f1.setFullTimeFacultyInput(101, 2000, 1000);
        f1.DisplayFacultyData();
        PartTimeFaculty p1 = new PartTimeFaculty();
        p1.setPartTimeFacultyInput(102,45,5);
        p1.DisplayFacultyData();
    }
    
}
