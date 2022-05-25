package com.company;

import java.time.LocalDate;

public class Rental
{
    private int copyId;
    private int lenderId;
    private LocalDate rentedAt;
    private LocalDate rentalEndDate;

    public Rental(int copyId, int lenderId, LocalDate rentedAt, LocalDate rentalEndDate)
    {
        this.copyId = copyId;
        this.lenderId = lenderId;
        this.rentedAt = rentedAt;
        this.rentalEndDate = rentalEndDate;
    }
}