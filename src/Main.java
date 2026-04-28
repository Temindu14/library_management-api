//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book = new Book("Ahh", "Ohh", "Ehh", 29.99, 3, 2026);
        Book book2 = new Book("Aha", "Oho", "Ehe", 19.99, 5, 2025);

        System.out.println(book);

        book.setPrice(39.99);
        System.out.println(book);

        Member member = new Member("Tom", "MI00001", "0771234567","Kegalle" , 14/10/1990, true );
        System.out.println(member);

        member.borrowBook(book);
        member.borrowBook(book2);

        System.out.println(member.getBorrowedBooks());

        member.returnBook(book);

        System.out.println(member.getBorrowedBooks());



        }


}
