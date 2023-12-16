package CompareCities;

import java.util.ArrayList;
import java.util.List;

public class City {
    private List<City> cities = new ArrayList<>();
    private String name;
    private int population;
    public City(String name, int population) {
        this.name = name;
        this.population = population;

    }

    public City() {
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public City getBiggestCity() {
        // Placeholder city at start of cities ArrayList.
        City biggestCity = cities.get(0);

        // Loops through cities. If the population of c is larger than current biggestCity, then c takes biggestCity's place.
        for (City c : cities) {
            if (c.population > biggestCity.population)
              biggestCity = c;
        }

        return biggestCity;
    }

    public void addCities(List<City> city) {
        cities.addAll(city);
    }

    public int getTotalPopulation() {
        int totalPopulation = 0;
        for (City c : cities) {
            totalPopulation += c.population;
        }

        return totalPopulation;
    }

    public int getAveragePopulation() {
        // Total population of all cities / amount of cities = avg. population of cities.
        return getTotalPopulation() / cities.size();
    }

    public String getName() {
        return name;
    }

}
