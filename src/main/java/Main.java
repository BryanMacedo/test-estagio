import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> events = new ArrayList<>(Arrays.asList(10, -20, 61, -15));
        List<Integer> events02 = new ArrayList<>(Arrays.asList(10, -20, -40, -15));

        System.out.println("Final: " + getBattery(events));
        System.out.println("Final: " + getBattery(events02));
    }

    public static int getBattery(List<Integer> events) {
        int batteryPercentage = 50;

        for (Integer event : events) {
            if (event > 0) {
                batteryPercentage += event;
                if (batteryPercentage > 100) batteryPercentage = 100;
            } else {
                batteryPercentage += event;
                if (batteryPercentage < 0) batteryPercentage = 0;
            }
        }
        return batteryPercentage;
    }
}
