package chain;

public class Client {
    public static void main(String[] args) {
        double a = 1, b = 6, c = -16, delta = b*b-4*a*c;
        Solver solver = new Solver1();
        solver.handleRequest(a, b, delta);
    }
}