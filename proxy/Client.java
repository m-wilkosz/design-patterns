package proxy;

public class Client {
    public static void main(String[] args) {
        String passwd = "passwd2";
        Subject subject = new Proxy();
        subject.request(passwd);
    }
}