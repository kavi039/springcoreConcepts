package DIProblem;

import org.springframework.beans.factory.annotation.Required;

import java.util.ArrayList;
import java.util.List;

public class Restaurent {

//When we se autowire = byname in spring config file then Drink refrence should be
// the same as we are giving id in spring conifg file for drink bean.
// Change it to drink1 u will get drink object null while printing object
    Drink drink;
    String name;
    int age;
    List<String> breavages = new ArrayList<>();

    public Restaurent(String name){
        this.drink = drink;
        this.name = name;
    }

    public void getDrink(){
        drink.getDrink();
    }

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public List<String> getBreavages() {
        return breavages;
    }

    public void setBreavages(List<String> breavages) {
        this.breavages = breavages;
    }

    @Override
    public String toString() {
        return "Restaurent{" +
                "drink=" + drink +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", breavages=" + breavages +
                '}';
    }
}
