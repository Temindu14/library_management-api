//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Library library = new Library();


        Book book = new Book("Ahh", "Ohh", "Ehh", 29.99, 3, 2026);
        Book book2 = new Book("Aha", "Oho", "Ehe", 19.99, 5, 2025);


        library.addBook(book);
        library.addBook(book2);

        Member member = new Member("Tom", "MI00001", "0771234567","Kegalle" , 1990, true );
        library.addMember(member);





        library.borrowBook(member , book);

        System.out.println(member.getBorrowedBooks());

        library.returnBook(member, book);

        System.out.println(member.getBorrowedBooks());


        }


}
