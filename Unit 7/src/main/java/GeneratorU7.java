
import java.util.Iterator;
import java.util.Random;

public class GeneratorU7 implements Iterator<Integer> {

    private int numberOfIntegers;
    private int generated;
    private Random rand = new Random();
    private int upperbound = Integer.MAX_VALUE;

    public GeneratorU7(int size) {
        this.numberOfIntegers = size;
    }

    
    public boolean hasNext() {
        return generated != numberOfIntegers;
    }


    public Integer next() {
        generated++;
        return rand.nextInt(upperbound);
    }
}