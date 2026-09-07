import java.util.Scanner;

class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Compare original and reversed string
        if (str.equals(rev)) {
            System.out.println(str + " is a Palindrome String");
        } else {
            System.out.println(str + " is Not a Palindrome String");
        }

        sc.close();
    }
}
