package JavaOOPAdvanced.IteratorsAndComparators.comparingObjects.comparingObjects;

import java.util.Comparator;

/**
 * Created by Daniel on 24.3.2017 г..
 */
public interface Person extends Comparable<Person> {

    String getName();

    Integer getAge();

    String getTown();
}
