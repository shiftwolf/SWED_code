package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class RentalManagement {
    private ArrayList<Rental> rentals;
    private Catalogue catalogue;

    public RentalManagement() {
        rentals = new ArrayList<Rental>();
        catalogue = new Catalogue(null, null);
    }

    public void rentBook(int copyId, int lenderId) {
        ArrayList<Copy> copies = catalogue.getCopies();

        for (Copy copy : copies) {
            if (copyId == copy.getId()){
                copy.setAvailable(false);
            }
        }
        rentals.add(new Rental(copyId, lenderId, LocalDate.now(), LocalDate.now().plusDays(14)));
    }

    public void returnBook(int copyId) {
        ArrayList<Copy> copies = catalogue.getCopies();
        for (Copy copy : copies) {
            if (copyId == copy.getId()){
                copy.setAvailable(true);
            }
        }
    }

    public boolean checkAvailability(int copyId) {
        return false;
    }

}
