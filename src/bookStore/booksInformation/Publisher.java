package bookStore.booksInformation;

public class Publisher {

    private int               id;
    private String publisherName;

    public Publisher(){};

    public Publisher(int id, String publisherName){
        this.id = id;
        this.publisherName = publisherName;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setPublisherName(String publisherName){
        this.publisherName = publisherName;
    }

    public int getId(){
        return this.id;
    }

    public Publisher publisherName(){
        return this.publisherName;
    }
    
    
}
