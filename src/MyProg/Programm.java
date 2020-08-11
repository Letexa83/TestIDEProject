package MyProg;

public class Programm {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Hello world");
        Book book = new Book();
        System.out.println(book);

    }
}

class Book {
    @Override
    public String toString() {
        return "Это просто книга";
    }
}
