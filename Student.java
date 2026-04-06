import java.util.Scanner;
public class Student
{
    int rollno,m1,m2,m3;
    String name;
    int total;
    float average;
    void getdata()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n enter student name,roll number,and marks of 3 subjects");
        name=scan.nextLine();
        rollno=scan.nextInt();
        m1=scan.nextInt();
        m2=scan.nextInt();
        m3=scan.nextInt();
    }
    void calc()
    {
        total=m1+m2+m3;
        average=total/3.0f;
        System.out.println("Total marks:"+total);
        System.out.println("Average:"+average);
    }
    public static void main(String args[])
    {
        Studdent r=new Student();
        r.getdata();
        System.out.println("\n \n Student details \n");
        System.out.println("Name:"+r.name);
        System.out.println("Roll Number:"+r.rollno);
        r.calc();
    }
}