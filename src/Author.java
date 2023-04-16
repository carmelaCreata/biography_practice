import java.util.ArrayList;
import java.util.List;

public class Author {


    public Author(String firstName, String lastName, String city, boolean isAuthorAlive, int age, List<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.isAuthorAlive = isAuthorAlive;
        this.age = age;
        this.books = books;
    }

    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    //YOUR CODE HERE




    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    //YOUR CODE HERE
    public String firstName;
    public String lastName;
    public String city;
    public boolean isAuthorAlive;
    public  int age;
    public List<Book> books = new ArrayList<>();




    /*
    Override toString() method here that returns Author object information
     */
    //YOUR CODE HERE


    @Override
    public String toString() {
        if(isAuthorAlive)
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", isAuthorAlive=" + isAuthorAlive +
                ", age=" + age +
                ", books=" + books +
                '}';
        else return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", isAuthorAlive=" + isAuthorAlive +
                ", books=" + books +
                '}';
    }
}
