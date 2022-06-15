package com.company;

import java.io.File;
import java.util.ArrayList;

public class BooksController {
    Catalogue catalogue = new Catalogue();
    CopyManagement copyManagement = new CopyManagement();

    public BooksController() {

    }

    public void createBook(int isbn, String author, String name) {
        catalogue.createBook(isbn, author, name);
    }

    public void addBook(int titleId) {
        copyManagement.addBook(titleId);
    }

    public int searchBook(String titleName) {
        return catalogue.searchBook(titleName);
    }

    public boolean checkIsbn(String isbn) {
        String sub = isbn.substring(0,11);
        int total = 0;
        for (int i = 0; i<sub.length(); i++){
            int c = sub.charAt(i);
            if (i % 2 == 1) {
                c *= 3;
            }
            total += c;
        }
        return (10 - total % 10) % 10 == (int) isbn.charAt(12);
    }

    public String generateBibTeX(int titleId) {
        return catalogue.generateBibTeX(titleId);
    }

    public String findBookLocation(int copyId) {
        return copyManagement.findBookLocation(copyId);
    }

    public File openOnlineLocation(int titleId) {
        return copyManagement.openOnlineLocation();
    }

    public void removeBook(int copyId) {
        copyManagement.removeBook(copyId);
    }

    public boolean checkBookAvailability(int titleId, int copyId) {
        boolean hasTitle = catalogue.checkBookAvailability(titleId);
        boolean hasBook = copyManagement.checkBookAvailability(copyId);
        return hasTitle && hasBook;
    }

    public int[] checkAvailability(int titleId) {
        return copyManagement.checkAvailabilty();
    }

}
