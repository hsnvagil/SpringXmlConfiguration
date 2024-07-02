package az.atl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfiguration {
    @Bean
    public Bmw bmw() {
        return new Bmw();
    }

    @Primary
    @Bean
    public Mazda mazda() {
        return new Mazda();
    }

    @Bean
    public Audi audi() {
        return new Audi();
    }

    @Bean
    public ServiceCar serviceCar(@Qualifier("bmw") Car car) {
        return new ServiceCarImpl(car);
    }
}
