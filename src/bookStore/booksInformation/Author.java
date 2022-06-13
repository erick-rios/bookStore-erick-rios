package bookStore.booksInformation;

import java.util.Objects;

public class Author{

    private int     identifier;
    private String  firstName;
    private String  lastName;
    
    public Author(){};
    
    public Author(int identifier, String firstName, String lastName){
        this.identifier = identifier;
        this.firstName  = firstName;
        this.lastName   = lastName;
    }
    public void setIdentifier(int identifier){
        this.identifier = identifier;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getIdentifier(){
        return this.identifier;
    }
    public String getFirstName(){
        return  this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    
    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(this.getClass() != object.getClass()) return false;
        Author otherAuthor = (Author) object;
        return identifier == otherAuthor.identifier && Objects.equals(firstName,otherAuthor.firstName) && Objects.equals(lastName, otherAuthor.lastName);
    }


    @Override
    public String toString(){
        return "[Identifier: " + identifier + "\nFirstName: " + firstName + "\nLastName: "+ lastName+"]";
    }
}
