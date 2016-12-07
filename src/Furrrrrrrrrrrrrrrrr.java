/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Annu
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Furrrrrrrrrrrrrrrrr 
{
public boolean isPrime(int n) 
{
	int m=0;
        boolean f=true;
        m=n/2;
        for(int k=2;k<=m;k++)
        { 
           if(n%k==0)
           f= false; 
        }
        return f;
}

    /**
     *
     * @param args
     */
public static void main(String args[])
{

   FinalPrime p=new FinalPrime();
   
    Scanner userip=new Scanner(System.in);
    int T,cnt=0,pp=0;
    ArrayList<Integer> L=new ArrayList<>();
    ArrayList<Integer> R=new ArrayList<>();
     T=Integer.parseInt(userip.next());
    for(int i=0;i<T;i++)
    {
          L.add(i, Integer.parseInt(userip.next()));
          R.add(i, Integer.parseInt(userip.next()));
    }
    for(int t=0;t<T;t++)
    {
        pp=0;
        for(int i=L.get(t);i<=R.get(t);i++)
        {
            for(int j=2;j<=i;j++)
            {
             if(p.isPrime(j)==true)
             cnt++;
            }
            if(p.isPrime(cnt)==true)
            pp++; 
            cnt=0;
            
        }
        System.out.println(pp);
     }
}
}


