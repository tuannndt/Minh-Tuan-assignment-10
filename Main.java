package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Main {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Author author = null;
        Book book = null;
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Create Author");
            System.out.println("2. Create Book");
            System.out.println("3. View Author Details");
            System.out.println("4. View Book Details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter author name: ");
                    String authorName = scanner.nextLine();
                    System.out.print("Enter author date of birth (yyyy-MM-dd): ");
                    String dob = scanner.nextLine();
                    try {
                        Date  dateOfBirth = dateFormat.parse(dob);
                        author = new Author(authorName, dateOfBirth);
                        System.out.println("Author created successfully!");
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please try again.");
                    }
                    break;

                case 2:
                    if (author == null) {
                        System.out.println("Please create an author first.");
                    } else {
                        System.out.print("Enter book title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter book price: ");
                        double price = scanner.nextDouble();
                        scanner.nextLine();  // consume newline
                        book = new Book(title, author.getName(), price);
                        System.out.println("Book created successfully!");
                    }
                    break;

                case 3:
                    if (author != null) {
                        System.out.println("Author Details:");
                        System.out.println(author);
                    } else {
                        System.out.println("No author found. Please create an author first.");
                    }
                    break;

                case 4:
                    if (book != null) {
                        System.out.println("Book Details:");
                        System.out.println(book);
                    } else {
                        System.out.println("No book found. Please create a book first.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}