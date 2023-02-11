import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != getClass()) {
            return false;
        }
        Author author = (Author) o;
        return name.equals(author.getName()) & surname.equals(author.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
