package com.example.demo.tests.test2;

public class Solution2 {
    public String solution(String S) {
        String[] split = S.split("\"\"\"");
        int N = Integer.MAX_VALUE;

        for (String str : split) {
            String[] sentence = str.split("\n");
            for (String sen : sentence){
                String[] words = sen.trim().split(" ");
                if(words.length == 3) {
                    if(isRootUser(words[0]) &&
                        isReadOnly(words[1]) &&
                        isBinaryDocument(words[2])
                    ){
                        N = Math.min(N, words[2].length());
                    }
                }
            }
        }

        return N == Integer.MAX_VALUE ?
                "NO FILES" :
                String.valueOf(N);
    }

    private boolean isRootUser(String word) {
        return word.endsWith("root");
    }

    private boolean isReadOnly(String word) {
        return !word.contains("w");
    }

    private boolean isBinaryDocument(String word) {
        return word.endsWith("doc") || word.endsWith("xls") || word.endsWith("pdf");
    }

    public static void main(String[] args) {
        String s = "\"\"\"\n" +
                "  root r-x delete-this.xls\n" +
                "  root r-- bug-report.pdf\n" +
                "  root r-- doc.xls\n" +
                "  root r-- podcast.flac\n" +
                " alice r-- system.xls\n" +
                "  root --x invoices.pdf\n" +
                " admin rwx SETUP.PY\n" +
                "\"\"\"";

        String[] split = s.split("\"\"\"");
        for (String str : split) {
            String[] sentence = str.split("\n");
            for (String sen : sentence){
                String[] words = sen.trim().split(" ");
                for (String w : words){
                    System.out.println(w);
                }
            }
        }

    }
}
