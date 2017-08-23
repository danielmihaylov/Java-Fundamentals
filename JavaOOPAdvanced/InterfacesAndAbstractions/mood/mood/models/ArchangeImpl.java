package JavaOOPAdvanced.InterfacesAndAbstractions.mood.mood.models;

import mood.interfaces.Archangel;

import java.lang.*;

public class ArchangeImpl extends java.lang.Character<Integer,Integer> implements Archangel{
    public ArchangeImpl(String userName, int level, Integer specialPoints) {
        super(userName, level, specialPoints);
        this.setPoints();
    }

    @Override
    public Integer getMana() {
        return this.specialPoints;
    }


    private void setPoints() {
        this.specialPoints = this.getLevel() * this.specialPoints;
    }

    @Override
    public String toString() {
        return super.toString() + this.getMana();
    }
}
