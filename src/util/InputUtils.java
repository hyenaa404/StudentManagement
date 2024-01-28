
package util;

import java.util.Scanner;

/**
 *
 * @author nhs
 */
public class InputUtils {
    private static Scanner sc = new Scanner (System.in);
    
    public static int inputOption(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int rs;
        while (true) {
            try {
                rs = Integer.parseInt(sc.nextLine());
                if (rs < min || rs > max) {
                    throw new ArithmeticException("Not valid. Enter a valid number from " + min + " to " + max + ".");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid integer number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }

        return rs;
    }
    
    public static String inputId() {

        String id;
        while (true) {
            try {
                id = sc.nextLine().trim();
                if (!id.matches("[a-zA-Z0-9]+")) {
                    throw new IllegalArgumentException("Invalid ID. Please enter a valid ID.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.print(e.getMessage());
            }
        }
        return id;
    }
    
    public static String inputName() {
        String name;
        while (true) {
            try {
                name = sc.nextLine();

                if (!name.matches("[a-zA-Z .]+")) {
                    throw new IllegalArgumentException("Invalid name. Please enter a valid name.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.print(e.getMessage());
            }
        }
        name = FormatString.formatName(name);
        return name;
    }
    
    public static String inputString() {
        String str;
        while (true) {
            try {
                str = sc.nextLine();

                if (str.length() > 25 || str.isBlank()) {
                    throw new IllegalArgumentException("Require to input string and no more than 25 words.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.print(e.getMessage());
            }
        }
        return str;
    }
    public static String inputCourse(){
        String str;
        while (true){
            str = sc.nextLine().trim();
            if (str.equalsIgnoreCase("java")
                    || str.equalsIgnoreCase(".net")
                    || str.equalsIgnoreCase("c/c++")) {
                return str;
            }
            System.err.println("Please enter one valid course as bellows: Java, .Net, C/C++");
            System.out.print("Enter again: ");
        }
    }
    public static int inputInt() {
        int rs;
        while (true) {
            try {
                rs = Integer.parseInt(sc.nextLine());
                if (rs <= 0) {
                    throw new ArithmeticException("Not valid. Enter a positive number.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid integer number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }

        return rs;
    }
}
