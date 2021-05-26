package com.p0n0marenk0;

public class CountAmountOfItarance implements StringWorker {
    @Override

    public int execute(String sentences, String word) {
        int count = 0;
        return countAmountOfItarance(sentences, word, count);

    }

    private int countAmountOfItarance(String sentences, String word, int count) {
        int lengthSentences = sentences.length();
        int lengthWord = word.length();
        if (lengthSentences < lengthWord) {
            return count;
        }
        int indexOfFirst = sentences.indexOf(word);
        if (indexOfFirst != -1) {
            sentences = sentences.substring((indexOfFirst + lengthWord), lengthSentences);
            count++;
            countAmountOfItarance(sentences, word, count);
        } else {
            return count;
        }
        return count;
    }
}