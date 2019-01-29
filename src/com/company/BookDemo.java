package com.company;
import java.util.Scanner;


public class BookDemo {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int userInput = 0;
        Library library = new Library();

        System.out.println("Welcome to the Library!");
        System.out.println("What would you like to do\n" +
                "1: Add a book\n" +
                "2: View number of books\n"+
                "3: Exit\n");
        System.out.println("Enter a number only: ");

        userInput = myScanner.nextInt();

        System.out.println("The user input " + userInput);

        switch(userInput){
            case 1:
                boolean addAnother = false;
                do{

                } while (addAnother == true);
                Book newBook = new Book();
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


                newBook.printBookDetails();

                library.addBook(newBook);

                System.out.println("The number of books in the library is " + library.numberOfBooksInLibrary());
                library.printBooks();
        }
    }

}

