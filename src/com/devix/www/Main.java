package com.devix.www;

public class Main {

    public static void main(String[] args) {

        Sample sample = new Sample();
        int x = sample.add(4,7);
        System.out.println(x);

    }


    private static class Sample {
        public int add(int y, int z) {
            int a = y;
            int b = z;
            int c = a + b;
            return c;
        }
    }
}
