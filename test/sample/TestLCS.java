/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import testjenkinjava.TestJenkinJava;

/**
 *
 * @author Thanh
 */
public class TestLCS extends TestCase{

    public TestLCS(String name) {
        super(name);
    }
    
    public void testOne() {
        TestJenkinJava LCS = new TestJenkinJava("aaa", "aba");
        assertEquals(2, LCS.getLCS());
    }
    
    public void testTwo() {
        TestJenkinJava LCS = new TestJenkinJava("abcd", "abcedaba");
        assertEquals(4, LCS.getLCS());
    }
    
     public static void main(String[] args) {  
        junit.textui.TestRunner.run(new TestSuite(TestLCS.class));
    }  

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
