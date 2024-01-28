/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import util.InputUtils;

/**
 *
 * @author Admin
 */
public class Menu {
    public static int chooseInputOption(){
        System.out.println("1. Create student.");
        System.out.println("2. Find student.");
        System.out.println("3. Update of Delete.");
        System.out.println("4. Display report.");
        System.out.println("5. Exit.");
        int option = InputUtils.inputOption(1, 5);
        return option;
    }
}
