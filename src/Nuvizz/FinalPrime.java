/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juvizz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Annu
 */
public class FinalPrime {

   boolean[] primeStatus=new boolean[1000000]; 
public  void TrueOrFalse() {
    Arrays.fill(primeStatus,true);        
    primeStatus[0]=primeStatus[1]=false;     
    for (int i=2;i<primeStatus.length;i++) {
        if(primeStatus[i]) {
            for (int j=2;i*j<primeStatus.length;j++) {
                primeStatus[i*j]=false;
            }
        }
    }
}
public  boolean isPrime(int n) {
    return primeStatus[n]; 
}
public static void main(String args[])
{
    FinalPrime p=new FinalPrime();
    p.TrueOrFalse();
    Scanner userip=new Scanner(System.in);
    int T,cnt=0,pp=0;
    ArrayList<Integer> L=new ArrayList<>();
     ArrayList<Integer> R=new ArrayList<>();
  //  System.out.println("Please Enter the number of Test case:");
    T=Integer.parseInt(userip.next());
    
   //  System.out.println("Please Enter L and R of each  Test case:");
     for(int i=0;i<T;i++)
        {
          L.add(i, Integer.parseInt(userip.next()));
          R.add(i, Integer.parseInt(userip.next()));
        }
     for(int t=0;t<T;t++)
     {
     pp=0;
     //cnt=0;
     for(int i=L.get(t);i<=R.get(t);i++)
     {
         //System.out.println("This is L:"+i);
         //System.out.println("This is R:"+R.get(t));
         for(int j=2;j<=i;j++)
         {
             if(p.isPrime(j)==true)
             {
                 cnt++;
                // System.out.println(j);
                // System.out.println("This is inside cnt :"+cnt);
             }
             
         }
         //System.out.println("This is outside cnt:"+cnt);
         if(p.isPrime(cnt)==true)
         {
             pp++;
             
         }
         cnt=0;
            // System.out.println("Inside PP cnt:"+pp);

     }
    
    System.out.println(pp);
     }
     

}
    
}
