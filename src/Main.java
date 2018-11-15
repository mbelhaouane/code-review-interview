import com.bookclub.dao.BookDao;
import com.bookclub.model.book;
import com.bookclub.util.bookoperations;

public class Main {

    public static void main(String[] args) {

//empty lines

	    String string = null;
	    string = args[0];

	    String title = extractBookTitle(args[0]);
	    BookDao bookdao = new BookDao(); //camel case
	    book Book = bookdao.get(title);
	    bookoperations.rate(Book, 9);
	    System.out.print(Book.title + " rated"); //include log inside method
	    bookoperations.recommendbook(Book, true);
	    System.out.print(Book.title + " recommended"); //include log inside method
    }

	public static String extractBookTitle(String info){

		if(info.isEmpty()){  //test over null
			System.out.println("No book info were given");
			return "";
		}

		String[] information = info.split(",");

		return information[0];
	}

}
