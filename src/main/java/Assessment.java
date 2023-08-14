import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assessment {
    private static Vehicle Vehicle;

    public static int factorial(int x) {
        if (x ==0){
            return 1;
        } else {
            return x * factorial(x-1);
        }
    }

    public static double quotient(double divisor, double dividend) {
        return divisor / dividend;
    }

    public static int quotient(int divisor, int dividend) {
        return divisor / dividend;
    }

    public static int minMaxSum(int[] nums) {
        int biggest = nums[0];
        int smallest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > biggest) {
                biggest = nums[i];
            }
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        return biggest + smallest;
    }

    public static HashMap<String, Vehicle> createInventory(ArrayList<Vehicle> vehicleArrayList) {
        String license = "SATX";
        HashMap<String, Vehicle> cars = new HashMap<>();
        for (int i = 0; i < vehicleArrayList.size(); i++) {
            cars.put(license + i, Vehicle);
        }
        return cars;
    }


    public static void main(String[] args) {
        System.out.println("hello");
    }
}
