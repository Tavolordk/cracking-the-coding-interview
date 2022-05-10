package ReverseString;

public class ReverseString {
    public static String doReverseString(String s){
        char letra;
        String reverse="";
        for(int i=0;i<s.length();i++){
            letra=s.charAt(i);
            reverse=letra+reverse;
        } 
        return reverse;
    }
    public static void main(String[] args){
        String prueba = "TAVO";
        String result = ReverseString.doReverseString(prueba);
        System.out.println(result);
    }
}
