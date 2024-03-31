package com.org.ds.v3.lohia.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseOnlyLettersTest {
    private C33_ReverseOnlyLetters reverseOnlyLetters;

    public ReverseOnlyLettersTest() {
        reverseOnlyLetters = new C33_ReverseOnlyLetters();
    }

    @Test
    void testReverseOnlyLetters1() {
        String ip = "Test1ng-Leet=code-Q!";
        String op = "Qedo1ct-eeLg=ntse-T!";

        assertEquals(op, reverseOnlyLetters.reverseOnlyLetters(ip));
    }
}
