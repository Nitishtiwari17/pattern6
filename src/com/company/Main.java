package com.company;

public class Main {

    public static void main(String[] args) {
        int a=65;
        for(int i=0;i<6;i++)
        {
            for(int l=5;l>i;l--);
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print((char)(a+j)+" ");
            }
            System.out.println(" ");
        }
    }
}
