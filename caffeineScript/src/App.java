public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println(CaffeineBuzz.caffeineBuzz(1));
        System.out.println(CaffeineBuzz.caffeineBuzz(3));
        System.out.println(CaffeineBuzz.caffeineBuzz(6));
        System.out.println(CaffeineBuzz.caffeineBuzz(12));
    }
}

/* 

Description:
Complete the function which takes a non-zero integer as its argument.

If the integer is divisible by 3, return the string "Java".

If the integer is divisible by 3 and divisible by 4, return the string "Coffee"

If one of the condition above is true and the integer is even, add "Script" to the end of the string.

If none of the condition is true, return the string "mocha_missing!" */