package com.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTuturialsApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Application Test Started");

        Assertions.assertEquals(true, true);
    }

}
