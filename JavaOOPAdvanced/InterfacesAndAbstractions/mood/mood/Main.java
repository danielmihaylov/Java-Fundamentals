package JavaOOPAdvanced.InterfacesAndAbstractions.mood.mood;

import mood.interfaces.GameObjFactory;
import mood.interfaces.GameObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        String[] params = buffReader.readLine().split("\\s+\\|\\s+");
        //
        GameObjFactory gameObjFactory = new GameObjFactoryImpl();
        GameObject gameObj = gameObjFactory.getCharacter(params);
        System.out.println(gameObj.toString());
        //

    }
}