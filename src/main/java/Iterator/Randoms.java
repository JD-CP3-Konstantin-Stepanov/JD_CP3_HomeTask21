package Iterator;

import java.util.*;
import java.util.Random;

class Randoms implements Iterable<Integer> {
    Random random = new Random();
    int min;
    int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public IteratorImpl iterator() {
        return new IteratorImpl(random.nextInt((max - min) + 1) + min);
    }

    class IteratorImpl implements Iterator<Integer> {

        int current;

        public IteratorImpl(int current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current <= max;
        }

        @Override
        public Integer next() {
            return random.nextInt((max - min) + 1) + min;
        }
    }
}
