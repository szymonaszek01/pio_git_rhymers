package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {
    /**
     * Klasa FIFORhymers dziedziczy po klasie DefaultCountingOutRhymer.
     * Klasa FIFORhymers posiada dwie metody publiczne countOut() i getTemp().
     **/

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Metoda countOut() jest nadpisana i zwraca pierwszy element ze szczytu stosu.
     **/

    @Override
    public int countOut() {
        while (!callCheck())

            getTemp().countIn(super.countOut());

        int ret = getTemp().countOut();

        while (!getTemp().callCheck())

            countIn(getTemp().countOut());

        return ret;
    }

    /**
     * Metoda getTemp() zwraca utworzony stos.
     **/

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }
}
