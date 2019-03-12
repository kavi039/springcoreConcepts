package DIProblem;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Tea implements Drink{

    public void getDrink(){
        System.out.println("....    Tea");
    }
}
