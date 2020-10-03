package string2int;

import java.util.Scanner;

public class Input {
    private String inputText;
    
    public Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        this.inputText = sc.nextLine();
    }
    
    public String inputText(){
        return inputText;
    }
    
}
