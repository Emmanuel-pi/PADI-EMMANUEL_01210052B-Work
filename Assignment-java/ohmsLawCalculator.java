import java.util.Scanner;

public class ohmsLawCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which parameter is unknown? (V, I, R):");
        String unknown = scanner.next().toUpperCase();

        double voltage = 0, current = 0, resistance = 0;

        switch (unknown) {
            case "V":
                System.out.println("Enter Current (I) in Amperes:");
                current = scanner.nextDouble();
                System.out.println("Enter Resistance (R) in Ohms:");
                resistance = scanner.nextDouble();
                voltage = current * resistance;
                System.out.printf("Voltage (V) = %.2f V%n", voltage);
                break;

            case "I":
                System.out.println("Enter Voltage (V) in Volts:");
                voltage = scanner.nextDouble();
                System.out.println("Enter Resistance (R) in Ohms:");
                resistance = scanner.nextDouble();
                current = voltage / resistance;
                System.out.printf("Current (I) = %.2f A%n", current);
                break;

            case "R":
                System.out.println("Enter Voltage (V) in Volts:");
                voltage = scanner.nextDouble();
                System.out.println("Enter Current (I) in Amperes:");
                current = scanner.nextDouble();
                resistance = voltage / current;
                System.out.printf("Resistance (R) = %.2f Ω%n", resistance);
                break;

            default:
                System.out.println("Invalid input. Please specify V, I, or R.");
        }

        scanner.close();
    }
}