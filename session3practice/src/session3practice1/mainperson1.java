package session3practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class mainperson1 {

	public static void main(String[] args) {
		person1 user1=new person1("mahsa","email1",20);
		person1 user2=new person1("Kimia","email2",25);
		person1 user3=new person1("Atefe","email3",26);
		person1 user5=new person1("Amir","email5",32);
		person1 user6=new person1("Ahmad","email6",37);
		person1 user7=new person1("Amir","email7",35);
		person1 user8=new person1("Ahmad","email12",37);
		
	//by using generic List<Person1>, we determine the type List persons------------------------------------------
	//1) simple method for filling List persons-----------------------------------------------
		List<person1> persons=new ArrayList<>();
		persons.add(user1);
		persons.add(user2);
		persons.add(user3);
		persons.add(user5);
		persons.add(user6);
		persons.add(user7);
		persons.add(user8);
		System.out.println("first version by .dd "+ persons);
		
	// 2) another method for creating List---------------------------------------------
		
		person1[] personsaArayy= {user1, user2,user3};
		List<person1> personsss=Arrays.asList(personsaArayy);
		System.out.println("second version by .aslist"+ personsss);
		
	 // 3) another method for creating list----------------------------------------------
		List<person1> personssss=List.of(user1, user2,user3);
		System.out.println("third version by list.of"+personssss);
		
	//we can use methods in List and collection-------------------------------------------------------
		
		System.out.println("size list first version"+persons.size());
		
	//creating sublist---------------------------------------------------------------
		List<person1> childs=persons.subList(1, 3);
		System.out.println("chils is "+childs);
		
		
	//adding and removing ----------------------------------------------------------
		person1 user4=new person1("Zahra","email4",30);
		persons.add(user4);
		System.out.println("adding user 4 is done "+ persons);
		
		persons.removeIf(person1 -> person1.getName()=="mahsa");
		System.out.println("removing mahsa is done "+ persons);
		
		//remove if------------------------------------------------------
		persons.removeIf(person1 ->person1.getAge()==25);
		System.out.println("person with age 25 is removed"+ persons);
		
		
		//finding-equal-contains------------------------------
		
		//finding element in list by equal // equal is sensitive to capital and small
		for(person1 target:persons) {
			if (target.getName().equals("Zahra")) {
				System.out.println("your list has Zahra");
			}
		}
		//finding element in list and counting------------------------------------------
		//using equal----------------------------
		int j=0;
		for (person1 target : persons) {	
			if(target.getName().equals("Amir")) {
				j++;
			}
		}
		System.out.println("the name amir appers "+ j+" times");
			
		//using contain and because generate equal is based on name------------------------
		person1 targetsearch=new person1("Ahmad"," ",0);
		if(persons.contains(targetsearch)) {
			System.out.println("we found Ahmad");
		}
	
		//if i want to find how many ahmads are in list persons??? what should we do?????????
		//finding element in list by counting
		//int w=0;
		// person1 targetsearch1=new person1("Ahmad"," ",0);
		//for(person1 p:persons){
		//	if(((List<person1>) p).contains(targetsearch1)) {
		//		w++;	
		//	 }
		//}
		//System.out.println(w);
		
		
		//finding the index of one element in list--------------------------------------
		System.out.println("user4 index in list is "+ persons.indexOf(user4));
		
		
		//using iterators-----------------------------------------------------
		//for updating each element of list persons and one person in it
		
		List<person1> sublist= new ArrayList<>();
		for (Iterator<person1> iterator = persons.iterator(); iterator.hasNext();) {
			person1 userr = (person1) iterator.next();
			userr.setName(userr.getName().toUpperCase());
			if(userr.getAge()>35) {
				sublist.add(userr);
			}
		}
		
			System.out.println(persons);
			System.out.println("persons are old: "+ sublist);
		
		//using iterators to remove
			Iterator<person1> iterator = persons.iterator();
			while (iterator.hasNext()) {
				person1 userrr = iterator.next();
				if (userrr.getAge() == 20) {
					iterator.remove();
				}
				
			}
			System.out.println("we have removed persons with age 20 using iterators"+persons);
			
			
		//compare list version1 by writing directly sort list persons by age------------------------------------------
		//1) using comparators------------------
			
			Collections.sort(persons, new Comparator<person1>() {
				@Override
				public int compare(person1 o1, person1 o2) {
					return o1.getAge()-o2.getAge();
				}
				
			});
			System.out.println("sorted list persons based on age version1  "+ persons);
		
		///2) if we want compare based on age by using static method comparator and reference method 
			persons.sort(Comparator.comparingInt(person1::getAge));
	        System.out.println("sorted list persons based on age version2 " + persons);	
	     
	    // 3) define comparator and then use it ------------------------
	        Comparator<person1> ByAge=new Comparator<person1>() {
				@Override
				public int compare(person1 o1, person1 o2) {
					
					return o1.getAge()-o2.getAge();
				}
			};
			persons.sort(ByAge);
			System.out.println("sorted list persons based on age ByAge "+persons);
		
		// 4) compare by using Lambda expression ------------------------------
			persons.sort((o1,o2)->Integer.compare(o1.getAge(), o2.getAge()));
			System.out.println("sorted list persons based on age by using lambda "+persons);
				
		// 1)reversing by age------reverse---------------------------------------------
			Collections.reverse(persons);
			System.out.println("sorted list persons besed on reverse age" +persons);
		//2) reversing	------------------------------------------------------------
			Comparator<person1> ByAgereverse=new Comparator<person1>() {
				@Override
				public int compare(person1 o1, person1 o2) {
					
					return o2.getAge()-o1.getAge();
				}
			};
			persons.sort(ByAgereverse);
			System.out.println("sorted list persons based on reverse age ByAgereverse "+persons);
		//3) reversing ---------------collections.reverseorder-------------------------------------------------------------------
			persons.sort(Collections.reverseOrder(Comparator.comparingInt(person1::getAge)));
	        System.out.println("sorted list persons based on reverse age reference method " + persons);	
			
		///1) sorting by name  compareTo is a  method for comparing string----------------
			Collections.sort(persons, new Comparator<person1>() {
				@Override
				public int compare(person1 o1, person1 o2) {
					return o1.getName().compareTo(o2.getName());
				}
				
			});
			System.out.println("sorted list persons based on name version1  "+ persons);
				
		//2) Comparator for sorting by name
	        Comparator<person1> BybName=new Comparator<person1>() {
	            @Override
	            public int compare(person1 p1, person1 p2) {
	                return p1.getName().compareTo(p2.getName());
	            }
	        };
	        persons.sort(BybName);
	        System.out.print("sorted by name by comprator ByName"+persons);
	        
	    ///3)if we want compare based on name
	        persons.sort(Comparator.comparing(person1::getName));
	        System.out.println("sorted list persons based on  name version2" + persons);
	    
	        
	    //when we define our comparator in different class---------------------
	     Collections.sort(persons, new sortingage());
	     System.out.println("we have have sorted persons by age by seperate class sorting age "+ persons);
	   	 
	     
	     //
}
}



