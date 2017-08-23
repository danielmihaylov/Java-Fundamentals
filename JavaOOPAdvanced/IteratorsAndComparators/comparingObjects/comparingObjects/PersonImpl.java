package JavaOOPAdvanced.IteratorsAndComparators.comparingObjects.comparingObjects;

public class PersonImpl implements Person {

    private String name;
    private Integer age;
    private String town;

    public PersonImpl(String name, Integer age, String town) {
        this.setName(name);
        this.setAge(age);
        this.setTown(town);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String getTown() {
        return this.town;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(Person o) {
        int compareName = this.getName().compareTo(o.getName());
        int compareAge = this.getAge().compareTo(o.getAge());
        int compareTown = this.getTown().compareTo(o.getTown());
        if (compareName == 0 && compareAge == 0 && compareTown == 0){
            return 0;
        }
        return 1;
    }
}
