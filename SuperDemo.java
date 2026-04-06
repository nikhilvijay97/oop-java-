class SuperParent
{
    int rollno;

    SuperParent(int rno)
    {
        rollno = rno;
    }
}

class SuperChild extends SuperParent
{
    String name;

    SuperChild(int rno, String name1)
    {
        super(rno);
        name = name1;
    }

    void display()
    {
        System.out.println("rollno: " + rollno);
        System.out.println("name: " + name);
    }
}

class SuperDemo
{
    public static void main(String args[])
    {
        SuperChild ob = new SuperChild(23, "deepthy");
        ob.display();
    }
}