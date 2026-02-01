import java.io.*;
import java.util.*;
class task5 {
    public int countPrimesInRange(int input1, int input2) {
        int d = input1;
        int cou = 0;

        while (d <= input2) {
            int c = 0;

            if (d < 2) {   // Numbers less than 2 are not prime
                d++;
                continue;
            }
            for (int i = 2; i < d; i++) {
                if (d % i == 0) {
                    c++;
                    break;
                }
            }
            if (c == 0) {
                cou++;
                System.out.println(d);
            }
            d++;
        }
        return cou;
    }
}

