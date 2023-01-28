package com.example.demo.playground;

import org.junit.jupiter.api.Test;

class SpiralArray {

    @Test
    void test() {
        int[][] res = {{1,2,3},{4,5,6},{7,8,9}};

        int n = res.length;
        int m = res[0].length;
        int rowstart = 0;
        int colstart = 0;
        int i=0,j=0;

        while(rowstart <n && colstart<m)
        {
            i=rowstart;
            j=colstart;
            while(i>=0 && i<n && j>=0 && j<m)
            {
                System.out.println(res[i][j]);
                i--;
                j++;
            }

            if(rowstart == n-1)
                colstart += 1;
            else
                rowstart +=1;
        }

    }
}
