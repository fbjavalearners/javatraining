package genericexamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.demo.accessmodifiers.Student;
import com.demo.inheritance.JewelleryShop;
import com.demo.inheritance.Shop;

public class GenericExample {

	
	
	public static void main(String[] args) {
		
		List<String> nsList= new ArrayList<String>();
		nsList.add("Anil");
		nsList.add("Test");
		
		for(String name:nsList){
			System.out.println(name);
		}
		
		List<Object> sList = new ArrayList<Object>();
		
		sList.add("Anil");
		sList.add(new Student(1,"Anil"));
		
		
		List<Shop> shopList = new ArrayList<Shop>();
		
		
		
		List<JewelleryShop> js=new ArrayList<JewelleryShop>();
		
		js.add(new JewelleryShop());
		js.add(new JewelleryShop());
		takeShop(js);
				
		
		List<String> ls = new ArrayList<String>();
		List<Object> ls1 = new ArrayList<Object>();
		HashMap<String,Integer> hs = new HashMap<String,Integer>();
		
		List<Shop> s = new ArrayList<Shop>();
		s.add(new JewelleryShop());
		
		List<JewelleryShop> jsss = new ArrayList<JewelleryShop>();
		jsss.add(new JewelleryShop());
		jsss.add(new JewelleryShop());
		jsss.add(new JewelleryShop());
		
		takeShop(jsss);
		
		
		
	}
	
	
	
	public static void takeShop(List<? extends Shop> shopList){
		
		
		
		
		
	}
	
	
	
	
}
