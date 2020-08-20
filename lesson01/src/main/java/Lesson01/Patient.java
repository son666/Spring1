package Lesson01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Patient {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Registry registry = context.getBean("Registry", Registry.class );
        registry.issue_direction();

    }

}
