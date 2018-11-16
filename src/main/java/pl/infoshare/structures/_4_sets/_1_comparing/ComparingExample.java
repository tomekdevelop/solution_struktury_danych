package pl.infoshare.structures._4_sets._1_comparing;

import pl.infoshare.structures._1_pojo.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparingExample {


    public static void main(String[] args) {
//        List<Person> sortedList = new ArrayList<>();
//        sortedList.add(new Person("Maciek", 26));
//        sortedList.add(new Person("Anastazja", 22));
//        sortedList.add(new Person("Mikolaj", 23));

        List<Student> students = new ArrayList<>();

        students.add(new Student("Mikolaj", 5.0));
        students.add(new Student("Maciej", 4.5));
        students.add(new Student("Michal", 4.0));
        students.add(new Student("Tomek", 4.9));


        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

        StudentComparator c = new StudentComparator();
        Collections.sort(students, c);
        System.out.println(students);

    }




}
