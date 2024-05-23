package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMaxNumber2() {
        int first = 1;
        int second = 2;
        int result = new Max().max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxNumber5() {
        int first = 3;
        int second = 2;
        int third = 5;
        int result = new Max().max(first, second, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxNumber3() {
        int first = 3;
        int second = 3;
        int third = 2;
        int four = 1;
        int result = new Max().max(first, second, third, four);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}