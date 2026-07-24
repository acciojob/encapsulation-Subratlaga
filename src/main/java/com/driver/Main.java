package com.driver;


  public class Main {


    public static void main(String[] args) {

        // Create object of RWOnly
        RWOnly obj = new RWOnly();

        // Direct access (This will cause compile-time errors)

        // obj.name = "John";
        // System.out.println(obj.name);

        /*
         * Error:
         * name has private access in RWOnly
         * The field RWOnly.name is not visible
         */

        // Set value using setter
        obj.setName("John");

        // Get value using getter
        System.out.println(obj.getName());
    }
}
