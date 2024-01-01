import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Guarda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        while (true) {
            try {
                line = scanner.nextLine();
            } catch (NoSuchElementException e) {
                break;
            }
            List<Integer> numbers = Arrays.stream(line.split(" ")).map(Integer::parseInt).toList();
            double D = numbers.get(0);
            double Vf = numbers.get(1);
            double Vg = numbers.get(2);

            if (Vf == Vg) {
                System.out.println("N");
            } else {
                double value = (D * D)/(Vg * Vg - Vf * Vf);
                if(value > 0){
                    double t = Math.sqrt(value);
                    //System.out.println(t);
                    if (Vf * t > 12 || t < 0) {
                        System.out.println("N");
                    } else {
                        System.out.println("S");
                    }
                }else{
                    System.out.println("N");
                }
            }

        }
    }
}
