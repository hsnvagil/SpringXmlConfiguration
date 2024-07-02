import az.atl.ServiceCar;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-configuration.xml");

        ServiceCar serviceCarImpl = applicationContext.getBean("ServiceCarImpl", ServiceCar.class);
        serviceCarImpl.callCar();

        ServiceCar serviceCarImpl2 = applicationContext.getBean("ServiceCarImpl2", ServiceCar.class);
        serviceCarImpl2.callCar();

    }
}
