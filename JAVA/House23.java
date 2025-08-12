package com.Assignment.Day1;
import static java.lang.System.out;

class Hall {
    public void showMessage() {
        // Printing without using System directly
        out.println("This is the first room while entering the house");
    }
}

class Kitchen {
    String[] appliances = {"Fridge", "Microwave", "Oven", "Mixer", "Toaster"};

    public void showAppliances() {
        System.out.println("Kitchen Appliances:");
        for (String appliance : appliances) {
            System.out.println(appliance);
        }

        // Copying the array
        String[] copiedAppliances = new String[appliances.length];
        System.arraycopy(appliances, 0, copiedAppliances, 0, appliances.length);

        // Print copied array
        System.out.println("\nCopied Appliance List:");
        for (String appliance : copiedAppliances) {
            System.out.println(appliance);
        }
    }
}

public class House23 {
    public static void main(String[] args) {
        Hall hall = new Hall();
        hall.showMessage();

        System.out.println();

        Kitchen kitchen = new Kitchen();
        kitchen.showAppliances();
    }
}
