package JavaOOPAdvanced.IteratorsAndComparators.stackIterator.stackIterator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        SimpleCommandDispatcher simpleCommandDispatcher = new SimpleCommandDispatcher();
        Core core = new Core(simpleCommandDispatcher);

        core.run();
    }
}
