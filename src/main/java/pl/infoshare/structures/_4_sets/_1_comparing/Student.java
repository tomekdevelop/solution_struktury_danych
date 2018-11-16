package pl.infoshare.structures._4_sets._1_comparing;

import java.util.Comparator;

public class Student implements Comparable<Student> {

    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", average=" + average +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        if(average < o.average){
            return -1;
        }

        if (average < o.average){
            return 1;
        }

        return 0;
    }


}
