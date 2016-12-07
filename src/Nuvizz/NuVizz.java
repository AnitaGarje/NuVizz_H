/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juvizz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Annu
 */

public class JuVizz {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int days,cnt=0,set=1;
        SortedSet numofc = new TreeSet(); 
    //System.out.println("Enter the number of days:");  
    Scanner userip=new Scanner(System.in);
    days=Integer.parseInt(userip.next());
    String[] InputSCE=new String[days];
    for(int i=0;i<days;i++)
    {
     InputSCE[i]=userip.next();
    }
    DoItFor2:{
    for(int i=0;i<days;i++)
    {
       
        char Eachday[]=InputSCE[i].toCharArray();
        for(int j=0;j<InputSCE[i].length();j++)
        {
            System.out.println(InputSCE[i].length());
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
        if(set==1)
        {
          cnt=0;
        }
      
    }
     System.out.println( numofc.last().toString());
    set=2;
    numofc.clear();
    //continue DoItFor2;
    }
   
    }
    
}
