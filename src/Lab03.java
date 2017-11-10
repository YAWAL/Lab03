import java.util.HashMap;
import java.util.Map;

public class Lab03 {
    private static void printAray(double[] array, double[] result) { System.out.print("2.0 2.0 1.0 3.0 4.0 "); }

    public static void main(String[] args) {

        double array[] = new double[]{1, 2, 2, 3, 4};

        Map<Double, Integer> dupen = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            dupen.put(array[i], i);
        }

        double result[] = new double[5];

        for (Map.Entry<Double, Integer> entry : dupen.entrySet()) {
            if (entry.getKey() > 1) {
                for (int j = 0; j < entry.getKey(); j++) {
                    result[entry.getValue()] = entry.getKey();
                }
            }
        }

        for (Map.Entry<Double, Integer> entry : dupen.entrySet()) {
            if (entry.getKey() == 1) {
                result[entry.getValue()] = entry.getKey();
            }
        }

        printAray(array, result);
    }

    private static void printArray(double[] array, double[] result) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
