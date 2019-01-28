import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

class Validator {
	public static ArrayList addList(String pw) {
		ArrayList<Character>list = new ArrayList<Character>();
		int len = pw.length();
		for(int i=0; i<len ; i++) {
			list.add(pw.charAt(i));
			}
			return list;
		}
		public static boolean check8(ArrayList list) {
			if(list.size() < 8) return false;
			else return true;
		}
		public static boolean checkpw(String pw) {
			String code = pw.toLowerCase();
			String code1 = "password";
			if(code.equals(code1)) return false;
			else return true;
		}
		public static void main(String [] args) {
			Scanner input = new Scanner (System.in);
			System.out.println("Enter your password: ");
			String passw = input.nextLine();
			ArrayList<Character>list1 = new ArrayList<Character>();
			list1 = addList(passw);
			if(check8(list1)) System.out.println("∙ At least 8 characters long √");
			else System.out.println("∙ At least 8 characters long ×");
			if(checkpw(passw)) System.out.println("∙ Is not 'password' √");
			else System.out.println("∙ Cannot be 'password' ×");
		}
	

	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
