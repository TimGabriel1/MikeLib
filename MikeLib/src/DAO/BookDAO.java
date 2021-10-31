/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Model.Book;
import java.util.List;

/**
 *
 * @author mac
 */
public interface BookDAO {
    boolean saveBook(Book book);
    Book getBook(String key);
    Book getBook(int id);
    List<Book> getBooks();
    
}
