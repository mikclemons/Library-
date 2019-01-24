package com.company;

public class Book {


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
    public String printBookDetails(){
        return "The book you have chosen is " + getTitle() + " by " + getAuhor() + " and has " + getNumberOfPages() + " pages. " + "This book is a " + getGenre() + ".";

    }


}
