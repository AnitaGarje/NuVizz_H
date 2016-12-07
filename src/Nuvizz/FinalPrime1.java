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


public class FinalPrime1 
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
        pp=0;cnt=0;
        int k=0,j;
        for(int i=L.get(t);i<=R.get(t);i++)
        {
            if(k==i)
            {
                if(p.isPrime(i)==true)
                {
                cnt++;
                    //System.out.println("cnt in k condn"+cnt);
                }
                k=i+1;
                //System.out.println("value of k=i+1 pcondn"+k);
            }
            else
            {
            for(j=2;j<=i;j++)
            {
             if(p.isPrime(j)==true)
             cnt++;
             // System.out.println("cnt in j loop condn"+cnt);
            }
            k=j;
            //System.out.println("value of k=j pcondn"+k);
            }
            if(p.isPrime(cnt)==true)
            {
            pp++; 
            //System.out.println("cnt in of pcondn"+pp);
            }
            //cnt=0;
            
        }
        System.out.println(pp);
     }
}
}


