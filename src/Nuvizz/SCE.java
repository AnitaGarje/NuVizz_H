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

public class SCE {

    
    /**
     * @param args the command line arguments
     */
    public static void getInput()
    {
        int days;
        //ArrayList numofc=new ArrayList();
        
        //System.out.println("Enter the number of days:");  
        Scanner userip=new Scanner(System.in);
        days=Integer.parseInt(userip.next());
        String[] InputSCE=new String[days];
        for(int i=0;i<days;i++)
        {
        InputSCE[i]=userip.next();
        }
        getCount(days, InputSCE);
    }
    public static void getCount(int days,String[] InputSCE )
    {
        int cnt=0,set=0;
        SortedSet numofc = new TreeSet(); 
        Again:{
       
    for(int i=0;i<days;i++)
    {
       
        char Eachday[]=InputSCE[i].toCharArray();
        for(int j=0;j<InputSCE[i].length();j++)
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
        if(set==0)
        {
          cnt=0;
          set=1;
          break Again;
        }
    } 
    }
    System.out.println( numofc.last().toString()); 
    System.out.println( numofc.last().toString()); 
   
    
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
     getInput();
   
        
    
    }
    
}
