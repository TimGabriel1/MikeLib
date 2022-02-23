/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Model.Member;
import java.util.List;

/**
 *
 * @author mac
 */
public interface MemberDAO {
    boolean saveMember(Member member);
    Member getMember(String key);
    Member getMember(int id);
    List<Member> getMembers();
    boolean deleteMember(int id);
    boolean editMember(Member member);
}
