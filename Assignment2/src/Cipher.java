import java.util.Scanner;

public class Cipher {

	public static StringBuffer encrypt(String text, int shift)
    {
        StringBuffer result= new StringBuffer();
 
        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                                  shift - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                                  shift - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
 
    // Driver code
	
	public static void main(String[] args) {
    {
        int shift = 4;
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text message to be encrypted ");
        String msg = new String();
        msg = scan.next();
        System.out.println("Shift : "  + shift);
        System.out.println("Text  : " + (msg));
        System.out.println("Cipher: " + encrypt(msg, shift));
    }
    
	}
}



