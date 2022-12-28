package baseballplayground;

import java.util.Objects;

public class Judgement {
    private int strike, ball;

    public Judgement(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Judgement judgement = (Judgement) o;
        return strike == judgement.strike && ball == judgement.ball;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strike, ball);
    }

    @Override
    public String toString() {
        return "Judgement{" +
                "strike=" + strike +
                ", ball=" + ball +
                '}';
    }
}
