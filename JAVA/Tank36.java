package com.Assignment.Day1;
public class Tank36 {
    private boolean isFilled;
    private boolean isReleased;
    public Tank36() {
        isFilled = false;
        isReleased = false;
        System.out.println("Tank created.");
    }
    public void fillTank() {
        isFilled = true;
        System.out.println("Tank filled.");
    }
    public void emptyTank() {
        isFilled = false;
        System.out.println("Tank emptied.");
    }
    public void releaseTank() {
        isReleased = true;
        System.out.println("Tank released (cleaned up).");
    }
    @Override
    protected void finalize() throws Throwable {
        try {
            if (!isReleased) {
                System.out.println("Tank was not released properly before cleanup!");
            } else {
                System.out.println("Tank cleanup");
            }
        } finally {
            super.finalize(); 
        }
    }
    public static void main(String[] args) {
        // Scenario 1: Proper usage
        Tank36 t1 = new Tank36();
        t1.fillTank();
        t1.emptyTank();
        t1.releaseTank(); 
        Tank36 t2 = new Tank36();
        t2.fillTank(); 
        t1 = null;
        t2 = null;
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main method finished.");
    }
}
