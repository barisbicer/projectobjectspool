
public class Algorithm {
	public static boolean isUppercase(String s) {
		
		return s.chars().allMatch(Character::isUpperCase);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isUppercase("helol"));
	}

}
