package com.Assignment.Day1;
public class Rethrow42 {
    public static void someMethod2() throws Exception {
        throw new Exception("Exception thrown in someMethod2()");
    }
    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("exception in someMethod(), rethrowing...");
            throw e; 
        }
    }
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("Exception in main(): " + e.getMessage());
            e.printStackTrace();  
        }
    }
}
