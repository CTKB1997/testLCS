/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjenkinjava;

import java.util.Scanner;

/**
 *
 * @author Thanh
 */
public class TestJenkinJava {

    /**
     * @param args the command line arguments
     */
    private String stringOne;
    private String stringTwo;

    public TestJenkinJava(String stringOne, String stringTwo) {
        if (stringOne == null || stringTwo == null) {
            throw new IllegalArgumentException("Both names cannot be null");
        }
        this.stringOne = stringOne;
        this.stringTwo = stringTwo;
    }

    //Longest common substring problem
    public int getLCS() {
        int m = stringOne.length();
        int n = stringTwo.length();
        int[][] a = new int[m + 1][n + 1];
        stringOne = "0" + stringOne;
        stringTwo = "0" + stringTwo;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (stringOne.charAt(i) == stringTwo.charAt(j)) {
                    a[i][j] = a[i - 1][j - 1] + 1;
                } else {
                    a[i][j] = Integer.max(a[i - 1][j], a[i][j - 1]);
                }
            }
        }
        return a[m][n];
    }

    public String getStringOne() {
        return stringOne;
    }

    public String getStringTwo() {
        return stringTwo;
    }
    /*
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        s1 = sc.next();
        s2 = sc.next();

        int m = s1.length();
        int n = s2.length();
        int[][] a = new int[m + 1][n + 1];
        s1 = "0" + s1;
        s2 = "0" + s2;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    a[i][j] = a[i - 1][j - 1] + 1;
                } else {
                    a[i][j] = Integer.max(a[i - 1][j], a[i][j - 1]);
                }
            }
        }
        System.out.println(a[m][n]);
    }
     */
}
