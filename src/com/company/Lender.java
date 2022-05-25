package com.company;

import java.time.LocalDate;

public class Lender {
        private int id;
        private String name;
        private String email;
        private LocalDate joinedAt;
        private boolean isDeactivated;

        public Lender(int id, String name, String email, LocalDate joinedAt)
        {
            this.id = id;
            this.name = name;
            this.email = email;
            this.joinedAt = joinedAt;
            this.isDeactivated = false;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDeactivated() {
        return isDeactivated;
    }

    public void setDeactivated(boolean deactivated) {
        isDeactivated = deactivated;
    }
}
