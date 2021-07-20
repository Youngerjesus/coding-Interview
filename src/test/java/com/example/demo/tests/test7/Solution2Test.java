package com.example.demo.tests.test7;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    Solution2 solution = new Solution2();

    @Test
    void regexTest(){
        //given
        String musicRegex = "(.*((.mp3)|(.flac)|(.aac)))";
        String music1 = "my.song.mp3";
        String music2 = "greatSong.flac";
        String music3 = "test.aac";
        //when
        if (!Pattern.matches(musicRegex, music1)) {
            throw new RuntimeException();
        }

        if (!Pattern.matches(musicRegex, music2)) {
            throw new RuntimeException();
        }

        if (!Pattern.matches(musicRegex, music3)) {
            throw new RuntimeException();
        }
    }

    @Test
    void splitStringTest(){
        //given
        String S = "my.song.mp3 11b\n" +
                "greatSong.flac 1000b\n" +
                "not3.txt 5b\n" +
                "video.mp4 200b\n" +
                "game.exe 100b\n" +
                "mov!e.mkv 10000b";
        //when
        String[] split = S.split("\n");
        //then
        System.out.println(split);
    }

    @Test
    void testCase1(){
        //given
        String S = "my.song.mp3 11b\n" +
                "greatSong.flac 1000b\n" +
                "not3.txt 5b\n" +
                "video.mp4 200b\n" +
                "game.exe 100b\n" +
                "mov!e.mkv 10000b";
        String expected = "music 1011b\n" +
                "images 0b\n" +
                "movies 10200b\n" +
                "other 105b";
        //when
        String actual = this.solution.solution(S);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase2(){
        //given
        String S = "my.song.txt.mp3 11b\n" +
                "greatSong.txt.flac 1000b\n" +
                "not3.txt.txt 5b\n" +
                "video.txt.mp4 200b\n" +
                "game.txt.exe 100b\n" +
                "mov!e.txt.mkv 10000b";

        String expected = "music 1011b\n" +
                "images 0b\n" +
                "movies 10200b\n" +
                "other 105b";
        //when
        String actual = this.solution.solution(S);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void testCase3(){
        //given
        String S = "my.so..txt.flac.mp3ng.txt.mp3 11b\n" +
                "greatS..flacong.txt.flac 1000b\n" +
                "not3.txt.txt 5b\n" +
                "video.txt.mp4 200b\n" +
                "game.txt.exe 100b\n" +
                "mov!e.txt.mkv 10000b";

        String expected = "music 1011b\n" +
                "images 0b\n" +
                "movies 10200b\n" +
                "other 105b";
        //when
        String actual = this.solution.solution(S);
        //then
        assertEquals(expected, actual);
    }
}