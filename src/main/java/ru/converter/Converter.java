package ru.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 100;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 1.4F;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 1.4 euro Test result : " + passed);

        in = 150;
        expected = 1.5F;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("150 rubles are 1.5 dollar Test result : " + passed);

    }
}


