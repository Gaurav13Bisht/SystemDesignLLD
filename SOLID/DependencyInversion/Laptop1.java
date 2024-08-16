package SOLID.DependencyInversion;

    /*  This design do not follow DEPENDENCY INVERSION Principle since it states that:
         "Classes should depend on interface instead of concrete classes"

        Here, Laptop1.class is dependent on concrete classes ie WiredKeyboard and WiredMouse which in future
        suppose might need to changed to WirelessKeyboard and WirelessMouse then the whole Laptop1.class
        will be changed.
     */

public class Laptop1 {
    private WiredKeyboard keyboard;
    private WiredMouse mouse;

    public Laptop1(WiredKeyboard keyboard, WiredMouse mouse){
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}

class WiredKeyboard{
    // class members like wireLength and company
}

class WiredMouse{
    // class members like bluetooth version and company
}