/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;


public class M8 
{
     public static  void main(String args[])
     {
         ArrayList list=new ArrayList();
         list.add(1000);
         list.add(1000.00);
         list.add("abc");
         list.add('A');
         list.add(true);
         list.add(2,"xyz");//we are adding element in the middle or index 2
         System.out.println(list); 
         //manupulation in very simple
         System.out.println(list.isEmpty());
         list.set(3, "hello");//here we are replacing  hello to abc
         System.out.println(list); 
         System.out.println(list.isEmpty());//aftar clear the list is return true
        
    
     }
    
}
/*
[1000, 1000.0, xyz, abc, A, true]
false
[1000, 1000.0, xyz, hello, A, true]
false
*/