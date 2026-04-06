public class Square
{
    int side;
    void getinput(int s)
    {
        side=s;
}
int calArea()
{
    return side*side;
}
public static void main(String args[])
{
    Square r=new Square();
    r.getinput(5);
    System.out.println("Area of rectangle="+r.calArea());
}
}