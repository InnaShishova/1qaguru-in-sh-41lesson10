package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {

    @Test
    @Owner("Inna Shishova")
    @Feature("Jenkins homework")
    @Story("Simple autotest")
    @DisplayName("Successful simple test")
    void successfulTest() {
        step("Проверяем, что тест запускается", () -> {
            assertTrue(5 > 1);
        });
    }

    @Step("{stepName}")
    void step(String stepName, Runnable action) {
        action.run();
    }
}