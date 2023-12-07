package ru.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double result = a.distance(b);
        double expected = 2.0;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when02To02Then0() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        double expected = 0.0;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00To22Then2Dot8() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);
        double result = a.distance(b);
        double expected = 2.8284271247461903;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when22To22Then0() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        double result = a.distance(b);
        double expected = 0;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when02To00Then2() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        double result = a.distance(b);
        double expected = 2;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00To22To22Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);
        Point c = new Point(2, 2, 2);
        double result = c.distance3d(b);
        double expected = 2;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }


}