package session3practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapCreate {

	public static void main(String[] args) {
		//create and fill map
		Map<String,List<product>> mapproduct=new HashMap<>();		
		product pro1=new product("laptop",100);
		product pro2=new product("phone",200);
		product pro3=new product("book",600);
		product pro4=new product("Tablet",800);
		
		mapproduct.putIfAbsent("p001", new ArrayList<>());  // Ensure there's a list for key "p001"
        mapproduct.get("p001").add(pro1);  // Add pro1 (laptop)
        mapproduct.get("p001").add(pro3);  // Add pro3 (book)
        mapproduct.put("p002", new ArrayList<>());
        mapproduct.get("p002").add(pro2);  // Add pro2 (phone)
        mapproduct.put("p003", new ArrayList<>());
        mapproduct.get("p003").add(pro4);  // Add pro4 (Tablet)
       
        ///showing map
        
		System.out.println("code product in map:"+"\t"+"product info:");
		for (Map.Entry<String, List<product>> entry : mapproduct.entrySet()) {
			String key = entry.getKey();
			List<product> val = entry.getValue();
			System.out.println(key +"\t\t\t"+val);
		}
		//searching on map by key---------------------------
		String productId="p001";
		List<product> target=mapproduct.get(productId);
		if(target!=null) {
			System.out.println("we have this code p001"+ target);
		}else{
			System.out.println("we don't have this code p001");
		}
		//removing
		mapproduct.remove("p002");
		
		//contains
		//System.out.println(mapproduct.containsValue(pro4.getName()));
		//searching that our map contains laptop or not ------------------------------------------
		
		// searching on map by value--------------------------------------------------
		String productToCheck = "laptop";
        boolean found = false;
        for (Map.Entry<String, List<product>> entry : mapproduct.entrySet()) {
            List<product> products = entry.getValue();
            for (product p : products) {
                if (p.getName().equals(productToCheck)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;  // Exit loop early if product is found
            }
        }

        // Print result of search
        if (found) {
            System.out.println("The product '" + productToCheck + "' is found in the map.");
        } else {
            System.out.println("The product '" + productToCheck + "' is not found in the map.");
        }
      
	}

}
