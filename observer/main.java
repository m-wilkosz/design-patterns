package observerAPI;

public class Main {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();

		ConcreteObserver observer1 = new ConcreteObserver(subject);
		ConcreteObserver observer2 = new ConcreteObserver(subject);
		ConcreteObserver observer3 = new ConcreteObserver(subject);

		subject.setState(10);
	}
}