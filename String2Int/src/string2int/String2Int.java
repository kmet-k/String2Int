package string2int;
public class String2Int {

    public static void main(String[] args) {
        Input input = new Input();
        String string = input.inputText();
        
        DetectNumber detectNumber = new DetectNumber(string);
        int integer = detectNumber.getInteger();
        
        System.out.println("Integer : "+integer);
        
    }
    
}
