package com.company;

import java.util.ArrayList;

public class RentalController {
    RentalManagement rentalManagement;
    CopyManagement copyManagement;

    public RentalController() {

    }

    public void reserveBook(int lenderId, int titleId) {
        rentalManagement.reserveBook(titleId);
    }

    public void rentBook(int lenderId, int copyId) {
        copyManagement.setAvailable(copyId, false);
        rentalManagement.startRental(lenderId, copyId);
    }

    public void returnBook(int copyId, int lenderId) {
        rentalManagement.endRental(lenderId, copyId);
        copyManagement.setAvailable(copyId, true);
    }

    public ArrayList<Rental> reportLenderRentalHistory(int lenderId) {

    }

}
