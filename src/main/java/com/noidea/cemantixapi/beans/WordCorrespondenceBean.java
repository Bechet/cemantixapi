package com.noidea.cemantixapi.beans;

public class WordCorrespondenceBean {

    String wordToSearch;

    String wordChecking;

    double correspondence;

    public WordCorrespondenceBean(String wordToSearch, String wordChecking, double correspondence) {
        this.wordToSearch = wordToSearch;
        this.wordChecking = wordChecking;
        this.correspondence = correspondence;
    }

    public String getWordToSearch() {
        return wordToSearch;
    }

    public void setWordToSearch(String wordToSearch) {
        this.wordToSearch = wordToSearch;
    }

    public String getWordChecking() {
        return wordChecking;
    }

    public void setWordChecking(String wordChecking) {
        this.wordChecking = wordChecking;
    }

    public double getCorrespondence() {
        return correspondence;
    }

    public void setCorrespondence(double correspondence) {
        this.correspondence = correspondence;
    }
}

