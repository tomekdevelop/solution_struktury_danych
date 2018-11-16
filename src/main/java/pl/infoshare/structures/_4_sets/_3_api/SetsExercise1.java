package pl.infoshare.structures._4_sets._3_api;


import java.util.*;

public class SetsExercise1 {

    // TODO: Ćwiczenie 5 - Sets API
    // TODO: 1. Utwórz nowy HashSet przechowujący klasę City (nazwa miasta i populacja).
    // TODO:     Dodaj do niego 4 miasta. Dodaj jedno miasto dwa razy.
    // TODO: 2. Sprawdź rozmiar seta
    // TODO: 3. Utwórz TreeSet i posortuj miasta w kolejności od największego do najmniejszego.
    public static void main(String[] args) {

        HashSet<City> city = new HashSet<>();

        city.add(new City("Gdansk", 500000));
        city.add(new City("Gdansk", 500000));
        city.add(new City("Gdynia", 250000));
        city.add(new City("Sopot", 100000));

        System.out.println(city);

        TreeSet<City> citySet = new TreeSet<>(city);
        System.out.println(citySet);



    }
}
