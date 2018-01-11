/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lara;

import java.util.ArrayList;

/**
 *
 * 
 */
public class M5 
{
     public static  void main(String args[])
     {
         ArrayList list=new ArrayList();
         list.add(1000);
         list.add(1000.00);
         list.add("abc");
         list.add('A');
         list.add(true);
         list.add(2,"xyz");//we are adding element in the middle
         System.out.println(list);  //manupulation in very simple
         Object obj1=list.remove("abc");
         Object obj2=list.remove("xyz");//if specify element is avelbele return true other wise false
         System.out.println(obj1);
         System.out.println(obj2);
         System.out.println(list); 
    
}
}
