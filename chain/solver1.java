package chain;

public class Solver1 implements Solver {
    public void handleRequest(double a, double b, double delta) {
        if (delta == 0) {
            System.out.println("solution: " + -b/(2*a));
        } else {
            Solver solver2 = new Solver2();
            solver2.handleRequest(a, b, delta);
        }
    }
}