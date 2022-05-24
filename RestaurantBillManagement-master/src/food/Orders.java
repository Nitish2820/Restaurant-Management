package food;
import java.util.*;
import java.util.Map.Entry;
public class Orders {
public void ord(LinkedHashMap<String,Integer> tsa,LinkedHashMap<String,Integer> tsm,
		LinkedHashMap<String,Integer> kb,LinkedHashMap<String,Integer> ib,
		LinkedHashMap<String,Integer> mcv,LinkedHashMap<String,Integer> mcnv,
		LinkedHashMap<String,Integer> pbr,LinkedHashMap<String,Integer> ds,
		LinkedHashMap<String,Integer> bv) {
Scanner s=new Scanner(System.in);
try(s;){
	System.out.println("Enter no.of items:");
	int n=Integer.parseInt(s.nextLine());
	LinkedHashMap<String,Integer> ord1 =new LinkedHashMap<String,Integer>();
	while(n>0) {
		System.out.println("Enter the item:");
		String ord11=s.nextLine().toLowerCase();
		System.out.println("Enter the quantity:");
		int q=Integer.parseInt(s.nextLine());
		ord1.put(ord11,q);
		n=n-1;
	}
	System.out.println("Ordered Items are:-");
	for(Entry<String, Integer> m:ord1.entrySet()){  
		 System.out.println(m.getKey()+"->"+m.getValue());  
		  }
	Bill b=new Bill();
	b.calculate(tsa,tsm,kb,ib,mcv,mcnv,pbr,ds,bv,ord1);
}
}
}
