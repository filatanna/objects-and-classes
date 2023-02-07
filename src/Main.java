import lesson1.Author;
import lesson1.Book;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Михаил", "Булгаков");
        Book book1 = new Book("Мастер и Маргарита", 1930, author1);
        Author author2 = new Author("Маркус", "Зусак");
        Book book2 = new Book("Книжный вор", 2005, author2);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(author1.equals(author2));
        System.out.println(book1.equals(book2));
        }


}