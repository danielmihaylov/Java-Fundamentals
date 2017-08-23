package ManualStraingProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterMultiplier {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String first = input[0];
        String second = input[1];
        long sum = CalculateSum(first,second);
        System.out.println(sum);
    }

    private static long CalculateSum(String first, String second) {
        char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();
        long sum = 0;
        int minLength = Math.min(firstArr.length,secondArr.length);
        int maxLength = Math.max(firstArr.length,secondArr.length);
        for (int i = 0; i < minLength; i++) {
            sum+= firstArr[i]*secondArr[i];
        }
        if (maxLength == firstArr.length){
            for (int i = minLength; i < maxLength; i++) {
                sum+=firstArr[i];
            }
        }else {
            for (int i = minLength; i < maxLength; i++) {
                sum+= secondArr[i];
            }
        }
        return sum;
    }
}
