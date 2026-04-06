import java.util.Scanner;
class Employee
{
    int empid;
    String empname;
    double basic,TA,DA,HRA,TAX,net_salary;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee id:");
        empid=sc.nextInt();
        System.out.println("Enter  eployee name:");
        empname=sc.nextLine();
        System.out.println("enter basic salary:");
        basic=sc.nextDouble();
        System.out.println("enter ta:");
        TA=sc.nextDouble();
        System.out.println("enter da:");
        DA=sc.nextDouble();
        System.out.println("enter HRA:");
        HRA=sc.nextDouble();
        System.out.println("enter tax:");
        TAX=sc.nextDouble();
    }
    void calc()
    {
        net_salary=(basic+TA+DA+HRA)-TAX;
    }
    void display()
    {
        System.out.println("\n employee id:"+empid);
        System.out.println("\n Employee Name:"+empname);
        System.out.println("Net salary:"+net_salary);
    }
    }
    public class Main
    {
        public static void main(String[] args) {
            {
                Employee emp=new Employee();
                emp.getData();
                emp.calc();
                emp.display();
            }
        }
    }
        


