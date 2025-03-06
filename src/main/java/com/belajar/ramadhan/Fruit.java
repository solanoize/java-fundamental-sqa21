package com.belajar.ramadhan;

public class Fruit {
    int grams;
    int calsPerGrams;

    int totalCalories() {
        return grams * calsPerGrams;
    }
}
