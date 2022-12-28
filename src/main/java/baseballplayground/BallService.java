package baseballplayground;

public class BallService {

    public static BallStatus judge(Ball comBall, Ball userBall) {
        if (comBall.equals(userBall)) {
            return BallStatus.STRIKE;
        }
        if (comBall.getNum() == userBall.getNum()) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }


}
