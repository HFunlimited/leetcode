import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        while(n != 1){
            hashSet.add(n);
            int m = n;
            n = 0;
            while(m != 0){
                n = n + (m % 10) * (m % 10);
                m = m / 10;
            }
            if(hashSet.contains(n)){
                return false;
            }
        }
        return true;
    }
}


