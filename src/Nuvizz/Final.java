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

public class Final {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int days,cnt=0;
        SortedSet numofc = new TreeSet(); 
         ArrayList<String> InputSCE=new ArrayList<>();
    //System.out.println("Enter the number of days:");  
    Scanner userip=new Scanner(System.in);
    days=Integer.parseInt(userip.next());
    if(days>=1 && days<=365)
    {
   // String[] InputSCE=new String[days];
    for(int i=0;i<days;i++)
    {
     InputSCE.add(i, userip.next());
     System.out.println(InputSCE.get(i).length());
     System.out.println(InputSCE.get(i));
     if(InputSCE.get(i).length()>1440)
     {
         System.out.println("Please enter the string of length 1-1440");
         InputSCE.remove(i);
         i--;
        // break;
     }
    }
   
    for(int i=0;i<days;i++)
    {
       
        char Eachday[]=InputSCE.get(i).toCharArray();
        for(int j=0;j<InputSCE.get(i).length();j++)
        {
           if(Eachday[j]=='C')
           {
              cnt++;     
              
              System.out.println(Eachday[j]);
              System.out.println(cnt);
              System.out.println(numofc);
             // break;
           }
           else
           {
               numofc.add(cnt);
              
                cnt=0;  
                 System.out.println(Eachday[j]);
              System.out.println(cnt);
               System.out.println(numofc);
           }
           if(j+1==InputSCE.get(i).length())
           {
               numofc.add(cnt); 
           }
          
        }
          cnt=0;
           System.out.println(numofc);
    }
    System.out.println(numofc);
     System.out.print( numofc.last().toString()+" ");
    for(int i=0;i<days;i++)
    {
       
        char Eachday[]=InputSCE.get(i).toCharArray();
        for(int j=0;j<InputSCE.get(i).length();j++)
        {
           if(Eachday[j]=='C')
           {
              cnt++;            
           }
           else
           {
               numofc.add(cnt);
                cnt=0;  
           }
          
        }
          
    }
    
     System.out.println(numofc.last().toString());
    
   
   
    
   
    }
     else
    {
        System.out.println("Enter the days between 1-365");
    }
    }
   
    
}
