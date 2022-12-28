package baseballplayground;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    void strike() {
        Ball comBall1 = new Ball(0, 2);
        Ball comBall2 = new Ball(1, 2);
        Ball comBall3 = new Ball(2, 2);
        Ball userBall1 = new Ball(0, 2);
        Ball userBall2 = new Ball(1, 2);
        Ball userBall3 = new Ball(2, 2);
        assertThat(BallService.judge(comBall1, userBall1)).isEqualTo(BallStatus.STRIKE);
        assertThat(BallService.judge(comBall2, userBall2)).isEqualTo(BallStatus.STRIKE);
        assertThat(BallService.judge(comBall3, userBall3)).isEqualTo(BallStatus.STRIKE);

    }

    @Test
    void ball() {
        Ball comBall1 = new Ball(2, 2);
        Ball comBall2 = new Ball(0, 2);
        Ball comBall3 = new Ball(1, 2);
        Ball userBall1 = new Ball(0, 2);
        Ball userBall2 = new Ball(1, 2);
        Ball userBall3 = new Ball(2, 2);
        assertThat(BallService.judge(comBall1, userBall1)).isEqualTo(BallStatus.BALL);
        assertThat(BallService.judge(comBall2, userBall2)).isEqualTo(BallStatus.BALL);
        assertThat(BallService.judge(comBall3, userBall3)).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing() {
        Ball comBall1 = new Ball(2, 1);
        Ball comBall2 = new Ball(0, 1);
        Ball comBall3 = new Ball(1, 1);
        Ball userBall1 = new Ball(0, 2);
        Ball userBall2 = new Ball(1, 2);
        Ball userBall3 = new Ball(2, 2);
        assertThat(BallService.judge(comBall1, userBall1)).isEqualTo(BallStatus.NOTHING);
        assertThat(BallService.judge(comBall2, userBall2)).isEqualTo(BallStatus.NOTHING);
        assertThat(BallService.judge(comBall3, userBall3)).isEqualTo(BallStatus.NOTHING);
    }
}
