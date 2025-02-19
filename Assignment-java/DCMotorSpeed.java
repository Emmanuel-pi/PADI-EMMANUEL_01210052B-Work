import java.util.Scanner;

public class DCMotorSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Voltage (V) in Volts:");
        double voltage = scanner.nextDouble();

        System.out.println("Enter Back EMF (E) in Volts:");
        double backEMF = scanner.nextDouble();

        System.out.println("Enter Motor Constant (K) in RPM/Volt:");
        double motorConstant = scanner.nextDouble();

        if (motorConstant <= 0) {
            System.out.println("Motor Constant must be a positive value.");
        } else {
            double speed = (voltage - backEMF) * motorConstant;
            if (speed < 0) {
                System.out.println("Invalid input: Speed cannot be negative.");
            } else {
                System.out.printf("Motor Speed = %.2f RPM%n", speed);
            }
        }

        scanner.close();
    }
}