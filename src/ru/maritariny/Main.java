package ru.maritariny;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        //ример
        //5
        //1 2 3 3 3
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] a = new int[n];
        String[] parts = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(parts[i]);
        }
        Arrays.sort(a);

        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            int val = 0;
            if (map.containsKey(a[i])) {
                val = map.get(a[i]);
            }
            map.put(a[i], ++val);
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result++;
            }
        }

        System.out.println(result);
    }
}
