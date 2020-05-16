package review_sessions.week11_wrapperClasses_arrayList;

public class VotingCheck2 {

	public static void main(String[] args) {

		checkIfCanVote(1999); //true

	}
	
    public static void checkIfCanVote(int birthYear){
    	
        if(printAge(birthYear) >= 18){
            System.out.println(printAge(birthYear) +" - You are eligible to vote");
        }else{
            System.out.println(printAge(birthYear) +" - You are not eligible to vote");
        }
        
    }
    
    public static int printAge(int birthYear){
        return 2019 - birthYear;
    }

	

}
