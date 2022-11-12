package javaapplication17;
import java.util.Scanner;

public class Keputusan2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String huruf;
        System.out.print("masukkan huruf anda (input 1 huruf saja =");
        huruf=scan.nextLine();
        if("a".equalsIgnoreCase(huruf)){
            System.out.println("huruf vokal");
        }
        else if("i".equalsIgnoreCase(huruf)){
            System.out.println("huruf vokal");
        }
        else if("u".equalsIgnoreCase(huruf)){
            System.out.println("huruf vokal");
        }
        else if("e".equalsIgnoreCase(huruf)){
            System.out.println("huruf vokal");
        }
        else if("o".equalsIgnoreCase(huruf)){
            System.out.println("huruf vokal");
        }
        else{
            System.out.println("huruf konsonan");
        }
    }
    
}
