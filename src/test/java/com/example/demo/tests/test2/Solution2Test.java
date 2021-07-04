package com.example.demo.tests.test2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    Solution2 solution = new Solution2();
    @Test
    void testCase1(){
        //given
        String s = "\"\"\"\n" +
                "  root r-x delete-this.xls\n" +
                "  root r-- bug-report.pdf\n" +
                "  root r-- doc.xls\n" +
                "  root r-- podcast.flac\n" +
                " alice r-- system.xls\n" +
                "  root --x invoices.pdf\n" +
                " admin rwx SETUP.PY\n" +
                "\"\"\"";
        String answer = "7";
        //when
        String output = this.solution.solution(s);
        //then
        assertEquals(answer, output);
    }
}