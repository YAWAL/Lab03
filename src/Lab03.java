import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lab03 {


    public static void main(String[] args) {

        int n;

        double array[] = new double[]{3.4, 2.5, 3.4, 1.8, 4.3};

        Map<Double,Integer> dupen = new HashMap<Double,Integer>();

        for (int i = 0; i< array.length;i++){
            dupen.put(array[i], i);
        }

        double result[] = new double[5];

        for (Map.Entry<Double,Integer> entry : dupen.entrySet()){
            if (entry.getKey() > 1){
                for (int j =0; j < entry.getKey(); j++){
                    result[entry.getValue()] = entry.getKey();
                }
            }
        }

        for (Map.Entry<Double,Integer> entry : dupen.entrySet()){
            if (entry.getKey() == 1){
                    result[entry.getValue()] = entry.getKey();

            }
        }
                                 System.out.println(result.toString());
    }

}
