import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface StringFormatting{
    String formatString(String str);
}
public class Solution implements StringFormatting{

    public static final StringFormatting removeDigits = (String str) -> str.replaceAll("\\d","");

    public static final StringFormatting introduce = (String str) -> "This is my friend " + str.replaceAll ("\\d", "")+ ".";

    public static final StringFormatting greet = (String Str) -> "Hello," + str.replaceAll("\\d","")+"!";


    @Override
    public String formatString(String str){
        return str;
    }




    // public class Solution {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);
        String strl = scan.nextLine();

        String removingDigits = removeDigits.formatString(str1);
        String introduction = introduce.formatString(str1);
        String greeting = greet.formatString(str1);

        System.out.println(introduction);
        System.out.println(greeting);


    }
