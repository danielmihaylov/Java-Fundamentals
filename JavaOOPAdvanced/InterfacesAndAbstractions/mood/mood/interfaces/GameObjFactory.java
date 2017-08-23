package JavaOOPAdvanced.InterfacesAndAbstractions.mood.mood.interfaces;

/**
 * Created by Daniel on 21.3.2017 г..
 */
public interface GameObjFactory {
    <E> GameObject<E> getCharacter(String... params);
}
