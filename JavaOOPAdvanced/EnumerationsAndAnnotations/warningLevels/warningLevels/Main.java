package JavaOOPAdvanced.EnumerationsAndAnnotations.warningLevels.warningLevels;

import sun.rmi.runtime.Log;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loggerLevel = scanner.nextLine();
        Logger logger = new Logger(Importance.valueOf(loggerLevel));
        String command = scanner.nextLine();
        while (!"END".equals(command)){
            int colonIndex = command.indexOf(":");
            String messageLevel = command.substring(0,colonIndex);
            String content = command.substring(colonIndex + 2);
            logger.record(new Message(Importance.valueOf(messageLevel),content));

            command = scanner.nextLine();
        }
        for (Message arg : logger.getMessages()) {
            System.out.println(arg);
        }
    }
}
