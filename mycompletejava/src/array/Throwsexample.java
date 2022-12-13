package array;

import javax.sound.midi.SysexMessage;

public class Throwsexample {
	public static void main(String[] args) {
		 try{
			ApplyvoterID(26);
			dovote();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	static void ApplyvoterID(int age) throws Exception {
		if (age < 18)
			throw new Exception("age is under limit");
		System.out.println("voter ID applied");

	}

	static void dovote() {
		System.out.println("voting success");
	}
}

class AgeUnderlimitexception extends Exception{
	public AgeUnderlimitexception() {
		super("age is under limit");
	}
	
}
