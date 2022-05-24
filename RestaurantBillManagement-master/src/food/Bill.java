package food;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.*;
public class Bill {
public void calculate(LinkedHashMap<String,Integer> tsa,LinkedHashMap<String,Integer> tsm,
		LinkedHashMap<String,Integer> kb,LinkedHashMap<String,Integer> ib,
		LinkedHashMap<String,Integer> mcv,LinkedHashMap<String,Integer> mcnv,
		LinkedHashMap<String,Integer> pbr,LinkedHashMap<String,Integer> ds,
		LinkedHashMap<String,Integer> bv,LinkedHashMap<String,Integer> ord1) {
	LinkedHashMap<String,Integer> c1 =new LinkedHashMap<String,Integer>();
	int cost=0,p=0;
	for(Entry<String, Integer> m:ord1.entrySet()){
		p=0;
		 for(Entry<String, Integer> m1:tsa.entrySet()){  
			 if(m.getKey().equals(m1.getKey().toLowerCase())) {
				 int price=m1.getValue();
				 int q11=m.getValue();
			cost=cost+price*q11;
			c1.put(m.getKey(),price*q11);
			p=1;
			break;
			 }	  
		 }
		 if(p!=1) {
		 for(Entry<String, Integer> m1:tsm.entrySet()){  
			 if(m.getKey().equals(m1.getKey().toLowerCase())) {
				 int price=m1.getValue();
				 int q11=m.getValue();
			cost=cost+price*q11;
			c1.put(m.getKey(),price*q11);
			p=1;
			break;
			 }	  
		 }
		 }
		 if(p!=1) {
			 for(Entry<String, Integer> m1:kb.entrySet()){  
				 if(m.getKey().equals(m1.getKey().toLowerCase())) {
					 int price=m1.getValue();
					 int q11=m.getValue();
				cost=cost+price*q11;
				c1.put(m.getKey(),price*q11);
				p=1;
				break;
				 }	  
			 }
			 }
		 if(p!=1) {
			 for(Entry<String, Integer> m1:ib.entrySet()){  
				 if(m.getKey().equals(m1.getKey().toLowerCase())) {
					 int price=m1.getValue();
					 int q11=m.getValue();
				cost=cost+price*q11;
				c1.put(m.getKey(),price*q11);
				p=1;
				break;
				 }	  
			 }
			 }
		 if(p!=1) {
			 for(Entry<String, Integer> m1:mcv.entrySet()){  
				 if(m.getKey().equals(m1.getKey().toLowerCase())) {
					 int price=m1.getValue();
					 int q11=m.getValue();
				cost=cost+price*q11;
				c1.put(m.getKey(),price*q11);
				p=1;
				break;
				 }	  
			 }
			 }
		 if(p!=1) {
			 for(Entry<String, Integer> m1:mcnv.entrySet()){  
				 if(m.getKey().equals(m1.getKey().toLowerCase())) {
					 int price=m1.getValue();
					 int q11=m.getValue();
				cost=cost+price*q11;
				c1.put(m.getKey(),price*q11);
				p=1;
				break;
				 }	  
			 }
			 }
		 if(p!=1) {
			 for(Entry<String, Integer> m1:pbr.entrySet()){  
				 if(m.getKey().equals(m1.getKey().toLowerCase())) {
					 int price=m1.getValue();
					 int q11=m.getValue();
				cost=cost+price*q11;
				c1.put(m.getKey(),price*q11);
				p=1;
				break;
				 }	  
			 }
			 }
		 if(p!=1) {
			 for(Entry<String, Integer> m1:ds.entrySet()){  
				 if(m.getKey().equals(m1.getKey().toLowerCase())) {
					 int price=m1.getValue();
					 int q11=m.getValue();
				cost=cost+price*q11;
				c1.put(m.getKey(),price*q11);
				p=1;
				break;
				 }	  
			 }
			 }
		 if(p!=1) {
			 for(Entry<String, Integer> m1:bv.entrySet()){  
				 if(m.getKey().equals(m1.getKey().toLowerCase())) {
					 int price=m1.getValue();
					 int q11=m.getValue();
				cost=cost+price*q11;
				c1.put(m.getKey(),price*q11);
				p=1;
				break;
				 }	  
			 }
			 }
		 if(p!=1) {
			 System.out.println(m.getKey()+" not present");
			 		 }
		  }
System.out.println("====BILL====");
for(Entry<String, Integer> m2:c1.entrySet()){  
	   System.out.println(m2.getKey()+"->"+m2.getValue());  
	  } 
double gst=cost*(5d/100);
System.out.println("GST:-"+gst);
System.out.println("Total Bill:-"+(cost+gst));

}
}
