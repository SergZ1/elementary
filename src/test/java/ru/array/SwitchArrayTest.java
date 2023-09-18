package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to3() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 2;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 4, 3, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
<<<<<<< HEAD
    void whenSwap4to8() {
=======
    void whenSwap3to8() {
>>>>>>> origin/master
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = 4;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 9, 6, 7, 8, 5, 10};
        assertThat(result).containsExactly(expected);
    }
}
