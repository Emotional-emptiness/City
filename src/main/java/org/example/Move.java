package org.example;

import org.example.database.GsonParser;

import java.util.ArrayList;
import java.util.HashSet;

public class Move {

    private ArrayList<String> cities;  // ідея підказує щоб доставити static
    private HashSet<String> usedCities;  // ідея підказує щоб доставити static
    private String lastCity;


    public Move() {
        cities = new ArrayList<>();
        usedCities = new HashSet<>();
        GsonParser gsonParser = new GsonParser();
        cities.addAll(gsonParser.getCityNames());

    }


    public void playGame(String input) {

        // Хід гравця

        if (check(input)) {
            usedCities.add(input);
            lastCity = input;
        } else if (input.equals("I give up")) {
            // повідомлення в інтерфейс про програш гравця
        }
    }

    private boolean check(String input) {
        return !usedCities.contains(input) &&
                input.startsWith(lastCity.substring(lastCity.length() - 1).toUpperCase());
    }

    public String getComputerMove() {

        String nextCity = "";

        for (String city : cities) {
            if (check(city)) {
                nextCity = city;
                break;
            }
        }
        if (nextCity.isEmpty()) {
            return "Congratulations! You won! The computer can't find the next move.";
            //повідомлення в інтерфейс про програш комп'ютера
        }
        lastCity = nextCity;
        usedCities.add(nextCity);
        return nextCity;
    }
}
