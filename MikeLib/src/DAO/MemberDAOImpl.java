/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Member;
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
public class MemberDAOImpl implements MemberDAO{

    private Connection connection;
    private PreparedStatement preparedStmt;
    private List<Member> list;
    private Statement statement;
    private ResultSet resultSet;

    @Override
    public boolean saveMember(Member member) {
        boolean flag = false;
        try {

      
            String sql = "insert into member(idNumber, name, phoneNumber, email) "
                    + "values('" + member.getIdNumber() + "','" +member.getName() + "','" +  member.getPhoneNumber()+ "','" + member.getEmail() + "')";
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
    public Member getMember(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Member getMember(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Member> getMembers() {
        try {
            list = new ArrayList<>();
            String sql = "select * from Member ";
            connection = DBConnectionUtil.openConnection();
            Member member;

            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                member = new Member();
                member.setId(resultSet.getInt("id"));
                member.setName(resultSet.getString("name"));
                member.setPhoneNumber(resultSet.getString("phoneNumber"));
                member.setEmail(resultSet.getString("email"));
                member.setIdNumber(resultSet.getString("idNumber"));
 

                list.add(member);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }

        return list;
    }

    @Override
    public boolean deleteMember(int id) {
        boolean flag = false;
        try {

      
            String sql = "DELETE FROM member WHERE id="+id;
            connection = DBConnectionUtil.openConnection();
            preparedStmt = connection.prepareStatement(sql);
            preparedStmt.executeUpdate();
            flag = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean editMember(Member member) {
        boolean flag = false;
        try {
            String sql = "UPDATE member SET idNumber = '"+member.getIdNumber()
                    +"', name = '"+member.getName()+"', phoneNumber = '"+member.getPhoneNumber()
                    +"', email = '"+member.getEmail()+"' WHERE id='"+member.getId()+"'";
            connection = DBConnectionUtil.openConnection();
            preparedStmt = connection.prepareStatement(sql);
            preparedStmt.executeUpdate();
            flag = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    
    
    
}
