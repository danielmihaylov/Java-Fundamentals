package JavaOOPAdvanced.IteratorsAndComparators.listIterator.listIterator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CommandDispetcherImpl commandDispatcher = new CommandDispetcherImpl();
        Core core = new Core(commandDispatcher);

        core.run();
    }
}
