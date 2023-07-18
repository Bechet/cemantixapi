package com.noidea.cemantixapi.controllers;

import com.noidea.cemantixapi.beans.WordValue;
import com.noidea.cemantixapi.businesses.CemantixBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class CemantixController {

    @Autowired
    CemantixBusiness cemantixBusiness;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getAnOk() {
        return "ok";
    }

    @GetMapping("/most_similar")
    public List<WordValue> getMostSimilar(
        @RequestParam(name="word") String word,
        @RequestParam(name="nbItem", required = false, defaultValue = "10") int nbItem) {
        return cemantixBusiness.getMostSimilar(word, nbItem);
    }

    @GetMapping("/similarity")
    public float getSimilarity(
            @RequestParam(name="word1") String word1,
            @RequestParam(name="word2") String word2) {
        return cemantixBusiness.getSimilarity(word1, word2);
    }
}
