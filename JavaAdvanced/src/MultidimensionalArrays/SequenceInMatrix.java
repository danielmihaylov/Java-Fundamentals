package MultidimensionalArrays;

import java.util.*;

public class SequenceInMatrix {

    private static int SEQUENCE_COUNT = 0;
    private static String SEQUENCE_SYMBOL = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimm = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimm[0]);
        int cols = Integer.parseInt(dimm[1]);
        String[][] matrix = new String[rows][];
        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }
        List<String> sequence = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            sequence.addAll(Arrays.asList(matrix[i]));
            checkForSequence(sequence);
        }
        for (int col = 0; col < cols ; col++) {
            for (int row = 0; row < rows; row++) {
                sequence.add(matrix[row][col]);
            }
            checkForSequence(sequence);
        }

        int diagSize = Math.min(rows,cols);
        for (int i = 0; i < diagSize; i++) {
            sequence.add(matrix[i][i]);
        }
        checkForSequence(sequence );
        for (int i = 0; i < SEQUENCE_COUNT; i++) {
            System.out.printf("%s, ",SEQUENCE_SYMBOL);
        }
    }

    private static void checkForSequence(List<String> sequence) {
        for (int startPos = 0; startPos <sequence.size()-1 ; startPos++) {
            int counter = 1;
            String symbol = sequence.get(startPos);
            int currentPosition = startPos+1;
            while (symbol.equals(sequence.get(currentPosition))){
                counter++;
                if (counter>=SEQUENCE_COUNT){
                    SEQUENCE_COUNT = counter;
                    SEQUENCE_SYMBOL = symbol;
                }
                currentPosition++;
                if (currentPosition>=sequence.size()){
                    break;
                }
            }
        }
        sequence.clear();
    }
}