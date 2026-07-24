package com.driver;


  public class Main {

    public static void main(String[] args) {

        // Create object of RWOnly
        RWOnly obj = new RWOnly();

        // Direct access (This will give compile-time errors)
        // obj.name = "Subrat";
        // System.out.println(obj.name);

        /*
         * Error:
         * name has private access in RWOnly
         */

        // Using Setter
        obj.setName("Subrat");

        // Using Getter
        System.out.println("Name: " + obj.getName());
    }
}

// RWOnly class
class RWOnly {

    // Private member variable
    private String name;

    // Setter Method
    public void setName(String name) {
        this.name = name;
    }

    // Getter Method
    public String getName() {
        return name;
    }
}
