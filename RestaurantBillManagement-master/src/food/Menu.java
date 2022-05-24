package food;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Menu {
public void menu(LinkedHashMap<String,Integer> tsa,LinkedHashMap<String,Integer> tsm,
		LinkedHashMap<String,Integer> kb,LinkedHashMap<String,Integer> ib,
		LinkedHashMap<String,Integer> mcv,LinkedHashMap<String,Integer> mcnv,
		LinkedHashMap<String,Integer> pbr,LinkedHashMap<String,Integer> ds,
		LinkedHashMap<String,Integer> bv) {
	System.out.println("         =====MENU=====");
	System.out.println("TELANGANA SPECIAL APPETIZERS:-");
	for(Entry<String, Integer> m:tsa.entrySet()){  
		   System.out.println(m.getKey()+"->"+m.getValue());  
		  } 
	System.out.println("TELANGANA SPECIAL MAIN COURSE:-");
	for(Entry<String, Integer> m:tsm.entrySet()){  
		   System.out.println(m.getKey()+"->"+m.getValue());  
		  } 
	System.out.println("KEBABS:-");
	for(Entry<String, Integer> m:kb.entrySet()){  
		   System.out.println(m.getKey()+"->"+m.getValue());  
		  } 
	System.out.println("INDIAN BREADS:-");
	for(Entry<String, Integer> m:ib.entrySet()){  
		   System.out.println(m.getKey()+"->"+m.getValue());  
		  } 
	System.out.println("MAIN COURSE VEG:-");
	for(Entry<String, Integer> m:mcv.entrySet()){  
		   System.out.println(m.getKey()+"->"+m.getValue());  
		  } 
	System.out.println("MAIN COURSE NON VEG:-");
	for(Entry<String, Integer> m:mcnv.entrySet()){  
		   System.out.println(m.getKey()+"->"+m.getValue());  
		  } 
	System.out.println("PULAO,BIRYANI AND RICE:-");
	for(Entry<String, Integer> m:pbr.entrySet()){  
		   System.out.println(m.getKey()+"->"+m.getValue());  
		  } 
	System.out.println("DESERTS:-");
	for(Entry<String, Integer> m:ds.entrySet()){  
		   System.out.println(m.getKey()+"->"+m.getValue());  
		  } 
	System.out.println("BEVARAGES:-");
	for(Entry<String, Integer> m:bv.entrySet()){  
		   System.out.println(m.getKey()+"->"+m.getValue());  
		  } 
	Orders o=new Orders();
	o.ord(tsa,tsm,kb,ib,mcv,mcnv,pbr,ds,bv);
}
}
