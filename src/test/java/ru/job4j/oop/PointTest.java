package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when503to203then3() {
        double expected = 3;
        Point c = new Point(5, 0,3);
        Point d = new Point(2, 0,3);
        double output = c.distance3d(d);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to11then0() {
        double expected = 0;
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when523to521then1() {
        double expected = 2;
        Point c = new Point(5, 2, 3);
        Point d = new Point(5, 2, 1);
        double output = c.distance3d(d);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when88to11then9dot89() {
        double expected = 9.89;
        Point a = new Point(8, 8);
        Point b = new Point(1, 1);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}