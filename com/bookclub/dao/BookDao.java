package com.bookclub.dao;

import com.bookclub.model.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookDao {
	book book = null;

	public void save(book B) {
		try {
			Connection database;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://localhost/bookclub";
			database = DriverManager.getConnection(url, "Manel", "Tahari");
			addBook(database, B);
			database.close();
		} catch (ClassNotFoundException ex) {


		} catch (IllegalAccessException ex) {


		} catch (InstantiationException ex) {
			System.err.println("InstantiationException thrown");
		} catch (SQLException ex) {
			System.err.println("SQLException thrown");
		}
	}

	public book get(String title) {
		try {
			Connection database;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://localhost/bookclub";
			database = DriverManager.getConnection(url, "Manel", "Tahari");
			book = getBookByTitle(database, title);
			database.close();


		} catch (ClassNotFoundException ex) {


		} catch (IllegalAccessException ex) {


		} catch (InstantiationException ex) {

			
			System.err.println("InstantiationException thrown");
		} catch (SQLException ex) {


			System.err.println("SQLException thrown");
		}

		return book;
	}

	public void update(book book) {
		try {
			Connection database;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://localhost/bookclub";
			database = DriverManager.getConnection(url, "Manel", "Tahari");
			updateBook(database, book);
			database.close();




		} catch (ClassNotFoundException ex) {


		} catch (IllegalAccessException ex) {


		} catch (InstantiationException ex) {
			System.err.println("InstantiationException thrown");
		} catch (SQLException ex) {
			System.err.println("SQLException thrown");
		}

	}

	public book getBookByTitle(Connection connection, String title){  
		// TO DO
		return new book();
	}

	public void addBook(Connection connection, book book){
		//TO DO
		//Adds a new book to the books table in the database
	}


	public void updateBook(Connection connection, book book){
		//TO DO
		// Update an existing book in the database
	}
}
