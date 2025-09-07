import java.util.ArrayList;
import java.util.List;

class Divisors {
    public int[] divisors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
