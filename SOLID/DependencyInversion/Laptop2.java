package SOLID.DependencyInversion;

    /*  This is following DEPENDENCY INVERSION Principle since Laptop2.class is dependent on Interfaces
        Keyboard and Mouse instead of concrete classes and now this class will not change if we need to change
        the type of keyboard and mouse to be used, we just have to pass the required class's instance either
        wired or wireless through the constructor injection and it will work.
        In the future, lets say another type of Keyboard and mouse needs to be added, that can also be done
        without changing the current class Laptop2. We will just need to implement the Keyboard and mouse
        interface in those new classes and provide its instances through Constructor Injection.
     */

public class Laptop2 {

    private Keyboard keyboard;
    private Mouse mouse;

    public Laptop2(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}

//-------------------------------------------------------------------------------------------------

interface Keyboard{
    void printTypeOfKeyboard();
    void printCompanyName(String companyName);
}

interface Mouse{
    void printTypeOfMouse();
    void printDPI(String dpi); // Sensitivity
}

//-------------------------------------------------------------------------------------------------

class WiredKeyboard2 implements Keyboard{

    @Override
    public void printTypeOfKeyboard() {
        System.out.println("Wired Keyboard !");
    }

    @Override
    public void printCompanyName(String companyName) {
        System.out.println(companyName);
    }
}

class WiredMouse2 implements Mouse{

    @Override
    public void printTypeOfMouse() {
        System.out.println("Wired Mouse !");
    }

    @Override
    public void printDPI(String dpi) {
        System.out.println(dpi);
    }
}

//----------------------------------------------------------------------------------------

class WireLessKeyboard implements Keyboard{

    @Override
    public void printTypeOfKeyboard() {
        System.out.println("WireLess Keyboard !");
    }

    @Override
    public void printCompanyName(String companyName) {
        System.out.println(companyName);
    }
}

class WireLessMouse implements Mouse{

    @Override
    public void printTypeOfMouse() {
        System.out.println("WireLess Mouse !");
    }

    @Override
    public void printDPI(String dpi) {
        System.out.println(dpi);
    }
}