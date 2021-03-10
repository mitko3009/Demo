import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer people = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<String>();
        guests.add(" ");

        for (int counter = 0; counter < people; counter++) {
            String[] input = scanner.nextLine().split(" ");

            if (input[1].equals("is") && input[2].equals("going!")) {
                boolean isIn = true;
                for (int i = 0; i < guests.size(); i++) {
                    if (input[0].equals(guests.get(i))) {
                        String temporary = input[0];
                        System.out.printf("%s is already in the list!\n", temporary);
                        isIn = false;
                        break;
                    }
                }
                if (isIn) {
                    guests.add(input[0]);
                }
            }

            if (input[1].equals("is") && input[2].equals("not")) {
                int k = 0;
                    for (int t = 0; t < guests.size(); t++) {
                        if (input[0].equals(guests.get(t))) {
                            guests.remove(t);
                            k++;
                            break;
                        }
                    }

                if (k == 0) {
                    String temporay = input[0];
                    System.out.printf("%s is not in the list!\n", temporay);
                }
            }

        }

        for (int u = 1; u < guests.size(); u++) {
            System.out.println(guests.get(u));
        }
    }
}
