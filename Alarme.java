import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Alarme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String line = scanner.nextLine();
            if (line.equals("0 0 0 0")) {
                break;
            }
            List<Integer> numbers = Arrays.stream(line.split(" ")).map(Integer::parseInt).toList();
            int horaInicio = numbers.get(0);
            int minutoInicio = numbers.get(1);
            int horaFim = numbers.get(2);
            int minutoFim = numbers.get(3);
            int minutosTotais = 0;

            if(horaFim < horaInicio){
                horaFim += 24;
            }else if(horaFim == horaInicio && minutoFim <  minutoInicio){
                horaFim += 24;
            }
            minutosTotais = (horaFim - horaInicio) * 60 + minutoFim - minutoInicio;

            System.out.println(minutosTotais);

        }
    }
}
