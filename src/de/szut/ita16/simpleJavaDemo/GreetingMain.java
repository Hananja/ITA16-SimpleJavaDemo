package de.szut.ita16.simpleJavaDemo;

public class GreetingMain {
    public static void main(String args[]) {
        /* Erzeugen (Deklaration) einer
        Variable mit dem  Namen greeting
        vom Typ Greeting, die mit einem
        neuen Objekt der Klasse Greeting
        (einer neuen Instanz) initialisiert
        wird.
         */
        Greeting greeting;
        greeting = new Greeting();

        /* Ruft die Methoden doGreet() und
        doFamGreet() auf dem Objekt auf.
         */
        greeting.doGreet();
        greeting.doFamGreet();

        GreetingNamed greetingNamed =
                new GreetingNamed();

        greetingNamed.name = "Max";
        greetingNamed.doFamGreet();
    }
}
