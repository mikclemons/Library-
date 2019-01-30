package com.company;


public class Book {


    private String title;
    private String author;
    private int yearOfPublication;
    private String genre;

    public void setTitle(String bookTitle) {

        title = bookTitle;
    }

    public String getTitle() {

        return title;
    }

    public void setAuthor(String bookAuthor) {

        author = bookAuthor;
    }

    public String getAuhor() {

        return author;
    }

    public void setYearOfPublication(int bookYearOfPublication) {
        yearOfPublication = bookYearOfPublication;
    }

    public int getYearOfPublication() {

        return yearOfPublication;
    }

    public void setGenre(String bookGenre) {

        genre = bookGenre;
    }

    public String getGenre() {

        return genre;
    }

    public void printBookDetails() {
        System.out.println("The title is " + title +
                ", the author is " + author +
                ", the genre is " + genre +
                ", and the year of publication is " + yearOfPublication + ".");
    }

}


