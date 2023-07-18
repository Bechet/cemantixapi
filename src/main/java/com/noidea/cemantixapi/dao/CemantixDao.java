package com.noidea.cemantixapi.dao;

import com.noidea.cemantixapi.beans.WordValue;

import java.util.List;

public interface CemantixDao {

    List<WordValue> getMostSimilar(String word, int size);

    float getSimilarity(String word1, String word2);
}
