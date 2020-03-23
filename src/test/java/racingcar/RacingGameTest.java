package racingcar;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RacingGameTest {

    @Test
    void create() {
        RacingGame racingGame = new RacingGame(3, 4);
        assertThat(racingGame.getResult().size()).isEqualTo(3);
    }
}