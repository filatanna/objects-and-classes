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


    public Book(String nameBook, int ageBook, Author author) {
        this.nameBook = nameBook;
        this.ageBook = ageBook;
        this.author = author;


    }

    public String toString() {
        return this.nameBook + " " + this.author + " " + this.ageBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ageBook == book.ageBook && nameBook.equals(book.nameBook) && author.equals(book.author);
    }


    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook, ageBook, author);
            }
}