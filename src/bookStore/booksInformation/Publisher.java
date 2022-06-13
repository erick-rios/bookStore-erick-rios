package bookStore.booksInformation;

import java.util.Objects;

public class Publisher {

    private int               id;
    private String publisherName;

    public Publisher(){};

    public Publisher(int id, String publisherName){
        this.id            = id;
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

    public String publisherName(){
        return this.publisherName;
    }
  
    @Override
    public boolean equals(Object object){
        if(object == null) return false;
        if(this == object) return true;
        if(getClass() != object.getClass())return false;
        Publisher anotherPublisher = (Publisher) object;
        return id == anotherPublisher.id && Objects.equals(publisherName, anotherPublisher.publisherName);
    }
    @Override
    public String toString(){
        return "[Id: " + id + "\nPublisher Name: " + publisherName + "]";
    }
    
    
    
}
