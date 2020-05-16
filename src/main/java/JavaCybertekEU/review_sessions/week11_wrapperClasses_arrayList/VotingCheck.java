package review_sessions.week11_wrapperClasses_arrayList;

public class VotingCheck {

	public static void main(String[] args) {
		
        checkIfCanVote(44);
        checkIfCanVote(15);
        printAge(1999);//20

        printAge(1887);
        printAge(1985);
        printAge(2001);
		

	}
	
    public static void checkIfCanVote(int age){
        if(age >= 18){
            System.out.println(age +" - You are eligible to vote");
        }else{
            System.out.println(age +" - You are not eligible to vote");
        }
    }
    
    public static void printAge(int birthYear){
        int age = 2019 - birthYear;
        System.out.println("birthYear :"+ birthYear+". age: " + age);
    }
    
    

}
