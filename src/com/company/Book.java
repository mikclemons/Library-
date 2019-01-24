package com.company;

public class Book {
    // Create a new class named Book and give it at least (4) properties (such as title, author, number of pages, etc.).
    // Create getter & setter methods for each variable.
    // Create a printDetails() method which will display all available information about a Book object.
    //Create a new class named Library and give it (1) property: an array of Book objects.
    // Library should have a numberOfBooksInLibrary() method which displays how many Books the user has in their Library.
    // In a class named BookDemo, give the user (3) options:
    // they can see how many books they have,
    // add a book to their Library,
    // or exit the program.
    // If they choose to add a book, they should be prompted to enter all the necessary details about each book.
    // The user should be able to add as many books as they want, and view the number of books in their library as often as they wish.

    private String title;
    private String author;
    private int numberOfPages;
    private String genre;

    public void setTitle(String bookTitle){
        title = bookTitle;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String bookAuthor){
        author = bookAuthor;
    }
    public String getAuhor(){
        return author;
    }
    public void setNumberOfPages(int bookNumberOfPages){
        numberOfPages = bookNumberOfPages;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }
    public void setGenre(String bookGenre){
        genre = bookGenre;
    }
    public String getGenre(){
        return genre; 
    }

}
