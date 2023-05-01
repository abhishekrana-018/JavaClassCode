//write a programe to print check if the number is even +ve or even -ve or odd +ve or odd -ve or 0

class ques2 {
    public static void main(String[] args) {
        int a = -10;
	  if (a>0){
		if (a%2==0){
			System.out.println("number is +ve even");
				}
		else{
		      System.out.println("number is +ve odd");
		
		} 
		}
	  else if (a<0) {
		if (a%2==0){
			System.out.println("number is - even");}
		else
			System.out.println("number is -ve odd");
		}
	 else {
		System.out.println("nuber is 0");}
		       
    }
}