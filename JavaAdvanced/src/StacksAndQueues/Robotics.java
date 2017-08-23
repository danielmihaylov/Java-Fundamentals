package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] robotsTokens = scanner.nextLine().split(";");
        String[] robots = new String[robotsTokens.length];
        int[] processTime = new int[robotsTokens.length];
        int [] robotsCounter = new int[robotsTokens.length];

        for (int i = 0; i < robotsTokens.length; i++) {
            String[] robotsToken = robotsTokens[i].split("-");
            robots[i] = robotsToken[0];
            processTime[i] = Integer.parseInt(robotsToken[1]);
        }
        String[] time = scanner.nextLine().split(":");
        long h = Integer.parseInt(time[0]) *60 *60;
        long m = Integer.parseInt(time[1])* 60;
        long s = Integer.parseInt(time[2]);
        long seconds = h + m + s;

        Deque<String> products = new ArrayDeque<>();
        String product = "";
        while (!"End".equals(product = scanner.nextLine())){
            products.add(product);
        }
        while (!products.isEmpty()){
            seconds++;
            for (int i = 0; i < robots.length; i++) {
                if (robotsCounter[i] > 0){
                    robotsCounter[i]--;
                }
            }
            String currentProduct = products.poll();
            boolean isProductTaken = false;
            for (int i = 0; i < robots.length; i++) {
                if (robotsCounter[i] ==0){
                    robotsCounter[i] = processTime[i];
                    isProductTaken = true;
                    System.out.printf("%s - %s [%s]%n",robots[i],currentProduct,convertTime(seconds));
                    break;
                }
            }
            if (!isProductTaken){
                products.add(currentProduct);
            }
        }
    }
    public static String convertTime(long seconds){
        long s = seconds%60;
        long m = (seconds /60) % 60;
        long h = (seconds / (60*60)) % 24;
        return String.format("%02d:%02d:%02d",h,m,s);
    }
}