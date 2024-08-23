package com.kpmg.oops;

interface Mobile {
	public void makeACall();

	public void sendSms();

	public void chargesForSms();
}

class JioSim {

}

class AirtelSim {

}

class SamsungMobile implements Mobile {// is-a
	AirtelSim aritelSim;// has -a
	int charges = 1;

	public SamsungMobile() {
		System.out.println("am from samsung mobile default constructor");
	}

	public SamsungMobile(int charges) {
		this();
		this.charges = charges;
		System.out.println("am from samsung mobile param constructor");
	}

	@Override
	public void makeACall() {
		System.out.println("calling..........");
	}

	@Override
	public void sendSms() {
		System.out.println("sending message...");
		System.out.println("message sent");
		chargesForSms();
	}

	@Override
	public void chargesForSms() {
		System.out.println(charges + "rupee per message...");
	}
}

class SamsungGalaxyMobile extends SamsungMobile {
	int charges = 2;
	JioSim jioSim;// has-a

	public SamsungGalaxyMobile() {
		super(12);
		System.out.println("default constructor of samsunggalaxy");
		this.chargesForSms();// current class method calling using this
		super.chargesForSms();// parent class method calling using super
	}

	@Override
	public void chargesForSms() {
		System.out.println(this + "  :inside the method");
		System.out.println(this.charges + "rupees per message..." + super.charges);
	}
}

public class ThisSuperEx {
	public static void main(String[] args) {
		SamsungGalaxyMobile obj = new SamsungGalaxyMobile();
		obj.makeACall();
		obj.sendSms();
		System.out.println(obj);
		System.out.println(obj.toString());

	}

}
