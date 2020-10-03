package string2int;
public class DetectNumber {
    private String text = "", number = "";
    private int integer=0;
    DetectNumber(String text){
        this.text = text;
        dispart();
        toInt();
    }
    
    private void dispart(){
        int textLength = text.length();
        for (int i = 0; i < textLength; i++) {
            char character = text.charAt(i);
            detectNumber(character);
        }
    }
    
    private void detectNumber(char character){
        char numberSet[] = {'0','1','2','3','4','5','6','7','8','9'};
        for (int i = 0; i < 10; i++) {
            if(character == numberSet[i]){
                number += character;
            }
        }
    }
    
    private void toInt(){
        int digit = 1;
        for (int i = number.length()-1; i >= 0; i--){
            integer += (number.charAt(i) - '0') * digit;
            digit *= 10;
        }
    }
    
    public int getInteger() {
        return integer;
    }
    
}
