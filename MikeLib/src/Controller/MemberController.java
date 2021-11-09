/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import DAO.MemberDAO;
import DAO.MemberDAOImpl;
import Model.Member;
import java.util.List;

/**
 *
 * @author mac
 */
public class MemberController {
    private MemberDAO memberDAO = new MemberDAOImpl();
    public boolean saveMember(Member member){
        if(memberDAO.saveMember(member)){
            return true;
        }else
            return false;
    }
    
    public List<Member> getAllMembers(){
        return memberDAO.getMembers();
    }
    
    public boolean editMember(Member updatedMemberDet){
        return memberDAO.editMember(updatedMemberDet);
    }
    
    public boolean deleteMember(int id){
        return memberDAO.deleteMember(id);
    }
}
