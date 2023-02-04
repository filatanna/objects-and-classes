import lesson1.Author;
import lesson1.Book;

public class Main {
    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил", "Булгаков");
        Book masterMargarita = new Book("Мастер и Маргарита", 1930, bulgakov);
        Author zusak = new Author("Маркус", "Зусак");
        Book bookThief = new Book("Книжный вор", 2005, zusak);
        System.out.println(bulgakov.getName());
        System.out.println(masterMargarita.getAgeBook());
        masterMargarita.setAgeBook(1956);
        System.out.println(masterMargarita.getAgeBook());



    }
}