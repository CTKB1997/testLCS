package testjenkinjava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Thanh
 */
public class TestLCS extends TestCase{

    public TestLCS(String name) {
        super(name);
    }
    
    public void testOne() {
        //TestJenkinJava LCS = TestJenkinJava("aaa", "aba");
        assertEquals(2, getLCS("aaa", "aba"));
    }
    
    public void testTwo() {
        //TestJenkinJava LCS = TestJenkinJava("abcd", "abcedaba");
        assertEquals(4, getLCS("abcd", "abcedaba"));
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    public int getLCS(String stringOne, String stringTwo) {
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
}
