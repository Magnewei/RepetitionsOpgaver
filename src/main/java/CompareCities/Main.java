package CompareCities;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        City city = new City();

        List<City> cities = new ArrayList<>();
        cities.add(new City("Kongens Lyngby", 57500));
        cities.add(new City("Ribe", 8257));
        cities.add(new City("Storvorde", 3425));
        cities.add(new City("Tarm", 4010));
        cities.add(new City("Horreby", 305));
        city.addCities(cities);

        System.out.println("The biggest city is named: " + city.getBiggestCity().getName());
        System.out.println("Total population of all cities: " + city.getTotalPopulation());
        System.out.println("Average population of all cities " + city.getAveragePopulation());


    }
}
