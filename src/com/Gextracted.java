package com;



public class Gextracted {
    public static void extracted(int[][] xz) {
        for (int[] x : xz) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println(45);
    }
}