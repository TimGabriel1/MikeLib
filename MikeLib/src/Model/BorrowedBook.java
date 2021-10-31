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
public class BorrowedBook {

    private int id;
    private int memberID;
    private int bookID;
    private Date dateCollected;
    private Date dateReturned;
    private boolean returned;
    private int issuedBy;

    public BorrowedBook() {
    }

    public BorrowedBook(int id, int memberID, int bookID, Date dateCollected, Date dateReturned, boolean returned, int issuedBy) {
        this.id = id;
        this.memberID = memberID;
        this.bookID = bookID;
        this.dateCollected = dateCollected;
        this.dateReturned = dateReturned;
        this.returned = returned;
        this.issuedBy = issuedBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public Date getDateCollected() {
        return dateCollected;
    }

    public void setDateCollected(Date dateCollected) {
        this.dateCollected = dateCollected;
    }

    public Date getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public int getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(int issuedBy) {
        this.issuedBy = issuedBy;
    }

    @Override
    public String toString() {
        return "BorrowedBook{" + "id=" + id + ", memberID=" + memberID + ", bookID=" + bookID + ", dateCollected=" + dateCollected + ", dateReturned=" + dateReturned + ", returned=" + returned + ", issuedBy=" + issuedBy + '}';
    }
    
    
    
}
