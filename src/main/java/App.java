import java.io.Console;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Please enter your text");
        String entry = myConsole.readLine();
        cipher data = new cipher(entry);
        System.out.println("Would you like to encrypt or decrypt your file");
        String choice = myConsole.readLine();
        if (choice.equals("encrypt")) {
            String upperCLass = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lowerClass = "abcdefghijklmnopqrstuvwxyz";
            String special = "!@#$%^&*()?/<>,.+-";
            String numbers = "0123456789";
            for (int i = 0; i < data.length(); i++) {
                for (int j = 0; j < 26; j++) {
                    if (j < special.length() && data.charAt(i) == special.charAt(j)) {
                        System.out.print(special.charAt(j));
                    } else if (j < numbers.length() && data.charAt(i) == numbers.charAt(j)) {
                        System.out.print(numbers.charAt(j));
                    } else if (j < upperCLass.length() && data.charAt(i) == upperCLass.charAt(j)) {
                        System.out.print(upperCLass.charAt((j + 23) % 26));
                    } else if (j < lowerClass.length() && data.charAt(i) == lowerClass.charAt(j)) {
                        System.out.print(lowerClass.charAt((j + 23) % 26));
                    }

                }
            }
            System.out.println();
        }
        else if(choice.equals("decrypt")){
            System.out.println("Your decrypted data is :");
            String upperCLass = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lowerClass = "abcdefghijklmnopqrstuvwxyz";
            String special = "!@#$%^&*()?/<>,.+-";
            String numbers = "0123456789";
            for (int i = 0; i < data.length(); i++) {
                for (int j = 0; j < 26; j++) {
                    if (j < special.length() && data.charAt(i) == special.charAt(j)) {
                        System.out.print(special.charAt(j));
                    } else if (j < numbers.length() && data.charAt(i) == numbers.charAt(j)) {
                        System.out.print(numbers.charAt(j));
                    } else if (j < upperCLass.length() && data.charAt(i) == upperCLass.charAt(j)) {
                        System.out.print(upperCLass.charAt((j + 3) % 26));
                    } else if (j < lowerClass.length() && data.charAt(i) == lowerClass.charAt(j)) {
                        System.out.print(lowerClass.charAt((j + 3) % 26));
                    }

                }
            }
            System.out.println();
        }

        }
    }


