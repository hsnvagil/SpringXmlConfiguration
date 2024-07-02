import az.atl.JavaConfiguration;
import az.atl.ServiceCar;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(JavaConfiguration.class);
        ServiceCar serviceCar = annotationConfigApplicationContext.getBean("serviceCar", ServiceCar.class);
        serviceCar.callCar();
    }
}