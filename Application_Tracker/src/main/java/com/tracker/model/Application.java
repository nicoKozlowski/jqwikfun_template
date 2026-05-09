package com.tracker.model;

public class Application {
    private String company;
    private String address;
    private String position;
    private String date;
    private posStates state;
    private String contact;

    public Application (String comp,
                        String add,
                        String pos,
                        String d,
                        posStates stat,
                        String cont) {
        this.company = comp;
        this.address = add;
        this.position = pos;
        this.date = d;
        this.state = stat;
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

    public posStates getStatus() {
        return this.state;
    }

    public String getContact() {
        return this.contact;
    }

    public enum posStates {
        pending,
        interview,
        cancelled,
        ghosted
    }

    public void setStatus(posStates stat) {
        this.state = stat;
    }

    @Override
    public String toString() {
        return String.format("\n%s: \n| address: %s |\n| position: %s |\n| date: %s |\n| state: %s |\n| contact: %s |",
                this.company,
                this.address,
                this.position,
                this.date,
                this.state,
                this.contact);
    }
}
