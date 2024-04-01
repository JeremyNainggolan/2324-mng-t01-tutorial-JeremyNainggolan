package driver;

import model.*;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid = true;

        while (valid) {
            System.out.println("Input charging type (TypeA/TypeC/TypeLightning): ");
            System.out.println("Type 'exit' to exit");
            String input = sc.nextLine();
            switch (input) {
                case "TypeA":
                    System.out.print("Input merk: ");
                    String merkA = sc.nextLine();
                    System.out.print("Input voltage: ");
                    int voltageA = Integer.parseInt(sc.nextLine());
                    System.out.print("Input charging speed: ");
                    int chargingSpeedA = Integer.parseInt(sc.nextLine());
                    TypeA typeA = new TypeA(merkA, voltageA, chargingSpeedA);
                    System.out.println(typeA.toString());
                    System.out.println();
                    break;
                case "TypeC":
                    System.out.print("Input merk: ");
                    String merkC = sc.nextLine();
                    System.out.print("Input voltage: ");
                    int voltageC = Integer.parseInt(sc.nextLine());
                    System.out.print("Input charging speed: ");
                    int chargingSpeedC = Integer.parseInt(sc.nextLine());
                    TypeC typeC = new TypeC(merkC, voltageC, chargingSpeedC);
                    System.out.print(typeC.toString());
                    System.out.println();
                    break;
                case "TypeLightning":
                    System.out.print("Input merk: ");
                    String merkL = sc.nextLine();
                    System.out.print("Input voltage: ");
                    int voltageL = Integer.parseInt(sc.nextLine());
                    System.out.print("Input charging speed: ");
                    int chargingSpeedL = Integer.parseInt(sc.nextLine());
                    TypeLightning typeL = new TypeLightning(merkL, voltageL, chargingSpeedL);
                    System.out.print(typeL.toString());
                    System.out.println();
                    break;
                case "exit":
                    valid = false;
                    break;
            }
        }
        sc.close();
    }
}
