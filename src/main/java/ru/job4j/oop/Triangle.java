package ru.job4j.oop;

public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean exist(double ab, double bc, double ac) {
        return (ab + bc > ac) && (ab + ac > bc) && (bc + ac > ab);
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double bc = second.distance(third);
        double ac = third.distance(first);
        if (this.exist(ab, bc, ac)) {
            double p = semiPerimeter(ab, bc, ac);
            rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return rsl;
    }
}
