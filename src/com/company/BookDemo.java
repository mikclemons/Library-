package com.company;
import java.util.Scanner;


public class BookDemo {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int userInput = 0;
        Library library = new Library();
        boolean running = true;
        do {
            System.out.println("Welcome to the Library!");
            System.out.println("What would you like to do\n" +
                    "1: Add a book\n" +
                    "2: View number of books\n" +
                    "3: Exit\n");
            System.out.println("Enter a number only: ");

            userInput = myScanner.nextInt();

            System.out.println("You have selected " + userInput);

            switch (userInput) {
                case 1:
                    if (library.hasRoom()) {

                        Book newBook = new Book();
                        System.out.println("You have chosen to add a book to your Library!\n");
                        System.out.println("What is the name of the book?");
                        myScanner.nextLine();
                        String newTitle = myScanner.nextLine();
                        newBook.setTitle(newTitle);

                        System.out.println("Who is the author of that book?");
                        String newAuthor = myScanner.nextLine();
                        newBook.setAuthor(newAuthor);

                        System.out.println("What genre of book is your book?");
                        String newGenre = myScanner.nextLine();
                        newBook.setGenre(newGenre);

                        System.out.println("What year was your book published?");
                        int newYear = myScanner.nextInt();
                        newBook.setYearOfPublication(newYear);

                        System.out.println("Here are the details of the book you have chosen to add to your library:\n");
                        newBook.printBookDetails();

                        library.addBook(newBook);

                        System.out.println("\nThe number of books in the library is " + library.numberOfBooksInLibrary());
                        System.out.println("\nHere is what is currently in your library:\n");
                        library.printBooks();
                    } else {
                        System.out.println("The library is full!/n");
                    }
                    break;
                case 2:
                    System.out.println("You have chosen to view your library!");
                    System.out.println("The number of books is " + library.numberOfBooksInLibrary());
                    System.out.println("Here is what is currently in your library:");
                    library.printBooks();
                    break;
                case 3:
                    System.out.println("You have chosen to exit the library.");
                    System.out.println("Thanks for visiting the library!");
                    running = false;
                    break;
                default:
                    System.out.println("Please choose one of the three options.");
            }
        } while (running);

    }
}
