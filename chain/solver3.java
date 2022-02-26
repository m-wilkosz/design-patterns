package chain;

public class Solver3 implements Solver {
    public void handleRequest(double a, double b, double delta) {
            System.out.println("solution: " + (-b/(2*a)) + " - " + Math.sqrt(-delta)/(2*a) + "i and "
                                            + (-b/(2*a)) + " + " + Math.sqrt(-delta)/(2*a) + "i");
    }
}