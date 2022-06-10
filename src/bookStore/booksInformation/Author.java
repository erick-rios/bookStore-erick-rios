package bookStore.booksInformation;

public class Author{

    int identifier;
    String firstName;
    String lastName;
    
    public Author(){};
    
    public Author(int identifier, String firstName, String lastName){
        this.identifier = identifier;
        this.firstName  = firstName;
        this.lastName   = lastName;
    }
    
    @Override
    public String toStString(){
        return "[Identifier: " + identifier + "\nFirstName: " + firstName + "\nLastName: "+ lastName"]";
    }
}
