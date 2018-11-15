package com.bookclub.dao;

import com.bookclub.model.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookDao {
	book book = null;  // suggest that this is local only to the method get of this class

	public void save(book B) {  // B not descriptive, B in capital letter
		try {
			Connection database;  // variable name is some kind of sloppy
			Class.forName("com.mysql.jdbc.Driver").newInstance();   //duplicated code
			String url = "jdbc:mysql://localhost/bookclub";         //use constants and maybe config file
			database = DriverManager.getConnection(url, "Manel", "Tahari");
			addBook(database, B);
			database.close();
		} catch (ClassNotFoundException ex) { //exception caught but nothing is logged


		} catch (IllegalAccessException ex) { //exception caught but nothing is logged


		} catch (InstantiationException ex) {
			System.err.println("InstantiationException thrown"); //Log is not relevant
		} catch (SQLException ex) {
			System.err.println("SQLException thrown");  //Log is not relevant
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

			//empty lines
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

//empty lines


		} catch (ClassNotFoundException ex) {


		} catch (IllegalAccessException ex) {


		} catch (InstantiationException ex) {
			System.err.println("InstantiationException thrown");
		} catch (SQLException ex) {
			System.err.println("SQLException thrown");
		}

	}

	public book getBookByTitle(Connection connection, String title){  // if these methods are not used anywhere else make them private
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
