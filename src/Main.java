import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // please define the JAVA input here. For example: Scanner s = new Scanner(System.in);
    // please finish the function body here.
    // please define the JAVA output here. For example: System.out.println(s.nextInt());
        Scanner scanner = new Scanner(System.in);
        List<HashSet<Character>> list = new ArrayList<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[] last = new char[n];
        int[] result = new int[n];

        for(int i = 0; i < n; i ++){
            String string = scanner.next();
            HashSet<Character> hashSet = new HashSet<>();
            for(char c: string.toCharArray()){
                hashSet.add(c);
            }
            last[i] = string.charAt(string.length() - 1); 
            list.add(hashSet);
        }

        for(int i = 0; i < m; i++){
            String string = scanner.next();
            HashSet<Character> hashSet = new HashSet<>();
            for(char c: string.toCharArray()){
                hashSet.add(c);
            }
            for(int j = 0; j < n; j++){
                boolean flag = true;
                if(!have(list.get(j))){
                    flag = false;
                }
                for (Character character : hashSet) {
                    if(!list.get(j).contains(character)){
                        flag = false;
                        break;
                    }
                }
                if(!hashSet.contains(last[j])){
                    flag = false;
                }
                if(flag){
                    result[j]++;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(result[i]);
            System.out.print(" ");
        }
    }

    public static boolean have(HashSet<Character> hashSet){
        if(!hashSet.contains('A')) return false;
        if(!hashSet.contains('B')) return false;
        if(!hashSet.contains('C')) return false;
        if(!hashSet.contains('D')) return false;
        if(!hashSet.contains('E')) return false;
        if(!hashSet.contains('F')) return false;
        return true;
    }
}


