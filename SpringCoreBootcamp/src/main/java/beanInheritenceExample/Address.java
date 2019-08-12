package beanInheritenceExample;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Address implements BeanPostProcessor {
    private String addressLine1,city,state,country;

    public Address(String addressLine1, String city, String state, String country) {
        super();
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    public String toString(){
        return addressLine1+" "+city+" "+state+" "+country;
    }

    @PostConstruct
    public void custominit() throws Exception {
        System.out.println("set property address...........");
    }

    @PreDestroy
    public void customdestroy() throws Exception {
        System.out.println("......destroy address");
    }
}
