package lukaszhajdun.example.spring5WebApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kroolik on 2017-10-31.
 */

@Entity
public class Author {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
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

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
