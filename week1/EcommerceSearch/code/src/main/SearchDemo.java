package main;

import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {
   
	
	public static Product liner_Search(Product[] pro,String str)
	{
		for(Product p:pro)
		{
			if(p.product_name.equalsIgnoreCase(str))
			{
				return p;
			}
		}
		return null;
	}
	public static  Product binary_Search(Product[] pro,String str)
	{
		int low = 0,high = pro.length -1;
		
		while(low<=high)
		{
			int mid = (low + high)/2;
			int cmp = pro[mid].product_name.compareTo(str);
			
			if(cmp == 0) return pro[mid];
			
			else if(cmp < 0) low = mid +1;
			else high = mid -1;
				
		}
		return null;
	}
	
	public static void main(String arg [])
	{
		Product[] products = {
				new Product(101,"product1","categeory1"),
				new Product(102,"product2","categeory2"),
				new Product(103,"product3","categeory3"),
				new Product(104,"product4","categeory4")
		};
		
		System.out.println("Liner Search : "+liner_Search(products,"product4"));
		
		Arrays.sort(products,Comparator.comparing(p->p.product_name.toLowerCase()));
		
		System.out.println("Binary Search :"+binary_Search(products,"product3"));
	}
}
