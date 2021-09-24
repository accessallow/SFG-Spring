package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectorController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    GreetingService greetingService;

    public String sayGreeting(){
        return this.greetingService.sayHello();
    }
}
