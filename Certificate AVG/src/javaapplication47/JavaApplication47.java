package javaapplication47;
import java.util.Scanner;
public class JavaApplication47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [][]std = new double[11][6];
        double avgRow, avgCol;
        int r = 0, c = 0;
        for (int i = 0; i < std.length-1; i++) {
            double sumRow = 0;
            for (int j = 0; j < std[i].length-1; j++) {
                    System.out.print("Enter mark " + j + " for student " + i + ": " );
                    std[i][j] = in.nextInt(); 
                    sumRow += std[i][j];
            }
            avgRow = sumRow/5;
            std[r][5] = avgRow;
            r++;
        }
        for (int i = 0; i < std[i].length-1; i++) {
            double sumCol = 0;
            for (int j = 0; j < std.length-1; j++) {
                sumCol += std[j][i];
            }
            avgCol = sumCol/10;
            std[10][c] = avgCol;
            c++;
        }
        for (int i = 0; i < std.length; i++) {
            for (int j = 0; j < std[i].length; j++) {
                    System.out.print(std[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
