package JavaOOPBasic.Inheritance.bookShop.bookShop;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            String author = scanner.nextLine();
            String title = scanner.nextLine();
            Double price = Double.parseDouble(scanner.nextLine());

            Book book = new Book(title,author,price);

            GoldenEditionBook goldenEditionBook = new GoldenEditionBook(title,author,price);

            Method[] bookDeclaredMethods = Book.class.getDeclaredMethods();
            Method[] goldenBookDeclaredMethods = GoldenEditionBook.class.getDeclaredMethods();

            if (goldenBookDeclaredMethods.length >1){
                throw new IllegalArgumentException("Code duplication is GoldenEditionBook");
            }

            System.out.println(book.toString());
            System.out.println(goldenEditionBook.toString());
        }catch (IllegalArgumentException error){
            System.out.println(error.getMessage());
        }
    }
}
