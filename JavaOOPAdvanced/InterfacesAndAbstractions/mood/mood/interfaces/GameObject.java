package JavaOOPAdvanced.InterfacesAndAbstractions.mood.mood.interfaces;

/**
 * Created by Daniel on 21.3.2017 г..
 */
public interface GameObject<E>{
    String getUsername();

    int getLevel();

    E getHashedPassword();

    void setHashedPassword(E element);
}
