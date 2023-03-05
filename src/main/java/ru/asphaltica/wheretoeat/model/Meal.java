package ru.asphaltica.wheretoeat.model;

import java.time.LocalDate;

public class Meal {

    private final int restaurantId;
    private final int id;
    private final LocalDate date;
    private final String name;
    private final double price;

    public Meal(int restaurantId, int id, LocalDate date, String name, double price) {
        this.restaurantId = restaurantId;
        this.id = id;
        this.date = date;
        this.name = name;
        this.price = price;
    }
}
