package damla;
import damla.config.AppConfig;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import com.sun.xml.internal.ws.model.AbstractWrapperBeanGenerator;
//import javafx.application.Application;
////import org.apache.naming.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
         //BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        //EmailService emailService = new EmailService();
       // BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmailService emailService = context.getBean("emailService",EmailService.class);
        System.out.println(emailService);
        emailService.sendEmail("test@gmail.com", "Hello from miss Damla");

        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService1 = context.getBean("emailService",EmailService.class);
        System.out.println(emailService1);
        emailService1.sendEmail("test@gmail.com","hi");
    }
}
