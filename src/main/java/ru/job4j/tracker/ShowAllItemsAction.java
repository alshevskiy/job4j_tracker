package ru.job4j.tracker;

import java.util.List;

public class ShowAllItemsAction implements UserAction {
    private final Output out;

    public ShowAllItemsAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ===");
        List<Item> list = tracker.findAll();
        if (!list.isEmpty()) {
            for (Item item : list) {
                out.println(item);
            }
        } else {
            out.println("Хранилище пока не содержит заявок");
        }
        return true;
    }
}
