package oops.cityWall;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private List<City> cities = new ArrayList<>();

    public void addCity(City city) {
        cities.add(city);
    }

    public List<City> getCities() {
        return cities;
    }
}

