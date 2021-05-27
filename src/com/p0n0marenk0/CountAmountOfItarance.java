package com.p0n0marenk0;

public class CountAmountOfItarance implements StringWorker {
    @Override
    public int execute(String sentences, String word) {
        int count = 0;
        String variableNotForever = sentences;
        while (variableNotForever.contains(word)) {
            if (variableNotForever.contains(word)) {
                variableNotForever = variableNotForever.substring(variableNotForever.indexOf(word) + word.length(), variableNotForever.length());
                count++;
            }
        }
        return count;
    }
}
