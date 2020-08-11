package MyProg;

public class Programm {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Hello world");
        Book book = new Book();
        System.out.println(book);
        Book namedBook = new NamedBook("Артур Конан-Дойль", "Этюд в багровых тонах");
        System.out.println(namedBook);

    }
}

class Book {
    @Override
    public String toString() {
        return "Это просто книга";
    }
}

class NamedBook extends Book{
    private String author;
    private String name;
    public NamedBook(String author, String name) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Автор: " + author + ". Название книги: " + name;
    }
}
