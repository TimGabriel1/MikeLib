/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Book;
import Util.DBConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class BookDAOImpl implements BookDAO{

    private Connection connection;
    private PreparedStatement preparedStmt;
    private List<Book> list;
    private Statement statement;
    private ResultSet resultSet;

    @Override
    public boolean saveBook(Book book) {
         boolean flag = false;
        try {

      
            String sql = "insert into book(bookTitle, authorName, year, isbn) "
                    + "values('" + book.getName() + "','" +book.getAuthor() + "','" +  book.getYear() + "','" + book.getISBN() + "')";
            try {
                connection = DBConnectionUtil.openConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            preparedStmt = connection.prepareStatement(sql);
            preparedStmt.executeUpdate();
            flag = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Book getBook(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book getBook(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Book> getBooks() {
        try {
            list = new ArrayList<>();
            String sql = "select * from Book ";
            connection = DBConnectionUtil.openConnection();
            Book book;

            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setName(resultSet.getString("bookTitle"));
                book.setYear(resultSet.getString("year"));
                book.setAuthor(resultSet.getString("authorName"));
                book.setISBN(resultSet.getString("isbn"));
                book.setDateAdded(resultSet.getDate("dateAdded"));

 

                list.add(book);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }

        return list;
    }
    
    
    
}
