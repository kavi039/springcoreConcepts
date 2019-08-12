package Autowiring;

public class SpellChecker {

    public SpellChecker(){
        System.out.println("Inside com.ttn.Autowiring.SpellChecker constructor." );
    }
    public void checkSpelling(){
        System.out.println("Inside checkSpelling." );
    }

    public void customInit()
    {
        System.out.println("Method customInit() invoked...");
    }

    public void customDestroy()
    {
        System.out.println("Method customDestroy() invoked...");
    }
}
