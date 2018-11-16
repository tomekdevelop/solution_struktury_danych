package pl.infoshare.structures._1_pojo;

public class Person implements Comparable<Person> {

    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(age < o.getAge()){
            return -1;
        }

        if (age > o.getAge()){
            return 1;
        }

        return 0;
    }
}