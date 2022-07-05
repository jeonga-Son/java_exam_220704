package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void 더하기_테스트() {
        int a = 10 + 5;
        assertEquals(15, a);
    }
}
