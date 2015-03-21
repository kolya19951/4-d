package com;

/**
 * Created by Коля on 20.03.2015.
 */
public class Matrix {
    double[][] a = new double[4][4];
     Matrix() {
         for (int i = 0; i < 4; i ++) {
             for (int j = 0; j < 4; j++)
                 a[i][j] = 0;
         }
     }

   /* Matrix Product (Matrix m) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Matrix tmp = new Matrix();
            }
        }

    }*/
}
