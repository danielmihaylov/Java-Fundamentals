package JavaOOPAdvanced.IteratorsAndComparators.strategyPattern.strategyPattern;

/**
 * Created by Daniel on 24.3.2017 г..
 */
public class PersonImpl implements Person {

    private String name;
    private int age;

    public PersonImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getAge();
    }
}
