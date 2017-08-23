package JavaOOPAdvanced.InterfacesAndAbstractions.mood.mood.models;

import mood.interfaces.Demon;

import java.lang.*;
import java.util.Deque;

/**
 * Created by Daniel on 21.3.2017 г..
 */
public class DemonImpl extends java.lang.Character<Double,Double> implements Demon{
    public DemonImpl(String userName, int level, Double specialPoints) {
        super(userName, level, specialPoints);
        this.setPoints();
    }

    @Override
    public Double getEnergy() {
        return this.specialPoints;
    }


    private void setPoints() {
        this.specialPoints = this.getLevel() * this.specialPoints;
    }

    @Override
    public String toString() {
        return super.toString() + this.getEnergy();
    }
}
