package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

// Pytanie: Które wiersze w klasie HanoiRhymer były źle sformatowane?
// Odpowiedź: Wiersze: 12,13,14,15 -> ciało funkcji public void countIn(int in)
//            Wiersze: 5 -> zmienna int totalRejected=0;

// Pytanie: Zweryfikuj działanie kombinacji klawiszy alt + ← oraz alt + →.
// Odpowiedź: Odpowiada za przechodzenie pomiędzy otwartymi oknami.