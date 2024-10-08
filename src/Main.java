import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        ArrayList<String> arr = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c != ' '){
                stringBuilder.append(c);
            } else if(!stringBuilder.isEmpty()){
                    arr.add(stringBuilder.toString());
                    stringBuilder.setLength(0);
            }
        }
        if(!stringBuilder.isEmpty()){
            arr.add(stringBuilder.toString());
            stringBuilder.setLength(0);
        }
        for(int i = arr.size() - 1; i >= 0; i--){
            stringBuilder.append(arr.get(i));
            stringBuilder.append(' ');
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}


