import java.util.*;

public class Bota {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String quantString;
            while(true){
                try {
                    quantString = scanner.nextLine();
                }catch (NoSuchElementException e){
                    break;
                }

                int quantidade = Integer.parseInt(quantString);
                int pares = 0;

                Map estoque = new HashMap<String, Integer>();

                for (int i = 0; i < quantidade; i++) {
                    String numeracaoBota = scanner.nextLine();
                    String numeracaoPar = numeracaoBota.substring(0, 3);

                    if (numeracaoBota.substring(3).equals("E")){
                        numeracaoPar = numeracaoPar.concat("D");
                    }else{
                        numeracaoPar = numeracaoPar.concat("E");
                    }
                    //System.out.println(numeracaoPar);
                    if(estoque.containsKey(numeracaoPar)){
                        pares += 1;
                        int qntestoque = (int) estoque.get(numeracaoPar) - 1;
                        estoque.put(numeracaoPar, qntestoque);
                        if((int)estoque.get(numeracaoPar) == 0){
                            estoque.remove(numeracaoPar);
                        }
                    }else if(!estoque.containsKey(numeracaoBota)){
                        estoque.put(numeracaoBota, 1);
                    }else{
                        estoque.put(numeracaoBota, (int) estoque.get(numeracaoBota) + 1);
                    }
                }
                System.out.println(pares);
            }
    }
}
