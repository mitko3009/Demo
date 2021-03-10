import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxPeople = Integer.parseInt(scanner.nextLine());
        String[] command = scanner.nextLine().split("\\s+");

        while (!(command[0].equals("end"))) {
            if (command[0].equals("Add")){
                wagons.add(Integer.parseInt(command[1]));
            }

            if (command.length == 1){
                int temporary = Integer.parseInt(command[0]);
                for (int i = 0; i < wagons.size(); i++){
                    int num = wagons.get(i);
                    if (temporary + num <= maxPeople){
                       int sum = temporary + num;
                       wagons.set(i, sum);
                       break;
                    }
                }
            }

            command = scanner.nextLine().split("\\s+");
        }

        for (int k = 0; k < wagons.size(); k ++){
            System.out.print(wagons.get(k) + " ");
        }
    }
}
