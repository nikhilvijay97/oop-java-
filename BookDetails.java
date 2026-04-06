import java.util.Scanner;

class Publisher {
    String pubName;
    Publisher(String pub) {
        pubName = pub;
    }
}

class Book extends Publisher {
    String bookName;
    Book(String pub, String bk) {
        super(pub);
        bookName = bk;
    }
}

class Literature extends Book {
    String category;
    Literature(String pub, String bk, String ctgry) {
        super(pub, bk);
        category = ctgry;
    }
    void display() {
        System.out.println("Publisher: " + pubName);
        System.out.println("Book: " + bookName);
        System.out.println("Category: " + category);
    }
}

class Fiction extends Book {
    String category;
    Fiction(String pub, String bk, String ctgry) {
        super(pub, bk);
        category = ctgry;
    }
    void display() {
        System.out.println("Publisher: " + pubName);
        System.out.println("Book: " + bookName);
        System.out.println("Category: " + category);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Literature Book Details (Book name, Publisher, Category):");
        Literature ob1 = new Literature(s.next(), s.next(), s.next());

        System.out.println("Enter Fiction Book Details (Book name, Publisher, Category):");
        Fiction ob2 = new Fiction(s.next(), s.next(), s.next());

        System.out.println("\n** Literature Book **");
        ob1.display();
        System.out.println("\n** Fiction Book **");
        ob2.display();
        s.close();
    }
}