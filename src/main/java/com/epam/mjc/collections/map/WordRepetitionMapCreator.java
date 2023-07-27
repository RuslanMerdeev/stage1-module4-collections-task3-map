package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] words = sentence.toLowerCase()
                .replaceAll("[^a-zA-Z ]+","")
                .split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            Integer amount = map.get(word);
            amount = amount == null ? 0 : amount;
            map.put(word, amount + 1);
        }

        return map;
    }
}
