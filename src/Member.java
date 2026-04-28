import java.util.ArrayList;

public class Member {

    private String name;
    private String memberID;
    private String phoneNumber;
    private String address;
    private int dateOfBirth;
    private boolean isActive;
    private ArrayList<Book> borrowedBooks;

    public Member(String name, String memberID, String phoneNumber, String address, int dateOfBirth, boolean isActive) {
        this.name = name;
        this.memberID = memberID;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.isActive = isActive;
        this.borrowedBooks = new ArrayList<>();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    @Override
    public String toString() {
        return "Member name: " + name + ",Member ID: " + memberID + ",Phone Number: " + phoneNumber+ ",Member Activity: " + isActive;

    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);

    }

    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }

    public ArrayList<Book> getBorrowedBooks(){
        return borrowedBooks;
    }

}



