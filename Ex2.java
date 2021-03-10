import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split("\\s+");
        while (!(command[0].equals("end"))) {
            if (command[0].equals("Delete")) {
                int num = Integer.parseInt(command[1]);
                for (int k = 0; k < list.size(); k++){
                    if (list.get(k).equals(num)){
                        list.remove(k);
                    }
                }
            }

            if (command[0].equals("Insert")) {
                int num = Integer.parseInt(command[1]);
                int posittion = Integer.parseInt(command[2]);
                if (posittion < list.size()) {
                    list.add(posittion, num);
                }
            }
            command = scanner.nextLine().split("\\s+");
        }

        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
            if (i + 1 != list.size()){
                System.out.print(" ");
            }
        }
    }
}
