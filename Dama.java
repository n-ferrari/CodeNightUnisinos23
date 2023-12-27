import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.equals("0 0 0 0")){
                break;
            }
            List<Integer> numbers = Arrays.stream(line.split(" ")).map(Integer::parseInt).toList();
            if(numbers.get(0) == numbers.get(2) && numbers.get(1) == numbers.get(3)){
                System.out.println(0);
            } else if(numbers.get(0) == numbers.get(2) || numbers.get(1) == numbers.get(3)){
                System.out.println(1);
            } else if(Math.abs((numbers.get(0) - numbers.get(2))) == Math.abs((numbers.get(1) - numbers.get(3)))){
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }

        }


    }
}
