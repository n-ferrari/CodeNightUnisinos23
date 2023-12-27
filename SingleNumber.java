import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String quantNum = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();

        Set<Integer> set = new HashSet<Integer>();

        for (int n : numbers){
            if(!set.contains(n)){
                set.add(n);
            }else{
                set.remove(n);
            }
        }

        Iterator itr = set.iterator();
        System.out.println(itr.next());
    }
}
