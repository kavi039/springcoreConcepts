package config;

import DIProblem.Restaurent;
import DIProblem.Tea;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public Tea getTea(){
        return new Tea();
    }

    @Bean
    public Restaurent getRestaurent(){
        Restaurent restaurent = new Restaurent("fuytfuy");
//        restaurent.setDrink(getTea());
        return restaurent;
    }

}
