/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.Array;
import java.util.*;


public class Software {

    /**
     * @param args the command line arguments
     */
		public static void ShiftArray(String array)
		{
			List<Integer> num = new ArrayList<Integer>();
			List<String> Char = new ArrayList<String>();
			if (array.contains(","))
			{
				String h="";
				int x=0;
				for(int i=0 ; i<array.length() ; i++)
				{
					if (array.charAt(i)==',')
					{
						x=Integer.parseInt(h);
						num.add(x);
						h="";
					}
					else {
						h+=array.charAt(i);
					}
					if (i==array.length()-1)
					{
						x=Integer.parseInt(h);
						num.add(x);
						h="";
					}
				}
				int Arr[] = new int[num.size()];
				for (int i=0 ; i<Arr.length ; i++)
				{
					Arr[i] = num.get(i);
				}
				
				int temp = Arr[0];
				for(int i=1 ; i<Arr.length ; i++)
				{
					Arr[i-1] = Arr[i];
				}
				Arr[Arr.length-1] = temp;
				for (int i=0 ; i<Arr.length; i++)
				{
					if (i==Arr.length-1)
					{
						System.out.print(Arr[i]);
					}
					else
						System.out.print(Arr[i]+",");
				}
			}
			else
			{
				String h="";
				for (int i=0 ; i<array.length() ; i++)
				{
					h+=array.charAt(i);
					Char.add(h);
					h="";
				}
				String Arr[] = new String[Char.size()];
				for (int i=0 ; i<Arr.length ; i++)
				{
					Arr[i] = Char.get(i);
				}
				
				String temp = Arr[0];
				for(int i=1 ; i<Arr.length ; i++)
				{
					Arr[i-1] = Arr[i];
				}
				Arr[Arr.length-1] = temp;
				for (int i=0 ; i<Arr.length; i++)
				{
						System.out.print(Arr[i]);
				}
			}
		}  
	
    public static void main(String[] args) {
        // TODO code application  logic here
      
    }
    
}
