package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when50to20then3() {
        double expected = 3;
        Point first = new Point(5, 0);
        Point second = new Point(2, 0);
        double output = first.distance(second);
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
    void when31to21then1() {
        double expected = 1;
        Point a = new Point(3, 1);
        Point b = new Point(2, 1);
        double output = a.distance(b);
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