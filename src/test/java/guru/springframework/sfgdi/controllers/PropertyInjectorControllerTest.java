package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PrimaryGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectorControllerTest {

    PropertyInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectorController();
        controller.greetingService = new PrimaryGreetingService();
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}