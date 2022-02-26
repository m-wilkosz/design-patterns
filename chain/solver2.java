package chain;

public class Solver2 implements Solver {
    public void handleRequest(double a, double b, double delta) {
        if (delta > 0) {
            System.out.println("solution: " + (-b-Math.sqrt(delta))/(2*a) + " and "
                                            + (-b+Math.sqrt(delta))/(2*a));
        } else {
            Solver solver3 = new Solver3();
            solver3.handleRequest(a, b, delta);
        }
    }
}