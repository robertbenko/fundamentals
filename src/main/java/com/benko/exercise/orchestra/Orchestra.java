package com.benko.exercise.orchestra;

import java.util.ArrayList;
import java.util.List;


public class Orchestra implements com.benko.exercise.orchestra.Instrument {

    private List<Instrument> instruments = new ArrayList<>();

    private Instrument guitar = new Guitar();
    private Instrument trombone = new Trombone();
    private Instrument flute = new Flute();

    private void addInstrument(){

        instruments.add(guitar);
        instruments.add(trombone);
        instruments.add(flute);
    }

    public void play() {

        addInstrument();

        for (Instrument instrument: instruments){
            instrument.play();
        }
    }

    public static void main(String[] args){

        Instrument orchestra = new Orchestra();
        orchestra.play();

    }
}
