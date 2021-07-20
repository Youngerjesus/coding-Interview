package com.example.demo.tests.test7;


import java.util.regex.Pattern;

public class Solution2 {
    public String solution(String S) {
        // write your code in Java SE 8
        long musicSize = 0L;
        long imageSize = 0L;
        long movieSize = 0L;
        long otherSize = 0L;

        String[] fileList = S.split("\n");

        for (String file : fileList) {
            String[] splitFile = file.split(" ");
            String fileName = splitFile[0];
            long fileSize = Long.parseLong(splitFile[1].substring(0, splitFile[1].length() - 1));

            if (isMusicFile(fileName)) {
                musicSize += fileSize;
            }
            else if (isImageFile(fileName)) {
                imageSize += fileSize;
            }
            else if (isMovieFile(fileName)) {
                movieSize += fileSize;
            }
            else {
                otherSize += fileSize;
            }
        }

        return String.format("music %db%nimages %db%nmovies %db%nother %db", musicSize, imageSize, movieSize, otherSize);
    }

    private boolean isMovieFile(String fileName) {
        String movieRegex = "(.*((.mp4)|(.avi)|(.mkv)))";
        return Pattern.matches(movieRegex, fileName);
    }

    private boolean isMusicFile(String fileName) {
        String musicRegex = "(.*((.mp3)|(.flac)|(.aac)))";
        return Pattern.matches(musicRegex, fileName);
    }

    private boolean isImageFile(String fileName) {
        String imageRegex = "(.*((.jpg)|(.bmp)|(.gif)))";
        return Pattern.matches(imageRegex, fileName);
    }
}
