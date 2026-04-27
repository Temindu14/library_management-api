//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book = new Book("Ahh", "Ohh", "Ehh", 29.99, 3, 2026);


        System.out.println(book);

        book.setPrice(39.99);
        System.out.println(book);

        Member member = new Member("Tom", "MI00001", "0771234567","Kegalle" , 14/10/1990, true );
        System.out.println(member);

        member.setActive(false);
        System.out.println(member);



        }


}
