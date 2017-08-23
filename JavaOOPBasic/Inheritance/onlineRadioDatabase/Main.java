package JavaOOPBasic.Inheritance.onlineRadioDatabase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < n; i++) {
                String[] tokens = scanner.nextLine().split(";|:");
                String artist = tokens[0];
                String song = tokens[1];
                int songMinutes = Integer.parseInt(tokens[2]);
                int songSeconds = Integer.parseInt(tokens[3]);

                Song song1 = new Song(artist,song,songMinutes,songSeconds);
                System.out.println(song1.toString());

            }
        }catch (IllegalArgumentException error){
            System.out.println(error.getMessage());
        }

    }
}

