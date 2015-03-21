package com;

/**
 * Created by Коля on 19.03.2015.
 */
public class Edge {
    public int lines[][] = new int[32][2];
    Edge(String s){
        if(s == "Tesseract"){
            int j = 0;
            for (int i = 0; i < 16; i++)
            {
                if ((i & 1) == 0) {
                    this.lines[j][0] = i;
                    this.lines[j][1] = i + 1;
                    j++;
                }
                if ((i & 2) == 0) {
                    this.lines[j][0] = i;
                    this.lines[j][1] = i + 2;
                    j++;
                }
                if ((i & 4) == 0) {
                    this.lines[j][0] = i;
                    this.lines[j][1] = i + 4;
                    j++;
                }
                if ((i & 8) == 0) {
                    this.lines[j][0] = i;
                    this.lines[j][1] = i + 8;
                    j++;
                }
            }
        }
        else {
            for (int i = 0; i < 32; i++)
                for (int j = 0; j < 2; j++)
                    lines[i][j] = 0;
        }
    }
}
