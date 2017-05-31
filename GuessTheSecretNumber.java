package GuessTheSecretNumber;
import java.util.Random;
import java.util.*;
public class GuessTheSecretNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		int y=0;
		char yesOrNo;
		do{
		
		do{
		System.out.println("enter your guess(a number between one and ten): ");
		 try{
			 y = s.nextInt();
	        }catch(Exception e){
	            System.out.println("Enter an integer");
	        }
		 if (y<0||y>11){
			 System.out.println("Integer not between 1 and 10. Try again.");
		 }
		}while(y<0 || y>11);
		
		if (y==x){
			System.out.println("Congratulations! Your guess is right. ");
			break;
			}
		else{
				do{
				System.out.println("Number does not match. Do you want to try again(Y/N)?");
				yesOrNo= s.next(".").charAt(0);
				}while(yesOrNo!='Y'&&yesOrNo!='N'&&yesOrNo!='y'&&yesOrNo!='n');
			
			}
	
		}while(yesOrNo=='Y'||yesOrNo=='y');
		s.close();
	}

}
