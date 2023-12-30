import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Contrato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BigInteger> output = new ArrayList<>();
        while(true) {
            String line = scanner.nextLine();
            if (line.equals("0 0")) {
                break;
            }
            String[] input = line.split(" ");
            char digFalha = input[0].charAt(0);
            List<Character> numOriginal = new ArrayList<>();

            numOriginal.add('0');

            for (int i = 0; i < input[1].length(); i++) {
                numOriginal.add(input[1].charAt(i));
            }
            //System.out.println("numero original" +numOriginal);

            for(int i = numOriginal.size() - 1; i > 0; i--){
                if(numOriginal.get(i) == digFalha){
                    numOriginal.remove(i);
                }
            }

            //System.out.println("numero atualizado" +numOriginal);

            StringBuilder sb = new StringBuilder();

            // Appends characters one by one
            for (Character ch : numOriginal) {
                sb.append(ch);
            }

            String string = sb.toString();

            output.add(new BigInteger(string));
            }

        for(BigInteger num : output){
            System.out.println(num);
        }

    }
}
