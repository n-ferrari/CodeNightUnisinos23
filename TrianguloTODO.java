import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrianguloTODO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String NString = scanner.nextLine();
            int N = Integer.parseInt(NString);
            String line = scanner.nextLine();
            List<Integer> numbers = Arrays.stream(line.split(" ")).map(Integer::parseInt).toList();
            int perimeter = 0;
            for(int number : numbers){
                perimeter += number;
            }
            int arc = perimeter / 3;
            int sumArc = 0; // quando a soma do arco passa o tamanho do arco, termina
            int indexStart = 0; //inicia no indice 0
            int index = 0;
            int totalSumCircle = perimeter;
            int numberTriangles = 0;
            while (sumArc < arc){
                index = indexStart;//loop para testar todos os triangulos possiveis
                int countArcs = 0;
                int somaArcoAtual = 0;
                while(totalSumCircle > 0){
                    somaArcoAtual += numbers.get(index);
                    totalSumCircle -= numbers.get(index);
                    System.out.println("soma arco atual "+somaArcoAtual);
                    System.out.println("totalSumCircle "+totalSumCircle);

                    if(somaArcoAtual == arc){
                        countArcs++;
                        somaArcoAtual = 0;
                    }
                    index++;
                }
                if(countArcs == 3){
                    numberTriangles += 1;
                }

                sumArc += numbers.get(indexStart + 1);
                indexStart ++;
            }
        System.out.println(numberTriangles);
    }
}
