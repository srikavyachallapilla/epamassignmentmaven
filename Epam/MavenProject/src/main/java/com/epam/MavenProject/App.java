package com.epam.MavenProject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Chocolates c1 = new Chocolates(20,5,"DairyMilk");
        Chocolates c2 = new Chocolates(15, 15,"Munchnuts");
        Chocolates c3 = new Chocolates(10,10, "MunchCrunch");
        Chocolates c4 = new Chocolates(5,25, "5star");
        Sweets s1 = new Sweets(50, 80);
        Sweets s2 = new Sweets(70, 100);
        Sweets s3 = new Sweets(40, 50);
        Sweets s4 = new Sweets(30, 40);
        Gifts g = new Gifts();
        System.out.println("Total Weight:"+g.getWeight());
        System.out.println("Sorting chocolates based on price: ");
        Chocolates c = new Chocolates();
        c.sortChocolates();
        c.getChocolatesInRange(3, 15); 
    }
}
