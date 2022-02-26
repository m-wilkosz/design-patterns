package proxy;

public class RealSubject implements Subject {
    public void request(String c) {
        switch(c) {
        case "1":
            method1();
            break;
        case "2":
            method2();
            break;
        case "3":
            method3();
            break;
        default:
            System.out.println("error");
        }
    }

    public void method1() {
        System.out.println("execution of method 1");
    }
    public void method2() {
        System.out.println("execution of method 2");
    }
    public void method3() {
        System.out.println("execution of method 3");
    }
}