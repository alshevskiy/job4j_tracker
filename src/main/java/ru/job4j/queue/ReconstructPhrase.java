package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;
    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getDescendingElements() {
        StringBuilder result = new StringBuilder();

        for (Character ch : descendingElements) {
            result.append(ch);
        }

        result.reverse();
        return result.toString();
    }

    private String getEvenElements() {
        StringBuilder result = new StringBuilder();
        int counter = 0;

        for (Character ch : evenElements) {
            if ((counter % 2) == 0) {
                result.append(ch);
            }
            counter++;
        }

        return result.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
