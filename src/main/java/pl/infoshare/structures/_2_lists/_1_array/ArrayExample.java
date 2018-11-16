package pl.infoshare.structures._2_lists._1_array;

import pl.infoshare.structures._1_pojo.Person;

public class ArrayExample {

    // TODO: Utwórz tablicę zawierającą 3 różne osoby
    // TODO: Wypisz na ekran drugi element tablicy
    // TODO: Dodaj czwartą osobę do tablicy
    // TODO: Wypisz czwartą osobę na ekran
    // TODO: Dodaj 2 kolejne osoby do tablicy
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Maciek", 26);
        persons[1] = new Person("Mikołaj", 22);
        persons[2] = new Person("Anastazja", 23);

        System.out.println(persons[1]);

        ArrayWrapper arrayWrapper = new ArrayWrapper();
        arrayWrapper.add(new Person("Maciej", 26));
        arrayWrapper.add(new Person("Anastazja", 23));
        arrayWrapper.add(new Person("Mikołaj", 22));

        System.out.println(arrayWrapper);
        System.out.println(arrayWrapper.get(1));
        System.out.println(arrayWrapper.isEmpty());
        System.out.println(arrayWrapper.getLength());

        arrayWrapper.add(new Person("Jakub", 66));
        System.out.println(arrayWrapper.getLength());




    }
}