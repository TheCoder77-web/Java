import java.io.IOException;
import java.sql.*;
/*
Use the chinook database to write the SQL statements to produce the info asked (using chinookDBdiagram.jpg to decide which tables contain the required info and their relationships)
*/
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {

    String sql = "";
    String result ="";     
		Database db = new Database("jdbc:sqlite:chinook.db");	

    // Problem 1:
    // For the first 30 tracks, get the name of the track and the album name that it belongs to.
    sql = "SELECT tracks.name, albums.title FROM tracks INNER JOIN albums ON tracks.albumId = albums.albumId LIMIT 30;";
    result = db.runSQL(sql,"table-auto");
    print(result);

    // Problem 2:
    // // For every Invoice in April 2012, retrieve the customer's first name & last name, invoice id, and invoice date.  (Invoice date format: YYYY-MM-DD)
    sql = "SELECT customers.firstname, customers.lastname, invoices.invoiceid, invoices.invoicedate FROM customers INNER JOIN invoices ON customers.customerid = invoices.customerid WHERE invoices.invoicedate LIKE '2012-04%';";
    result = db.runSQL(sql,"table-auto");
    print(result);

    // Problem 3:
    // For the first 20 invoices, get the customer id, invoice id, track name, unit price and quantity. (Hint: information is across 3 tables)
    sql = "SELECT customers.customerid, invoices.invoiceid,invoice_items.unitprice, invoice_items.quantity FROM customers INNER JOIN invoices ON customers.customerid = invoices.customerid INNER JOIN invoice_items ON invoices.invoiceid=invoice_items.invoiceid LIMIT 20;";
    result = db.runSQL(sql,"table-auto");
    print(result);

    // Problem 4:
    // What is the list of customer names whose merchandise is being shipped either to the USA, Germany or Poland? (Hint: use BillingCountry in invoices table). (REMOVE DUPLICATES)
    sql = "SELECT DISTINCT customers.firstname, customers.lastname FROM customers INNER JOIN invoices ON customers.customerid = invoices.customerid WHERE invoices.billingcountry IN ('USA','Germany','Poland');";
    result = db.runSQL(sql,"table-auto");
    print(result);

    // Problem 5:
    // List the first 20 song(track) names that are “Latin” music (genre)?
    sql = "SELECT tracks.name FROM tracks INNER JOIN genres ON tracks.genreId = genres.genreID WHERE genres.name='Latin' LIMIT 20;";
    result = db.runSQL(sql,"table-auto");
    print(result);

    // Problem 6:
    // List all the “Jazz” album titles. 'Jazz' is a genre. (REMOVE DUPLICATES)
    sql = "SELECT DISTINCT albums.title FROM albums INNER JOIN tracks ON tracks.albumId = albums.albumId INNER JOIN genres ON tracks.genreId = genres.genreID WHERE genres.name='Jazz';";
    result = db.runSQL(sql,"table-auto");
    print(result);

    // Problem 7:
    // List all the Pop Artist names. 'Pop' is a genre. (REMOVE DUPLICATES)
    sql = "SELECT DISTINCT artists.name FROM artists INNER JOIN albums On artists.artistId = albums.artistId INNER JOIN tracks On tracks.albumId = albums.albumId INNER JOIN genres On tracks.genreId = genres.genreID WHERE genres.name='Pop';";
    result = db.runSQL(sql,"table-auto");
    print(result);
      
  }    
}