package JavaOOPAdvanced.IteratorsAndComparators.petClinic.petClinic;

import petClinic.interfaces.CommandDispatcher;
import petClinic.interfaces.Engine;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CommandDispatcher commandDispatcher = new ClinicCommandDispatcherImpl();
        Engine engine = new EngineImpl(commandDispatcher);
        engine.run();
    }
}
