/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasequals;

/**
 *
 * @author Faedal
 */
public class Faedal {
    public static void main(String[] args) {
        System.out.println("Perbedaan antara pemakaian == dengan equals");
        System.out.println("-------------------------------------------------------------");
        String st1 = "fadel suka membantu semua teman";
        String st2 = "fadel suka membantu semua teman";
        String st3 = "fadel suka";
        String st4 = " membantu";
        String st5 = " semua teman";
        String st6 = st3 + st4 + st5 ;
        System.out.println("Pernyataan 1 adalah : " + st1);
        System.out.println("Pernyataan 2 adalah : " + st2);
        System.out.println("Pernyataan 3 adalah : " + st3);
        System.out.println("Pernyataan 4 adalah : " + st4);
        System.out.println("Pernyataan 5 adalah : " + st5);
        System.out.println("Pernyataan 6 adalah : " + st6);
        System.out.println("");
        System.out.println("Pernyataan 1 Equals Pernyataan 2 : " + (st1.equals(st1)));
        System.out.println("Pernyataan 6 Equals Pernyataan 1 : " + (st6.equals(st1)));
        System.out.println("Pernyataan 6 Equals Pernyataan 2 : " + (st6.equals(st2)));
        System.out.println("Pernyataan 1 == Pernyataan 2     : " + (st1==st2));
        System.out.println("Pernyataan 6 == Pernyataa 1      : " + (st6==st1));
        System.out.println("Pernyataan 6 == Pernyataan 2     : " + (st6==st2));
    }
}
