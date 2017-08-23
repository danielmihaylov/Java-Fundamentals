package JavaOOPAdvanced.InterfacesAndAbstractions.multipleImplementation.defineAnInterface;

public class Citizen implements Person,Identifiable,Birthable {

    private String name;
    private int age;
    private String birthDate;
    private String id;

    public Citizen(String name, int age, String birthDate, String id) {
        this.setName(name);
        this.setAge(age);
        this.setBirthDate(birthDate);
        this.setId(id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setId(String id) {
        this.id = id;
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
    public String getBirthdate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
