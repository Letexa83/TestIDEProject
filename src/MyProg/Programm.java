package MyProg;
import  MyProg.SubClasses.Test;

import java.time.Instant;

public class Programm {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Hello world");
        Book book = new Book();
        System.out.println(book);
        Book namedBook = new NamedBook("Артур Конан-Дойль", "Этюд в багровых тонах");
        System.out.println(namedBook);
        Book newNamedBook = new NamedBook("Agata Kristy", "10 negers");
        System.out.println(newNamedBook);
        Test.println(newNamedBook);
        Test tst = null;
        try {
            tst = Test.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(tst);
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
