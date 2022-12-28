package baseballplayground;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {
    @Test
    void _1strike_2ball() {
        Ball comBall1 = new Ball(0, 1);
        Ball comBall2 = new Ball(1, 2);
        Ball comBall3 = new Ball(2, 3);
        List<Ball> comBallList = new ArrayList<>();
        comBallList.add(comBall1);
        comBallList.add(comBall2);
        comBallList.add(comBall3);
        Balls comBalls = new Balls(comBallList);


        Ball userBall1 = new Ball(0, 1);
        Ball userBall2 = new Ball(1, 3);
        Ball userBall3 = new Ball(2, 2);
        List<Ball> userBallList = new ArrayList<>();
        userBallList.add(userBall1);
        userBallList.add(userBall2);
        userBallList.add(userBall3);
        Balls userBalls = new Balls(userBallList);
        Judgement collect = new Judgement(1, 2);
        Judgement collect2 = new Judgement(1, 2);

        assertThat(BallsService.judge(comBalls, userBalls)).isEqualTo(collect);

    }

    @Test
    void _3strike() {

    }

    @Test
    void _3ball() {

    }

    @Test
    void _nothing() {

    }
}
