package lesson1;

public class Book {
     private String nameBook;
     private int ageBook;
     private Author author;


    public String getNameBook() {
        return nameBook;
    }

    public int getAgeBook() {
        return ageBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setAgeBook(int ageBook) {
        this.ageBook = ageBook;
    }

    public Book(String nameBook, int ageBook, Author author ){
        this.nameBook = nameBook;
        this.ageBook = ageBook;
        this.author = author;
 }


}
