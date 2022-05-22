import java.util.Comparator;

public class BookNameComparator implements Comparator<Book> {
    
    @Override
    
    public int compare(Book b1, Book b2){
        if(!b1.getName().equals(b2.getName())){
            return b1.getName().compareTo(b2.getName());
        }else {
            return (b1.getPageNo()-(b2.getPageNo())) == 0 ? 1 : -1;
        }
    }
}