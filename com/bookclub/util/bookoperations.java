package com.bookclub.util;

import com.bookclub.dao.BookDao;
import com.bookclub.model.book;

public class bookoperations {

	public static void rate(book book, double rating){
		if(rating>0){
			if(rating<=10){
				book.rating = (book.rating + rating)/2;
				BookDao dao = new BookDao();
				dao.update(book);
			}
		}
	}

	public static void recommendbook(book book, boolean recommend){
		if(recommend == true)
			book.recommendation++;
		BookDao dao = new BookDao();
		dao.update(book);
	}

	public static void ratebookwithcomment(book book, double rating, String comment){
		if(rating>0) {
			if (rating <= 10) {
				book.rating = book.rating + rating / 2;
			}
		}
			book.rating = book.rating + rating/2;
		book.comments = book.comments + ',' + comment;
		BookDao dao = new BookDao();
		dao.update(book);
	}

	public static void downloadBook(book book){
		if(book.genre == "Adventure"){ 
			book.DownloadAdventureBook();
		} else if(book.genre == "Thriller"){
			book.DownloadThrillerBook();
		} else if(book.genre == "Literature"){
			book.dwnloadLiteratureBook();
		}
	}

}
