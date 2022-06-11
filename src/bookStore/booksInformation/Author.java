package bookStore.booksInformation;

public class Author{

    int   identifier;
    String firstName;
    String  lastName;
    
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
    public int getId(){
        return this.id;
    }
    public String getFirstName(){
        return  this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    


    @Override
    public String toStString(){
        return "[Identifier: " + identifier + "\nFirstName: " + firstName + "\nLastName: "+ lastName"]";
    }
}
