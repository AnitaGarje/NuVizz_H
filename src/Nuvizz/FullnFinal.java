/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juvizz;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Annu
 */

public class FullnFinal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int days,cnt=0,cnt1=0;
        SortedSet numofc = new TreeSet(); 
        SortedSet numofc1 = new TreeSet();
        ArrayList<String> InputSCE=new ArrayList<>();
    //System.out.println("Enter the number of days:");  
    Scanner userip=new Scanner(System.in);
    days=Integer.parseInt(userip.next());
 //   if(days>=1 && days<=365)
   // {
        for(int i=0;i<days;i++)
        {
         InputSCE.add(i, userip.next());
        }
        for(int i=0;i<days;i++)
        {
            char Eachday[]=InputSCE.get(i).toCharArray();
            for(int j=0;j<InputSCE.get(i).length();j++)
            {
               if(Eachday[j]=='C')
               {
                  cnt++;
                  cnt1++;
               }
               else
               {
                   numofc.add(cnt);
                   cnt=0; 
                   numofc1.add(cnt1);
                   cnt1=0; 
               }
               if(j+1==InputSCE.get(i).length())
               {
                   numofc.add(cnt); 
                    cnt=0;
               }

            }
           
        }
    System.out.print( numofc.last().toString()+" ");
    System.out.print( numofc1.last().toString()+" ");
   
    } 
}
