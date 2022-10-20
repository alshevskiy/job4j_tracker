package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 8;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when00and00and00ThenMinus1() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 3);
        Point c = new Point(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = -1;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when12and34and45ThenMinus1() {
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        Point c = new Point(5, 6);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = -1;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when11and22and33Then4() {
        Point a = new Point(1, 2);
        Point b = new Point(-1, -2);
        Point c = new Point(5, 6);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 4;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }
}