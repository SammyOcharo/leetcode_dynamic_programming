package com.samdev.dynammic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecreasingLengthTest {

    @Test
    void maxNonDecreasingLength() {
        int[] nums1 = {5,2,2};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {4, 3, 2, 6};

        assertEquals(2, DecreasingLength.maxNonDecreasingLength(nums1));
        assertEquals(4, DecreasingLength.maxNonDecreasingLength(nums2));
        assertEquals(2, DecreasingLength.maxNonDecreasingLength(nums3));
    }
}