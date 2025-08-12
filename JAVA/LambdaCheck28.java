package com.Assignment.Day1;
public class LambdaCheck28 {

    @FunctionalInterface
    interface PerformOperation {
        boolean check(int a);
    }
    public static PerformOperation isOdd() {
        return (int a)->a%2!=0;
    }
    public static PerformOperation isPrime() {
        return(int a)->{
            if(a<=1) return false;
            for(int i=2;i<=Math.sqrt(a);i++) {
                if(a%i==0) return false;
            }
            return true;
        };
    }
    public static PerformOperation isPalindrome() {
        return(int a)->{
            String str = String.valueOf(a);
            return str.equals(new StringBuilder(str).reverse().toString());
        };
    }
    public static void main(String[] args) {
        PerformOperation op;
        op=isOdd();
        System.out.println("Is 5 odd."+op.check(5)); 
        System.out.println("Is 4 odd."+op.check(4)); 
        op=isPrime();
        System.out.println("Is 7 prime."+op.check(7)); 
        System.out.println("Is 8 prime."+op.check(8)); 
        op=isPalindrome();
        System.out.println("Is 121 palindrome. "+op.check(121)); 
        System.out.println("Is 123 palindrome. "+op.check(123)); 
    }
}
