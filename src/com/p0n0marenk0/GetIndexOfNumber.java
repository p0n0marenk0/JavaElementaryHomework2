package com.p0n0marenk0;

public class GetIndexOfNumber implements StringWorker {
    @Override
    public int execute(String sentence, String word) {
        return sentence.indexOf(word);
    }
}
