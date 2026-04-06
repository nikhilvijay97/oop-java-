class InheritanceDemo {
    int rollno = 10;
    String name = "athira";
}

class ChildInheritance extends InheritanceDemo {
    int marks = 80;

    void display() {
        System.out.println("rollno: " + rollno);
        System.out.println("name: " + name);
        System.out.println("marks: " + marks);
    }
}

class SingleInheritance {
    public static void main(String args[]) {
        ChildInheritance ob = new ChildInheritance();
        ob.display();
    }
}