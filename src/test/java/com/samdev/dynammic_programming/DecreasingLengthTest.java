package com.samdev.dynammic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecreasingLengthTest {

    @Test
    void maxNonDecreasingLength() {
        int[] nums1 = {5,2,2};

        assertEquals(2, DecreasingLength.maxNonDecreasingLength(nums1));
    }
}