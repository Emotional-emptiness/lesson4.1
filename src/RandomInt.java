import java.util.ArrayList;
import java.util.Random;
public class RandomInt {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> listSize = new ArrayList<>();
        for (int i = 0; i < 1000; i++)
            listSize.add(random.nextInt(666));
        listSize.forEach(System.out::println);
    }
}
