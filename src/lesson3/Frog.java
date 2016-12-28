package lesson3;

public class Frog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(10,85,30));
	}
    public static int solution(int X, int Y, int D) {
    	int result = (Y-X)/D;
    	
    	if((Y-X)%D == 0){
    		return result;
    	}
    	else{
    		return result +1;
    	}
	       
	}

}
