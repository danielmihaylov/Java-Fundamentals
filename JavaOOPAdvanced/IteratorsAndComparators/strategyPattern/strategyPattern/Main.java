package JavaOOPAdvanced.IteratorsAndComparators.strategyPattern.strategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Set<Person> nameComparePerson = new TreeSet<>(new NameComparator());
        Set<Person> ageComparePerson = new TreeSet<>(new AgeComparator());

        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split(" ");
            Person p = new PersonImpl(tokens[0],Integer.parseInt(tokens[1]));
            nameComparePerson.add(p);
            ageComparePerson.add(p);
            }
            nameComparePerson.forEach(System.out::println);
            ageComparePerson.forEach(System.out::println);
        }
    }
