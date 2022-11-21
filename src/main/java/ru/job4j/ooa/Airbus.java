package ru.job4j.ooa;

public final class Airbus extends Aircraft {
    private static final int COUNT_ENGINE = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("������ ��������: " + name);
    }

    public void printCountEngine(Airbus airbus) {
        int modelCountEngine = ("A380".equals(airbus.getName())) ? 4 : COUNT_ENGINE;
        System.out.println("���������� ���������� �����: " + modelCountEngine);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}