package com.company;

import java.time.LocalDate;

public class Reservation extends Rental {
    private LocalDate reservedAt;


    public Reservation(int copyId, int lenderId, LocalDate rentedAt, LocalDate rentalEndDate, LocalDate reservedAt)
    {
        super(copyId, lenderId, rentedAt, rentalEndDate);
        this.reservedAt = reservedAt;
    }
}
