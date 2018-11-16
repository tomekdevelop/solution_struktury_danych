package pl.infoshare.structures._3_maps._3_exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsExercise1 {

    // TODO: Ćwiczenie 3 - Map API
    // TODO: 1. Utwórz nową HashMapę nazwę miasta od Integer (liczba mieszkańców)
    // TODO: 2. Dodaj do mapy trzy trójmiejskie miasta wraz z liczba ich mieszkancow
    // TODO: 3. Zaktualizuj liczbę mieszkańców Gdyni do 150
    // TODO: 4. Zaktualizuj liczbę mieszkańców Wejherowa do 36000 tylko jeżeli miasto nie było wcześniej dodane do mapy
    // TODO: 5. Zaktualizuj liczbę mieszkańców Gdańska do 100000 tylko jeżeli miasto nie było wcześniej dodane do mapy
    // TODO: 6. Wypisz na ekran tylko miasta
    // TODO: 7. Wypisz na ekran tylko ilość mieszkańców
    // TODO: 8. Wypisz na ekran dane dla Gdańska, Wejherowa i Warszawy. Jeżeli miasta nie ma wypisz zero.
    public static void main(String[] args) {


        Map<String, Integer> cityToPopulation = new HashMap<>();

        cityToPopulation.put("Gdynia", 250000);
        cityToPopulation.put("Sopot", 100000);
        cityToPopulation.put("Gdansk", 250000);

        cityToPopulation.put("Gdynia", 150);
        System.out.println("get "+cityToPopulation.get("Gdynia"));

        cityToPopulation.putIfAbsent("Wejherowo", 36000);  // jezeli nie byla wczesniej dodany
        System.out.println("get "+cityToPopulation.get("Wejherowo"));

        cityToPopulation.putIfAbsent("Gdansk", 100000); // nie powinno zmienic wartosci bo gdansk juz byl dodany
        System.out.println("get "+cityToPopulation.get("Gdansk"));

        System.out.println("keySet"+cityToPopulation.keySet());
        System.out.println("values "+cityToPopulation.values());

        System.out.println("getOrDefault "+cityToPopulation.getOrDefault("Gdansk", 0));
        System.out.println("getOrDefault "+cityToPopulation.getOrDefault("Wejherowo", 0));
        System.out.println("getOrDefault "+cityToPopulation.getOrDefault("Warszawa", 0));





    }
}
