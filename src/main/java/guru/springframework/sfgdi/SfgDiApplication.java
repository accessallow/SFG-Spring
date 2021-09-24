package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("----------Primary Bean Injection------------");
		MyController myController = (MyController) context.getBean("myController");
		System.out.println(myController.sayGreeting());

		System.out.println("----------Constructor Based Injection------------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.sayGreeting());

		System.out.println("----------Setter Based Injection------------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.sayGreeting());

		System.out.println("----------Property Based Injection------------");
		PropertyInjectorController propertyInjectorController = (PropertyInjectorController) context.getBean("propertyInjectorController");
		System.out.println(propertyInjectorController.sayGreeting());

		System.out.println("----------Profile Based Injection------------");
		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());
	}

}
