package day45_exceptions;

public class Runtimeerror {

	public static void main(String[] args) {
		go();
	}
	
	public static void go() {
		System.out.println("Going");
		go();
	}

}
