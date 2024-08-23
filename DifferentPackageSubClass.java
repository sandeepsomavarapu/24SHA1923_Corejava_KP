package pack2;

import pack1.Client;

public class DifferentPackageSubClass extends Client {

	public static void main(String[] args) {
		DifferentPackageSubClass obj = new DifferentPackageSubClass();
		obj.displayMsg();// Different Package SubClass
	}

}

class Child {
	void m3() {
		Client client = new Client();
				client.displayMsg();// Different Package non-SubClass
	}

}