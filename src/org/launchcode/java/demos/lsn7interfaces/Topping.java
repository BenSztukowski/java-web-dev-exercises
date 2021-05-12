package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Topping extends Ingredient{
    public Topping(String aName, double aCost, ArrayList<String> someAllergens) {
        super(aName, aCost, someAllergens);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getCost() {
        return super.getCost();
    }

    @Override
    public ArrayList<String> getAllergens() {
        return super.getAllergens();
    }

    @Override
    public String toString() {
        return "name: " + getName() + "\ncost: " + getCost() + "\nallergens: " + getAllergens();
    }
}
