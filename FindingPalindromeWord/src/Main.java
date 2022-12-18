import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Bastan okunusu ile sondan okunusu ayni cumle veya kelimeler.
        //Stack ile yazilacak.
        //kasaylabalyasak



        Scanner scanner = new Scanner(System.in);
        String cumle = scanner.nextLine();

        Stack<Character> stack = new Stack<Character>();

        //basindan yarisina kadar gidip al.

        for(int i = 0 ; i<cumle.length()/2;i++){
            stack.push(cumle.charAt(i));
        }
        if (isPalindrome(cumle,stack)){

            System.out.println("Yes Palindrome");
        }else {
            System.out.println("degil.");
        }

    }

    public static boolean isPalindrome(String cumle,Stack<Character> stack){
        for(int i = (cumle.length()/2   ) +1 ; i<cumle.length(); i++){

            if(cumle.charAt(i) != stack.pop()){
                return false;
            }

        }
        return true;
    }
}