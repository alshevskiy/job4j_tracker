package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;
    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getDescendingElements() {
        StringBuilder result = new StringBuilder();
        while (!descendingElements.isEmpty()) {
            result.append(descendingElements.pollLast());
        }
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
