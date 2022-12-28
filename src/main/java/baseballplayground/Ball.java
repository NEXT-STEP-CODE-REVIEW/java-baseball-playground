package baseballplayground;

public class Ball {
    private int index, num;

    public Ball(int index, int num) {
        this.index = index;
        this.num = num;
    }

    public int getIndex() {
        return index;
    }

    public int getNum() {
        return num;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return index == ball.index && num == ball.num;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "index=" + index +
                ", num=" + num +
                '}';
    }
}
