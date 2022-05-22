import java.util.Comparator;

public class BookPageNoComparator implements Comparator<Book> {
    
    @Override
    public int compare(Book b1, Book b2) {
        if(b1.getPageNo()!= b2.getPageNo()){
            return b1.getPageNo() - b2.getPageNo();
        }
        else {
           return b1.getName().compareTo(b2.getName())==0 ? -1 : 1;
        }
    }
}