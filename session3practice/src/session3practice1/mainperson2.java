package session3practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class mainperson2 {

	public static void main(String[] args) {
		   
			person2 user1=new person2("mahsa","email1",20);
			person2 user2=new person2("Kimia","email2",25);
			person2 user3=new person2("Atefe","email3",26);
			person2 user5=new person2("Amir","email5",32);
			person2 user6=new person2("Ahmad","email6",37);
			person2 user7=new person2("Amir","email7",35);
			person2 user8=new person2("Ahmad","email12",37);
			
		//by using generic List<Person1>, we determine the type List persons
		//simple method for filling List persons
			List<person2> persons=new ArrayList<>();
			persons.add(user1);
			persons.add(user2);
			persons.add(user3);
			persons.add(user5);
			persons.add(user6);
			persons.add(user7);
			persons.add(user8);
			System.out.println("first version  "+ persons);
		
			
			//another method for creating List
			String[] personsArray={"Ali","Alireza","Ahmad"};
			List<String> personss=Arrays.asList(personsArray);
			System.out.println("second version   "+personss);
		    //
			
			
			//we can use methods in List and collection
			
			System.out.println("size list first version"+persons.size());
			
			//creating sublist
			List<person2> childs=persons.subList(1, 3);
			System.out.println("chils is "+childs);
			//adding and removing 
			person2 user4=new person2("Zahra","email4",30);
			persons.add(user4);
			System.out.println("adding user 4 is done "+ persons);
			
			persons.removeIf(person2 -> person2.getName()=="mahsa");
			System.out.println("removing mahsa is done "+ persons);
			
			//remove if
			persons.removeIf(person2 ->person2.getAge()==25);
			System.out.println("person with age 25 is removed"+ persons);
			
			//finding element in list by equal // equal is sensitive to capital and small
			for(person2 target:persons) {
				if (target.getName().equals("Zahra")) {
					System.out.println("your list has Zahra");
				}
			}
			//finding element in list by contains
			int j=0;
			for (person2 target : persons) {
				
				if(target.getName().equals("Amir")) {
					j++;
				}
			}
			System.out.println("the name amir appers "+ j+" times");
				
			
			//finding element in list version2
			//int w=0;
			// person1 targetsearch=new person1("Ahmad"," ",0);
			//for(person1 p:persons){
			//	if(p.contains(targetsearch)) {
			//	 w++;	
			//	 }
			//}
			//System.out.println(w);
			
			person1 targetsearch=new person1("Ahmad"," ",0);
			if(persons.contains(targetsearch)) {
				System.out.println("we found Ahmad");
			}
			//if i want to find how many ahmads are in list persons???
			
			System.out.println("user4 index in list is "+ persons.lastIndexOf(user4));
			
			
			//using iterators
			
			List<person2> sublist= new ArrayList<>();
			
			for (Iterator<person2> iterator = persons.iterator(); iterator.hasNext();) {
				person2 userr = (person2) iterator.next();
				userr.setName(userr.getName().toUpperCase());
				if(userr.getAge()>35) {
					sublist.add(userr);
				}
			}
				System.out.println(persons);
				System.out.println("persons are old: "+ sublist);
			
			//class person2 implement comparable and we can use method compareTo directly in main
				
		      System.out.println(user1.compareTo(user4));
			///we put our comparison logic in another class
		 
				
	}

}


