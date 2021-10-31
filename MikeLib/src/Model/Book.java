/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author mac
 */
public class Book {
    private int id;
    private String name;
    private String ISBN;
    private String year;
    private Date dateAdded;
    private String author;

    public Book() {
    }

    public Book(int id, String name, String ISBN, String year, Date dateAdded, String author) {
        this.id = id;
        this.name = name;
        this.ISBN = ISBN;
        this.year = year;
        this.dateAdded = dateAdded;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", ISBN=" + ISBN + ", year=" + year + ", dateAdded=" + dateAdded + ", author=" + author + '}';
    }

   
    
    
}
