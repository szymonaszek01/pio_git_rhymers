package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int FALSE_VALUE = -1;
    private static final int FULL_STACK_VALUE = 11;
    private final int[] numbers = new int[SIZE];

    private int total = FALSE_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == FALSE_VALUE;
    }

    public boolean isFull() {
        return total == FULL_STACK_VALUE;
    }

    protected int peekaboo() {
        if (callCheck())
            return FALSE_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return FALSE_VALUE;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
