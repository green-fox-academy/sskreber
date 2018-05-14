package main.java.music;

import main.java.music.Instrument;

public abstract class StringedInstrument extends Instrument {
    protected String ownSound;
    protected int numberOfStrings;
    protected abstract String sound();

    @Override
    public void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
    }
}

