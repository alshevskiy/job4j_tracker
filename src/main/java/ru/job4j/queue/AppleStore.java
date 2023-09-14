package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;
    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        String happyCustomer = null;
        for (int i = 1; i <= count; i++) {
            happyCustomer = queue.poll().name();
        }
        return happyCustomer;
    }

    public String getFirstUpsetCustomer() {
        String upsetCustomer = null;
        for (int i = 1; i <= (count + 1); i++) {
            upsetCustomer = queue.poll().name();
        }
        return upsetCustomer;
    }
}
