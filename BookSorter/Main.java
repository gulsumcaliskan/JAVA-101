import java.util.HashSet;
import java.util.TreeSet;

public class Main
{
	public static void main(String[] args) {
		TreeSet<Book> booksOrderWithName = new TreeSet<>(new BookNameComparator());
		booksOrderWithName.add(new Book("Burning Secret", "Talia Dumbare", 250, "24/6/2022"));
		booksOrderWithName.add(new Book("Make Believe", "Patience Elwood", 71, "16/6/1988"));
		booksOrderWithName.add(new Book("Man of Tai Chi", "Moira Hasluck", 200, "1/6/2002"));
	    booksOrderWithName.add(new Book("Ghostmaker, The (Box of Shadows)", "Pancho Noller", 93, "1/2/1993"));
	    booksOrderWithName.add(new Book("Mummy: Tomb of the Dragon Emperor", "Aveline Wraggs", 1053, "13/2/2000"));
	    booksOrderWithName.add(new Book("Bride with White Hair", "Jaquenetta Jiranek", 90, "14/6/2002"));
	    booksOrderWithName.add(new Book("Guitar", "Harry Skipper", 105, "19/12/1993"));
	    booksOrderWithName.add(new Book("Boot Camp", "Sukey Killingsworth", 193, "21/7/1975"));
	    booksOrderWithName.add(new Book("Under the Tuscan Sun", "Bordy Krolle", 385, "14/9/2006"));
	    booksOrderWithName.add(new Book("Solomon Northup's Odyssey", "Cori Twelftree", 374, "25/11/2016"));
	    
	    for (Book book : booksOrderWithName
             ) {
            System.out.println(book.getName()+" "+book.getPageNo());
        }
        System.out.println("-------------------------------");
        
        TreeSet<Book> booksOrderWithPageNo = new TreeSet<>(new BookPageNoComparator());
        booksOrderWithName.add(new Book("Burning Secret", "Talia Dumbare", 250, "24/6/2022"));
		booksOrderWithName.add(new Book("Make Believe", "Patience Elwood", 71, "16/6/1988"));
		booksOrderWithName.add(new Book("Man of Tai Chi", "Moira Hasluck", 200, "1/6/2002"));
	    booksOrderWithName.add(new Book("Ghostmaker, The (Box of Shadows)", "Pancho Noller", 93, "1/2/1993"));
	    booksOrderWithName.add(new Book("Mummy: Tomb of the Dragon Emperor", "Aveline Wraggs", 1053, "13/2/2000"));
	    booksOrderWithName.add(new Book("Bride with White Hair", "Jaquenetta Jiranek", 90, "14/6/2002"));
	    booksOrderWithName.add(new Book("Guitar", "Harry Skipper", 105, "19/12/1993"));
	    booksOrderWithName.add(new Book("Boot Camp", "Sukey Killingsworth", 193, "21/7/1975"));
	    booksOrderWithName.add(new Book("Under the Tuscan Sun", "Bordy Krolle", 385, "14/9/2006"));
	    booksOrderWithName.add(new Book("Solomon Northup's Odyssey", "Cori Twelftree", 374, "25/11/2016"));
	    
        for (Book book : booksOrderWithPageNo
        ) {
            System.out.println(book.getName()+ " "+ book.getPageNo());
        }
	}
}
