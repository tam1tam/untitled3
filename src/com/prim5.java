package com;

import java.util.Arrays;





public class prim5 {

    public static void main(String[] args) {
        System.out.println("HI");
       int[][] dz = {
               {45,8,69,25,1,14,65,77},
               {33,22,35,44,78,56,6,99},
               {98,3,47,82,6,44,58,23},
               {1,3,74,66,34,23,78,98},
               {91,25,73,16,28,4,49,61}
               };
       Gextracted cd = new Gextracted();
        cd.extracted(dz);
        System.out.println();
       Arrays.sort(dz[0]);
       Arrays.sort(dz[1]);
       Arrays.sort(dz[2]);
       Arrays.sort(dz[3]);
       Arrays.sort(dz[4]);
        cd.extracted(dz);
        System.out.println();
        int[][] min_max=new int[5][2];
        System.arraycopy(dz[0],0,min_max[0],0,1);
        System.arraycopy(dz[1],0,min_max[1],0,1);
        System.arraycopy(dz[2],0,min_max[2],0,1);
        System.arraycopy(dz[3],0,min_max[3],0,1);
        System.arraycopy(dz[4],0,min_max[4],0,1);
        System.arraycopy(dz[0],7,min_max[0],1,1);
        System.arraycopy(dz[1],7,min_max[1],1,1);
        System.arraycopy(dz[2],7,min_max[2],1,1);
        System.arraycopy(dz[3],7,min_max[3],1,1);
        System.arraycopy(dz[4],7,min_max[4],1,1);
        cd.extracted(min_max);
    }
/*
    private static void extracted(int[][] dz) {
        for (int[]x: dz) {
            for (int y:x ) {
                System.out.print(y+ " ");
            }
            System.out.println();
        }*/
    }

