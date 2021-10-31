/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import DAO.MemberDAO;
import DAO.MemberDAOImpl;
import Model.Member;

/**
 *
 * @author mac
 */
public class MemberController {
   MemberDAO memberDAO = new MemberDAOImpl();
    public boolean saveMember(Member member){
        if(memberDAO.saveMember(member)){
            return true;
        }else
            return false;
    }
}
