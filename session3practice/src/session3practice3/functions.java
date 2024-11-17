package session3practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import session3practice1.person1;

public class functions extends person1 {

	public functions(String name, String email, int age) {
		super(name, email, age);
		
	}
	public static void main(String[] args) {
		//the first version for defining a function 
		Function<String,String> uppercase1=new Function<String, String>() {

			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}	
		};
		System.out.println("apply function upercase without lambada: "+ uppercase1.apply("Alireza") );
		// we want to simplify writing function
		//1)version1 arrow function
		Function<String,String> upercase2= s ->s.toUpperCase();
		System.out.println("apply function upercase with lambada: "+ upercase2.apply("reza") );
		//2)version2 function
		Function<String,String> upercase3= s ->s.toUpperCase();
		System.out.println("apply function upercase with lambada: "+ upercase3.apply("rezaei") );
		//3)version3 function
		Function<String,String> upercase4= String::toUpperCase;
		System.out.println("apply function upercase with reference method: "+ upercase3.apply("amir") );
		//different types of function
		
		//1-consumers have input but don't have output  we can use it by .accept
		Consumer<String> addhello=t -> System.out.println("hello " +t);
		System.out.println("we accept consumer funciton ");
		addhello.accept("kimia");
		
		//???????????????????????????????????????????
		//List<person1> persons2=new ArrayList<>();
		//2-Bifunctions have two inputs and one output
		//BiFunction<person1, person1 , List<person1>> concatfucntion=(t, u) -> persons2=List.of(t,u);
		//??????????????????????????????????????????????????
		
		//2-Bifunction  has two inputs and one output and we can use it by .apply
		BiFunction<String, String, String> bifunciton=(t, u) -> t +" family name is "+u;
		System.out.println("apply bi function:  "+ bifunciton.apply("ali", "emami"));
		
		//3-predicates has one input and boolean output we can use it by .tes
		Predicate<String> hasAtsign=t -> t.contains("@");
		System.err.println("apply predicate function: "+ hasAtsign.test("email@2"));
		
		
		//we want sort our persons list based on name and then 5 person with age >11
		List<person1> persons=new ArrayList<>();
		person1 user1=new person1("mahsa","email1",20);
		person1 user2=new person1("Kimia","email2",25);
		person1 user3=new person1("Atefe","email3",26);
		persons.add(user1);
		persons.add(user2);
		persons.add(user3);
		
		//we want to sort persons based on name and then first 5 items that their age>25 
		//version1
		persons.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		persons.stream().limit(5).filter(t -> t.getAge()>=25 )
		.forEach(t -> System.out.println("this person has your condition version1 "+t) );
		//version2
		persons.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
		.limit(5).filter(t -> t.getAge()>=25).map(t ->t.getName())
		.forEach(t ->System.out.println("the "+t+" has your condition version2"));
		
		
		//foreach performs as a iterator--------------------------------
		List<String> lists=Arrays.asList("ali","rEza","Ahmad");
		lists.forEach(t -> System.out.println(t));
		
		//showing map without iterator by using foreach------------------
		Map<String,Integer> mapp=new HashMap<>();
		mapp.put("ali", 20);
		mapp.put("amir", 16);
		System.out.println("key map"+"\t"+"value map");
		mapp.forEach((t, u) -> System.out.println(t +"\t"+u));
		
		//we want to find a name start with A , we should use collect to terminate
		System.out.println(lists);
		List<String> namesstartwitha=lists.
				stream().filter(t -> t.startsWith("a")).collect(Collectors.toList());
		System.out.println("we have used stream and filter"+namesstartwitha);
		
		List<String> lowerlists=lists;
				lists.replaceAll(t -> t.toLowerCase());
		System.err.println("using replace all:"+ lowerlists);
		
		//List<person1> upage=persons;???????????????????????????
		//	persons.replaceAll(t -> t.setAge(t.getAge()+2));????????????????????
	}

}
