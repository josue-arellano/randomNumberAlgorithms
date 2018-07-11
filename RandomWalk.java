/**
 *   Name:      Arellano, Josue
 *   File:      lewisGoodmanMiller.java
 *   Project:   10.3.17
 *   Due:       May 30, 2018
 *   Course:    cs301
 */
package hw10;

public class RandomWalk
{
    public static void main(String[] args)
    {
        System.out.println("n: 1000\n p = " + randomWalkSimulation(1000, 
                                                        (double)1/6, (double)1/4, 
                                                        (double)1/4, (double)1/3));
        System.out.println("equal probability\n p = " + randomWalkSimulation(1000, 
                                                        .25, .25, .25, .25));
    }
    
    public static double randomWalkSimulation(int n, double e, double no, double s, double w)
    {
        double d = 0;
        for(int i = 0; i < n; i++)
        {
            double x = 0;
            double y = 0;
            for(int j = 0; j < 50; j++)
            {
                double r = Math.random();
                if(r < e)
                    x++;
                else if(r >= e && r < e + no)
                    y++;
                else if(r >= e + no && r < e + no + s)
                    y--;
                else
                    x--;
            }
            if(Math.sqrt(x*x + y*y) > 20)
                d++;
        }
        return (double)d/n;
    }
}
