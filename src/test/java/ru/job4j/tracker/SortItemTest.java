package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class SortItemTest {
    @Test
    public void whenItemAscByName() {
        List<Item> items = new ArrayList<>(
                List.of(
                        new Item("item5"),
                        new Item("item2"),
                        new Item("item4"),
                        new Item("item1"),
                        new Item("item3")
                )
        );
        items.sort(new ItemAscByName());
        List<Item> expected = new ArrayList<>(
                List.of(
                        new Item("item1"),
                        new Item("item2"),
                        new Item("item3"),
                        new Item("item4"),
                        new Item("item5")
                )
        );
        assertThat(items).containsExactlyElementsOf(expected);
    }

    @Test
    public void whenItemDescByName() {
        List<Item> items = new ArrayList<>(
                List.of(
                        new Item("item19"),
                        new Item("item200"),
                        new Item("item8"),
                        new Item("item1"),
                        new Item("item0")
                )
        );
        items.sort(new ItemDescByName());
        List<Item> expected = new ArrayList<>(
                List.of(
                        new Item("item8"),
                        new Item("item200"),
                        new Item("item19"),
                        new Item("item1"),
                        new Item("item0")
                )
        );
        assertThat(items).containsExactlyElementsOf(expected);
    }
}
