package TheLastWordOfString;
public class TheLastWordOfString{
    public static int findLastWord(String s){
        int count=0;
        int space=s.length();
        int indice;

        for(indice=0;indice<space;indice++){
            if(s.charAt(indice)!=' '){
                 count++;
            }else{
                if(indice==space){
                    return count;
                }else{
                    count=0;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String prueba ="Prueba de último a as  ";
        int lastWord = TheLastWordOfString.findLastWord(prueba);
        System.out.println(lastWord);
    }
}