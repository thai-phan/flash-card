package dict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        System.out.println("aasdasd");
        int[] num = new int[]{1,2,3,5};
        int aa = MissingNumber(num, 5);
//        SpringApplication.run(Main.class, args);
    }


    static int MissingNumber(int array[], int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count = count + i;
        }
        for (int i = 0; i < array.length; i++) {
            count = count - array[i];
        }
        return count;
    }

}
