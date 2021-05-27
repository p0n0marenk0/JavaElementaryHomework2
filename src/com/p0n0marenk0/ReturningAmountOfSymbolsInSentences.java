package com.p0n0marenk0;

public class ReturningAmountOfSymbolsInSentences extends CountAmountOfItarance {
    @Override
    public int execute(String sentence, String word) {
        int count = super.execute(sentence, word);
        return sentence.length() - (count * word.length());
    }
}
