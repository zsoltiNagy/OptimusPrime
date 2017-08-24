import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OptimusPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the maximum number: ");
        int boundary = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (Integer i = 1; i < boundary; i++) {
            numbers.add(i);
        }
        System.out.println(rollOut(numbers));
    }

    public static ArrayList rollOut(ArrayList<Integer> numbers){
        for (int k = 0; k < numbers.size(); k++ ) {
            for (int j = 1; j < numbers.size(); j++) {
                if (numbers.get(k)>1 &&
                        numbers.get(j)>numbers.get(k)&&
                        numbers.get(j) % numbers.get(k) == 0) {
                    numbers.remove(j);
                }
            }
        }

        return numbers;
    }
}
