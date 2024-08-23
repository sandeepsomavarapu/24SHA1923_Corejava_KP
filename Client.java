package pack1;

public class Client {
	public void displayMsg() {
		System.out.println("am from displayMsg method from client");
	}

	public static void main(String[] args) {
		Client client = new Client();
		client.displayMsg();// same class
	}

}

class Child extends Client {

	public void m1() {
		displayMsg();// same package subclass
	}
}

class Test {
	public void m2() {
		Client client = new Client();
		client.displayMsg();// same package non-subclass
	}
}
