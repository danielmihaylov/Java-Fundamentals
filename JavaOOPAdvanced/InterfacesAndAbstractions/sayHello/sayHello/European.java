package JavaOOPAdvanced.InterfacesAndAbstractions.sayHello.sayHello;

public class European implements Person{
    private String name;

    public European(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
