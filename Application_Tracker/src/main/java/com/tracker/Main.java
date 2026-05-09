package com.tracker;

import com.tracker.model.Application;

public class Main {

    static void main(String[] args) {
        Application dräger = new Application(
                "DrägerWerk GmbH",
                "Moislinger Allee 53-55, 23558 Lübeck",
                "Werkstudent für IT-Lösungen und KI",
                "Fr, 01.05.2026",
                Application.posStates.pending,
                "??");

        Application natuvion = new Application(
                "Natuvion GmbH",
                "Altrottstraße 31, 69190 Walldorf",
                "Werkstudent mit Fokus IT & KI",
                "Mi, 29.04.2026",
                Application.posStates.pending,
                "??");

        Application IThochZWEI = new Application(
                "IThochZWEI GmbH",
                "Averhoffstraße, 22085 Hamburg",
                "Werkstudent im IT-Support & Systemadministration",
                "Mo, 20.04.2026",
                Application.posStates.pending,
                "??");

        Application brüggen = new Application(
                "H. & J. Brüggen KG",
                "Gertrudenstr. 15, 23568 Lübeck",
                "Werkstudent IT",
                "Fr, 08.05.2026",
                Application.posStates.cancelled,
                "??");

        System.out.println(dräger);
        System.out.println(natuvion);
        System.out.println(IThochZWEI);
        System.out.println(brüggen);
    }
}
