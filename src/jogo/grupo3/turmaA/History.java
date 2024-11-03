package jogo.grupo3.turmaA;

public class History {
    public final int challengeLevel;

    public History(int challengeLevel) {
        this.challengeLevel = challengeLevel;
    }

    public void showGame() {
        System.out.println(this.challengeLevel);
    }
}
