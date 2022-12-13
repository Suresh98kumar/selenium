package encapsulation;

public class emicalcis {
	public double findEMI(float amt, int tenure) {
		double d1 = Math.pow(1 + getIR(tenure), tenure);
		double d2 = Math.pow(1 + getIR(tenure), tenure-1);
		return (amt * getIR(tenure) * (d1 / d2));
	}

	private float getInterestRate() {
		return 12.0f;
	}

	private float getIR(int tenure) {
		return getInterestRate()/(100*tenure);
	}
}


