package baseballplayground;

public class BallsService {
    public static Judgement judge(Balls comBalls, Balls userBalls) {
        int strike = 0;
        int ball = 0;

        for (Ball comBall : comBalls.getBalls()) {
            for (Ball userBall : userBalls.getBalls()) {
                if (BallService.judge(comBall, userBall) == BallStatus.STRIKE) {
                    strike++;
                    break;
                }
                if (BallService.judge(comBall, userBall) == BallStatus.BALL) {
                    ball++;
                    break;
                }
            }
        }
        return new Judgement(strike, ball);
    }
}
