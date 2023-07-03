package com.noidea.cemantixapi.beans;

public class WordValue {

    private String word;

    private double value;

    public WordValue(String word, double value) {
        this.word = word;
        this.value = value;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
