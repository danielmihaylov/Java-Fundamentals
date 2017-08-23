package JavaOOPAdvanced.InterfacesAndAbstractions.defineAnInterface.defineAnInterface;

public class Citizen implements Person{

    private String name;
    private int age;

    public Citizen(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
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
}
