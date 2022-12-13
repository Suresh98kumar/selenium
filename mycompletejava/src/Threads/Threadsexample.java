package Threads;

import javax.sound.midi.SysexMessage;

public class Threadsexample {
	public static void main(String[] args) {
		System.out.println("programs starts");
		for( int i=0; i<10;i++){
			try {
				Thread.sleep(1000);
			}
			catch(Exception E) {
			}
			System.out.println("processing");
			}
		System.out.println("programs end");
		}
		
	}
  class mytask extends Thread{
	  void main() {
		  
		  
	  }
	  }
	  
  


