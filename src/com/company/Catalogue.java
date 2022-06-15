package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Catalogue {
    ArrayList<Copy> copies = new ArrayList<>();
    Set<Title> titles = new HashSet<>();

    public Catalogue () {
    }

    public void createBook(int isbn, String author, String name, String publisher) {
        int id = titles.size() + 1;
        Title title = new Title(id, isbn, author, name, publisher);
        titles.add(title);
    }

    public void addBook(int titleId) {
        for (Title title : titles) {
            if (titleId == title.getId()) {
                copies.add(new Copy(copies.size() + 1, title));
            }
        }
    }

    public int searchBook(String titleName) {
        for (Title title: titles) {
            if (Objects.equals(titleName, title.getName())) {
                return title.getId();
            }
        }
        return -1;
    }

    public boolean checkISBN(int isbn) {
        return false;
    }

    public String generateBibTeX(int title) {
        return null;
    }

    public ArrayList<Copy> getCopies() {
        return copies;
    }
}
