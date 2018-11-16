package pl.infoshare.structures._4_sets._3_api;

public class City implements Comparable<City> {

    private String city;
    private int population;

    public City(String city, int population) {
        this.city = city;
        this.population = population;
    }

    public String getCity() {
        return city;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int compareTo(City o) {
        if(population > o.population){
            return -1;
        }

        if (population < o.population){
            return 1;
        }

        return 0;
    }
}
