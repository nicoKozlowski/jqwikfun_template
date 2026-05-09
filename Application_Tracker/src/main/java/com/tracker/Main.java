package com.tracker;

import com.tracker.model.Application;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<Application> add(List<Application> apps) {
        return apps;
    }

    static void main(String[] args) {
        List<Application> dräger = Arrays.asList(new Application(
                "DrägerWerk GmbH",
                "Moislinger Allee 53-55, 23558 Lübeck",
                "Werkstudent für IT-Lösungen und KI",
                "Fr, 01.05.2026",
                "pending",
                "??"));

        List<Application> natuvion = Arrays.asList(new Application(
                "Natuvion GmbH",
                "Altrottstraße 31, 69190 Walldorf",
                "Werkstudent mit Fokus IT & KI",
                "Mi, 29.04.2026",
                "pending",
                "??"));

        List<Application> IThochZWEI = Arrays.asList(new Application(
                "IThochZWEI GmbH",
                "Averhoffstraße, 22085 Hamburg",
                "Werkstudent im IT-Support & Systemadministration",
                "Mo, 20.04.2026",
                "pending",
                "??"));

        List<Application> brüggen = Arrays.asList(new Application(
                "H. & J. Brüggen KG",
                "Gertrudenstr. 15, 23568 Lübeck",
                "Werkstudent IT",
                "Fr, 08.05.2026",
                "cancelled",
                "??"));

        dräger.forEach(System.out::println);
        natuvion.forEach(System.out::println);
        IThochZWEI.forEach(System.out::println);
        brüggen.forEach(System.out::println);
    }
}
