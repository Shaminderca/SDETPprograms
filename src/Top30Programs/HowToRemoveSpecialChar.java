package Top30Programs;

public class HowToRemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String newChar = "12#$%^&* the $%*ui";
    String newStr = newChar.replaceAll("[^a-zA-Z0-9]", "");
    System.out.println(newStr);
	}

}
