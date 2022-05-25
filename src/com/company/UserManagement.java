package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class UserManagement {
    private ArrayList<Lender> lenders;

    public UserManagement() {
        lenders = new ArrayList<Lender>();
    }

    public void registerUser(String name, String email) {
        lenders.add(new Lender(lenders.size() + 1, name, email, LocalDate.now()));
    }

    public void deactivateUser(int lenderId) {
        for (Lender lender : lenders) {
            if (lenderId == lender.getId()) {
                lender.setDeactivated(true);
            }

        }
    }

}
