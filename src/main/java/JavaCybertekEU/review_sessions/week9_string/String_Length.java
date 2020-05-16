package review_sessions.week9_string;

public class String_Length {

	public static void main(String[] args) {
		
		String name = "Mike Smith";
		
		System.out.println(name.length());
		
		int length = name.length();
		
		System.out.println(length);
		
		String str = "";
		System.out.println(str.length());
		
		String password = "cybertek123";
		if(password.length()>=8) {
			System.out.println("Password length matches requirement");
		}else {
			System.out.println("Password is too short");
		}

	}

}
