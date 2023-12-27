import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CopaBotao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.equals("0 0")){
                break;
            }
            List<Integer> numbers = Arrays.stream(line.split(" ")).map(Integer::parseInt).toList();
            int times = numbers.get(0);
            //System.out.println(times);
            int partidas = numbers.get(1);
            int pontuacaoTotal = 0;
            int empates = 0;
            while(times > 0){
                String paisPontuacao = scanner.nextLine();
                List<String> paisPontuacaoList = Arrays.stream(paisPontuacao.split(" ")).toList();
                pontuacaoTotal += Integer.parseInt(paisPontuacaoList.get(1));
                times--;
            }
            empates = 3 * partidas - pontuacaoTotal;
            System.out.println(empates);
        }
    }
}
