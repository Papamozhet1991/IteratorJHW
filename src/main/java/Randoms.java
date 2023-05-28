import java.util.Random;
import java.util.Iterator;

public class Randoms implements Iterable<Integer> {

    protected final Random random;
    private final int max;
    private final int min;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.max = max;
        this.min = min;
    }

    public int randomNumber() {
        return random.nextInt((max - min) + 1) + min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return randomNumber();
            }
        };
    }
}