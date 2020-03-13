package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Car {


    @Qualifier(value="engine1")
    @Autowired()
    private Engine engine;
    private String carName;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void printCarDetails(){

        System.out.println("Car Name: "+carName);
        System.out.println("Car Engine Model: "+engine.getModel());
    }
}
