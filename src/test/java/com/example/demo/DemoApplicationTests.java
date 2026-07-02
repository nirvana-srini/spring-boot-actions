package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        // Verify the application context starts successfully
    }

    @Test
    void helloEndpointReturnsExpectedMessage() {
        HelloController controller = new HelloController();
        String response = controller.hello();
        assertThat(response).isEqualTo("Hello from Spring Boot CI/CD!");
    }
}