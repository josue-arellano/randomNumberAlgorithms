/**
 *   Name:      Arellano, Josue
 *   File:      lewisGoodmanMiller.java
 *   Project:   10.1
 *   Due:       May 30, 2018
 *   Course:    cs301
 */
package hw10;

public class lewisGoodmanMiller
{
    public static void main(String[] args)
    {
        long[] li = new long[1000];
        double[] xi = new double[1000];
        random(li, xi);
    }
    
    public static void random(long[] li, double[] xi)
    {
        li[0] = 123456;
        System.out.printf("n: %d\n", li.length);
        for(int i = 1; i < li.length; i++)
        {
            li[i] = (16807 * li[i-1]) % 2147483647;
            xi[i] = (double)li[i] / 2147483647;
            if(i%50==0)
                System.out.printf(" x%d = %f\n", i, xi[i]);
        }
    }
}
