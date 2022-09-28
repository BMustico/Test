/**
 * A simple Hello World program
 *
 * @author Benjamin T. Mustico
 * @version 31 August, 2022
 */
public class HelloWorld extends Say {
    private int n;

    public HelloWorld(int n) {
        super();
        this.n = n;
    }
    public void saySomething() {
        System.out.println("Hello, World!");
    }
}
