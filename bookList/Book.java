import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Book {
    
    private String name;
    private String author;
    private int pageNo;
    private String publishedYear;
    
    public Book(String name, String author, int pageNo, String publishedYear){
        this.name = name;
        this.author = author;
        this.pageNo = pageNo;
        this.publishedYear = publishedYear;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public int getPageNo(){
        return pageNo;
    }
    
    public void setPageNo(int pageNo){
        this.pageNo = pageNo;
    }
    
    public String getPublishedYear(){
        return publishedYear;
    }
    
    public void setPublishedYear(String publishedYear){
        this.publishedYear = publishedYear;
    }
    
    
}