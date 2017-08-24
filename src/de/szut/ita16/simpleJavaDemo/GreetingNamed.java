package de.szut.ita16.simpleJavaDemo;

public class GreetingNamed extends Greeting {
    public String name;

    @Override
    public void doGreet() {
        System.out.println("Hello " + this.name);
    }

    @Override
    public void doFamGreet() {
        System.out.println("Hi " + this.name);
    }
}
