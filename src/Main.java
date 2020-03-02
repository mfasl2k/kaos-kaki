import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {10,20,20,10,10,30,50,10,20};
        int count = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<int[]> angka = new ArrayList<int[]>();
        for (int i = 0; i < array1.length-1; i++){
            inner:
            for (int j = i+1; j < array1.length; j++){
                if(array1[i] == array1[j] && !numbers.contains(i)
                && !numbers.contains(j)){
                    int[] temp = {array1[i], array1[j]};
                    angka.add(temp);
                    numbers.add(j);
                    count += 1;
                    break inner;
                }
            }
        }
        System.out.println(angka.size()+ "pasang");
        System.out.println(Arrays.deepToString(angka.toArray()));
    }
}

