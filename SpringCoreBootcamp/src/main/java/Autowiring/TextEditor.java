package Autowiring;

import Autowiring.SpellChecker;

public class TextEditor {

    private SpellChecker spellChecker;
    private String name;

    public TextEditor(SpellChecker spellChecker, String name ) {
        this.spellChecker = spellChecker;
        this.name = name;
    }

    public TextEditor(){

    }

//    public Autowiring.TextEditor(Autowiring.SpellChecker spellChecker){
//    this.spellChecker = spellChecker;
//    }

    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
}
