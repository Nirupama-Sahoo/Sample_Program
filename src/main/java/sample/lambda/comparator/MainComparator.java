package sample.lambda.comparator;

import java.util.Comparator;

public class MainComparator {
    public static void main(String args[]){
        Comparator<Person> comAge = (p1,p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> comFirstName = (p1,p2) -> p2.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> comLastName = (p1,p2) -> p2.getLastName().compareTo(p2.getLastName());


        Comparator<Person> compPersonAge = Comparator.comparing(Person::getAge);
    }
}
