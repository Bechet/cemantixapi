package com.noidea.cemantixapi.businesses;

import com.noidea.cemantixapi.beans.WordValue;

import java.util.List;

public interface CemantixBusiness {

    List<WordValue> getMostSimilar(String word, int size);

    float getSimilarity(String word1, String word2);
}
