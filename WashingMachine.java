import java.util.Scanner;
public class WashingMachine {
     public static String estimateWashingTime(int weight, char waterLevel) {
        if (weight < 0) {
            return "INVALID INPUT";
        }
        if (weight > 7000) {
            return "OVERLOADED";
        }
        if (weight == 0) {
            return "Time Estimated: 0 Minutes";
        }
        if (waterLevel == 'L') {
            if (weight > 0 && weight <= 2000) {
                return "Time Estimated: 25 Minutes";
            }
        } else if (waterLevel == 'M') {
            if (weight > 2000 && weight <= 4000) {
                return "Time Estimated: 35 Minutes";
            }
        } else if (waterLevel == 'H') {
            if (weight > 4000 && weight <= 7000) {
                return "Time Estimated: 45 Minutes";
            }
        }

        return "INVALID INPUT";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight (in grams): ");
        int weight = scanner.nextInt();
        System.out.print("Enter water level (L for Low, M for Medium, H for High): ");
        char waterLevel = scanner.next().charAt(0);
        String result = estimateWashingTime(weight, waterLevel);
        System.out.println(result);
    }
}