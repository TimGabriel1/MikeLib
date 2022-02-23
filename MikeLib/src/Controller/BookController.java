/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.BookDAO;
import DAO.BookDAOImpl;
import Model.Book;
import java.util.List;

/**
 *
 * @author mac
 */
public class BookController {
    BookDAO bookDAO = new BookDAOImpl();
    public boolean saveBook(Book book){
        if(bookDAO.saveBook(book)){
            return true;
        }else
            return false;
    }
     public List<Book> getBooks(){
        if(bookDAO.getBooks() != null){
            return bookDAO.getBooks();
        }
        return null;
    }
    
    
    public void uploadBookCsv(String csv){
        
    }
    
    public Book getBook(int id){
        return bookDAO.get(id);
    }
    
    public boolean deleteBook(int id){
        return bookDAO.delete(id);
    }
    
    public boolean updateBook(Book newUpdate){
        return bookDAO.update(newUpdate);
    }
}
