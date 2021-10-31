/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.BookDAO;
import DAO.BookDAOImpl;
import Model.Book;

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
}
