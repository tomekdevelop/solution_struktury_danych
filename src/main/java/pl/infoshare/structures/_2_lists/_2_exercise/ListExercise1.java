package pl.infoshare.structures._2_lists._2_exercise;

import pl.infoshare.structures._1_pojo.Person;

import java.util.ArrayList;
import java.util.List;

public class ListExercise1 {

    // TODO: Ćwiczenie 1 - API list
    // TODO: 1. Utwórz nową ArrayList przechowującą typy Person
    // TODO: 2. Utwórz cztery instancje klasy Person, dodaj je do listy
    // TODO: 3. Wypisz na ekran drugi element
    // TODO: 4. Usuń trzeci element z listy
    // TODO: 5. Sprawdź rozmiar
    // TODO: 6. Wypisz wszystkie pełnoletnie osoby
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();


         /*
         Person p1 = new Person("Lukasz", 8);
         Person p2 = new Person("Mateusz", 20);
         Person p3 = new Person("Robert", 33);
         Person p4 = new Person("Krzysztof", 40);

         persons.add(p1);
         persons.add(p2);
         persons.add(p3);
         persons.add(p4);

         */

        persons.add(new Person("Lukasz", 8));
        persons.add(new Person("Mateusz", 20));
        persons.add(new Person("Robert", 33));
        persons.add(new Person("Krzysztof", 40));


        System.out.println(persons.get(1));
        System.out.println(persons.size());
        persons.remove(2);
        System.out.println(persons.size());

        for (int i = 0; i <persons.size() ; i++) {

            if(persons.get(i).getAge() > 18 ){
                System.out.println(persons.get(i));
            }
        }











    }
}
