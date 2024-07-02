package az.atl;


import org.springframework.context.annotation.Bean;

public class ServiceCarImpl implements ServiceCar {
    private final Car car;

    public ServiceCarImpl(Car car) {
        this.car = car;
    }

    @Override
    public void callCar() {
        car.startCar();
    }
}
