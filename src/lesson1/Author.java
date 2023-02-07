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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && surname.equals(author.surname);
    }
       public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}