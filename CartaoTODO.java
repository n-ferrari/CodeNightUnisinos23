import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CartaoTODO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String cartas = scanner.nextLine();
            String line = scanner.nextLine();
            Long maximum = 0L;
            List<Long> numbers = new java.util.ArrayList<>(Arrays.stream(line.split(" ")).map(Long::parseLong).toList());
            while(!numbers.isEmpty()){
                int index = 0;
                Long inicioLista = numbers.get(index);
                Long FinalLista = numbers.get(numbers.size() - index - 1);
                //Vez do Alberto
                if(inicioLista == FinalLista){
                    while(numbers.get(index) == numbers.get(numbers.size() - index - 1)){
                        index++;
                    }
                    if(numbers.get(index) > numbers.get(numbers.size() - index - 1)){
                        maximum += FinalLista;
                        numbers.remove(numbers.size() - 1);
                    }else{
                        maximum += inicioLista;
                        numbers.remove(0);
                    }
                }else if (inicioLista > FinalLista){
                    maximum += inicioLista;
                    numbers.remove(0);
                }else{
                    maximum += FinalLista;
                    numbers.remove(numbers.size() - 1);
                }
                //Vez do Wanderley
                if(inicioLista > FinalLista){
                    numbers.remove(0);
                }else{
                    numbers.remove(numbers.size() - 1);
                }
            }
            System.out.println(maximum);
        }
    }
}
