package JavaOOPAdvanced.InterfacesAndAbstractions.sayHello.sayHello;

public interface Person {
    String getName();

    default String sayHello(){
        return "Hello";
    }
}
