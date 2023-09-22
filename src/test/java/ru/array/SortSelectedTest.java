package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort4() {
        int[] data = new int[]{5, 2, 3, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 3, 5, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[]{3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[]{8, 7, 5, 4, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{3, 4, 5, 7, 8};
        assertThat(result).containsExactly(expected);
    }
}
