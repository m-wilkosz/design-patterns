package proxy;

public class Proxy implements Subject {
    RealSubject subject = new RealSubject();

    public void request(String c) {
        if (c.equals("passwd1")) {
            method1();
        } else if (c.equals("passwd2")) {
            method2();
        } else if (c.equals("passwd3")) {
            method3();
        } else {
            System.out.println("error");
        }
    }

    public void method1() {
        subject.request("1");
    }
    public void method2() {
        subject.request("2");
    }
    public void method3() {
        subject.request("3");
    }
}