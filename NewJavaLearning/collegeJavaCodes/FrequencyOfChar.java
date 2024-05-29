package NewJavaLearning.collegeJavaCodes;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        int upper=0,lower=0,digit=0,space=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                upper++;
            }else if(Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isWhitespace(ch)) {
                space++;
            } else if (Character.isDigit(ch)) {
                digit++;
            }
        }
        System.out.println("Upper : "+upper+" Lower : "+lower +
                " Space :"+space + " Digit : "+digit);
    }
}
