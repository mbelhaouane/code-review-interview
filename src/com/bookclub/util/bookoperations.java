package com.bookclub.util;

import com.bookclub.dao.BookDao;
import com.bookclub.model.book;

public class bookoperations { //class naming convention

	public static void rate(book book, double rating){
		if(rating>0){
			if(rating<=10){  //merge these two conditions into one
				book.rating = (book.rating + rating)/2;
				BookDao dao = new BookDao();
				dao.update(book);
			}
		}
	}

	public static void recommendbook(book book, boolean recommend){ //camel case
		if(recommend == true) // avoid using == true as a best practice, as a good practice use {}
			book.recommendation++;
		BookDao dao = new BookDao();
		dao.update(book);
	}

	public static void ratebookwithcomment(book book, double rating, String comment){ //camel case
		if(rating>0) {
			if (rating <= 10) {
				book.rating = book.rating + rating / 2;  // this duplidated code we can call rate method from here, aricthmetic operations
			}
		}
			book.rating = book.rating + rating/2;  // maybe notice that this is a copy/paste caused duplication
		book.comments = book.comments + ',' + comment; // Use StringBuilder here .append method
		BookDao dao = new BookDao();
		dao.update(book);
	}

	public static void downloadBook(book book){//maybe use polymorphism here, add three classes that represent book genre and implement a download method according to each class
		if(book.genre == "Adventure"){   // maybe also the candidate would suggest that we use "Adventure".equals here to avoid null pointer exception if it never shows itself
			book.DownloadAdventureBook();
		} else if(book.genre == "Thriller"){
			book.DownloadThrillerBook();
		} else if(book.genre == "Literature"){
			book.downloadLiteratureBook();
		}
	}

}
