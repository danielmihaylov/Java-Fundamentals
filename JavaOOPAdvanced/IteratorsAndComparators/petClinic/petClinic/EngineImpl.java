package JavaOOPAdvanced.IteratorsAndComparators.petClinic.petClinic;

import petClinic.interfaces.CommandDispatcher;
import petClinic.interfaces.Engine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Daniel on 29.3.2017 г..
 */
public class EngineImpl implements Engine {
    private CommandDispatcher commandDispatcher;
    private BufferedReader bufferedReader;

    public EngineImpl(CommandDispatcher commandDispatcher) {
        this.commandDispatcher = commandDispatcher;
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void run() throws IOException {
        Integer lineCount = Integer.valueOf(this.bufferedReader.readLine());

        for (int currentLine = 0; currentLine < lineCount; currentLine++) {

            String[] params = this.bufferedReader.readLine().split("\\s+");

            this.commandDispatcher.dispatch(params);
        }
    }
}
