package DIProblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDIProblem {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Restaurent restaurent = context.getBean("restaurent",Restaurent.class);
        System.out.println("................."+restaurent);
    }
}
