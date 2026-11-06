package org.example;

public class Book {
    enum Language {
        RUSSIAN, ENGLISH, FRENCH, GERMAN, SPANISH
    }

    private String title;
    private Language language;

    public Book(String title, Language language) {
        this.title = title;
        this.language = language;
    }
    public String toString(){

        return "Книга" + title;
    }



    public static void main(String[] args) {
        Book[] books = {
                new Book("Война и мир", Language.RUSSIAN),
                new Book("1984", Language.ENGLISH),
                new Book("Отверженные", Language.FRENCH),
                new Book("Фауст", Language.GERMAN),
                new Book("Дон Кихот", Language.SPANISH)
        };

        System.out.println("Книги на английском:");
        for (Book b : books) {
            if (b.language == Language.ENGLISH) {
                System.out.println(b);
            }
        }
    }
}