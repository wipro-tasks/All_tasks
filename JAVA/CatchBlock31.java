package com.Assignment.Day1;
public class CatchBlock31 {

    public static void main(String[] args) {
        try {
            int[] arr = new int[-5]; 
} 		catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException:");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException:");
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException:");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException:");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException:");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException:");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("general Exception:");
            e.printStackTrace();
        }
    }
}
