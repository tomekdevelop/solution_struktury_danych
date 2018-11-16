package pl.infoshare.structures._4_sets._1_comparing;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        int i = o1.getName().compareTo(o2.getName());
        if (i == 0){
            return o1.compareTo(o2);
        }

        return i;
    }
}
