package com.bide1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest  {
    @Test
    public void simple_test() {
        App app = new App();
        assertThat(app.return10()).isEqualTo(10);
    }
}
