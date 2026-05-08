package com.tracker.model;

public class Application {
    private String company;
    private String address;
    private String position;
    private String date;
    private String status;
    private String contact;

    public Application (String comp,
                        String add,
                        String pos,
                        String d,
                        String stat,
                        String cont) {
        this.company = comp;
        this.address = add;
        this.position = pos;
        this.date = d;
        this.status = stat;
        this.contact = cont;
    }

    public String getCompany() {
        return this.company;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPosition() {
        return this.position;
    }

    public String getDate() {
        return this.date;
    }

    public String getStatus() {
        return this.status;
    }

    public String getContact() {
        return this.contact;
    }

    public String toString() {
        return String.format("%s: %s - %s | %s | %s | %s |",
                this.company,
                this.address,
                this.position,
                this.date,
                this.status,
                this.contact);
    }
}
