import com.bookclub.dao.BookDao;
import com.bookclub.model.book;
import com.bookclub.util.bookoperations;

public class Main {

    public static void main(String[] args) {



	    String string = null;
	    string = args[0];

	    String title = extractBookTitle(args[0]);
	    BookDao bookdao = new BookDao();
	    book Book = bookdao.get(title);
	    bookoperations.rate(Book, 9);
	    System.out.print(Book.title + " rated");
	    bookoperations.recommendbook(Book, true);
	    System.out.print(Book.title + " recommended");
    }

	public static String extractBookTitle(String info){

		if(info.isEmpty()){
			System.out.println("No book info were given");
			return "";
		}

		String[] information = info.split(",");

		return information[0];
	}

}