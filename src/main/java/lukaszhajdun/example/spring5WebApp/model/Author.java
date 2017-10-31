package lukaszhajdun.example.spring5WebApp.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kroolik on 2017-10-31.
 */
public class Author {

    private String firstName;
    private String lastName;

    private Set<Book> books = new HashSet<>();

//Constructors
    public Author() {
    }

    public Author (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author (String firstName, String lastName, Set<Book> books){
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

// Getters and Setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }
    public void setBooks(Set<Book> books) {
        this.books = books;
    }


}
