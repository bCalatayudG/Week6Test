package com.example.user.week6_test.spiralarray;

public class SpiralArray {

    public void getSpiral(Integer[][] array) {
        int column = array[0].length;
        int rows = 0;
        for (Integer[] a : array) {
            rows++;
        }
        int temp1 = 0;
        int temp2 = 0;

        //First row array[0][0..n]
        //Last column array[1..n][n]
        //Last row array[n-1][0]

        while (temp1 < column && temp2 < rows) {

            for (int i = temp2; i < column; i++)
                System.out.print(array[temp1][i] + " ");
            temp1++;

            for (int i = temp1; i < column; i++) {
                System.out.print(array[i][rows - 1] + " ");
            }
            rows--;

            if (temp1 < column) {
                for (int i = rows - 1; i >= temp2; --i) {
                    System.out.print(array[column - 1][i] + " ");
                }
                column--;
            }

            if (temp2 < rows) {
                for (int i = column - 1; i >= temp1; --i) {
                    System.out.print(array[i][temp2] + " ");
                }
                temp2++;
            }
        }
    }
}


//1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10