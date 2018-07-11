/**
 *   Name:      Arellano, Josue
 *   File:      MonteCarlo.java
 *   Project:   hw 10
 *   Due:       May 30, 2018
 *   Course:    cs301
 */
package hw10;
import java.lang.Math;

public class MonteCarlo
{
    public static void main(String[] args)
    {
        for(int i = 10; i < 1000000000; i *= 10)
        {
            double pi = monteCarlo(i);
            System.out.printf("N: %,d\n  pi ~= %.5f\n", i, pi);
        }
    }
    
    public static double monteCarlo(int N)
    {
        int n = 0;
        for(int i = 0; i < N; i++)
        {
            double r = Math.random();
            double x = 2 * r - 1;
            r = Math.random();
            double y = 2 * r - 1;
            double c = Math.sqrt((x*x) + (y*y));
            if(c <= 1) n++;
        }
        return (double) 4 * n / N;
    }
}
