import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Main
{
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("Burning Secret", "Talia Dumbare", 250, "24/6/2022"));
		books.add(new Book("Make Believe", "Patience Elwood", 71, "16/6/1988"));
		books.add(new Book("Man of Tai Chi", "Moira Hasluck", 200, "1/6/2002"));
	    books.add(new Book("Ghostmaker, The (Box of Shadows)", "Pancho Noller", 93, "1/2/1993"));
	    books.add(new Book("Mummy: Tomb of the Dragon Emperor", "Aveline Wraggs", 1053, "13/2/2000"));
	    books.add(new Book("Bride with White Hair", "Jaquenetta Jiranek", 90, "14/6/2002"));
	    books.add(new Book("Guitar", "Harry Skipper", 105, "19/12/1993"));
	    books.add(new Book("Boot Camp", "Sukey Killingsworth", 193, "21/7/1975"));
	    books.add(new Book("Under the Tuscan Sun", "Bordy Krolle", 385, "14/9/2006"));
	    books.add(new Book("Solomon Northup's Odyssey", "Cori Twelftree", 374, "25/11/2016"));
	    
	    HashMap<String, String> map = new HashMap<>();
	    books.stream().forEach(book -> map.put(book.getName(), book.getAuthor()));
	    List<Book> filteredList = new ArrayList<>();
	    books.stream().filter(book -> book.getPageNo() > 100).forEach(book -> filteredList.add(book));
	    
	}
}
