package com.example.weightlosstracker;

import java.time.LocalDate;

public class Entry {
    int weight;
    LocalDate date;

    public Entry(int w, LocalDate d){
        weight = w;
        date = d;
    }

    public int getWeight() {
        return weight;
    }

    public LocalDate getDate() {
        return date;
    }
}
