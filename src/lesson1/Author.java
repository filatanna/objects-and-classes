package lesson1;

public class Author {
    private String name;
    private String surname;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String toString() {
        return this.name + " " + this.surname;
    }

    public boolean equals(Author author) {
        if (this.getName() != author.getName() && this.getSurname() != author.getSurname()) {
            return false;
        } else {
            return true;
        }
    }

    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}