package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int FALSE_VALUE = -1;
    private static final int FULL_STACK_VALUE = 11;
    private final int[] numbers = new int[getSIZE()];
    private int total = getFalseValue();

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    protected boolean callCheck() {
        return total == getFalseValue();
    }

    public boolean isFull() {
        return total == getFullStackValue();
    }

    protected int peekaboo() {
        if (callCheck())
            return getFalseValue();
        return getNumbers()[total];
    }

    public int countOut() {
        if (callCheck())
            return getFalseValue();
        return getNumbers()[total--];
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public static int getSIZE() {
        return SIZE;
    }

    public static int getFalseValue() {
        return FALSE_VALUE;
    }

    public static int getFullStackValue() {
        return FULL_STACK_VALUE;
    }

}
