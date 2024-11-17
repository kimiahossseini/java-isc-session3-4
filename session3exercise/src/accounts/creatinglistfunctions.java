package accounts;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class creatinglistfunctions {

	public static void main(String[] args) {
		//create a list o accounts and show list------------------
				account user1=new account("maryam","mirdamad",100);
				account user2=new account("Kimia","mirdamad",500);
				account user3=new account("Zahra","vanak",400);
				account user4=new account("mahsa","zafar",50);
				account user5=new account("Atefe","zafar",700);
				List<account> accounts=new ArrayList<>();
				accounts.add(user1);
				accounts.add(user2);
				accounts.add(user3);
				accounts.add(user4);
				accounts.add(user5);
				System.out.println("we have created a list of accounts: "+ accounts);

		//show accounts that their name start with "A"
		List<account> Aaccount=accounts.stream().filter(t -> t.getName().startsWith("A"))
				.collect(Collectors.toList());
		System.out.println("accounts' name start with A: "+ Aaccount);
		
		////we want to Capitalize account names
		List<account> Capitalaccount=accounts.stream()
				.map(t -> new account(t.getName().toUpperCase(),t.getBranch(),t.getBalance()))
				.collect(Collectors.toList());
		System.out.println("capitalized account name"+ Capitalaccount);
		
		////we want to  find accounts with this condition balance>10 and its name start with A
		List<account> specificaccount=accounts.stream().filter(t ->t.getBalance()>100 )
				.filter(t ->t.getName().startsWith("A")).collect(Collectors.toList());
		System.out.println("specific accounts balance>10 and their name start with A"+ specificaccount);
		
		//we want to find accounts that their balance>400 and give their average,count, max, min
		IntSummaryStatistics  statics=accounts.stream().filter(t -> t.getBalance()>400)
				.collect(Collectors.summarizingInt(t -> t.getBalance()));
		System.out.println("statics of accounts that their balance>400: "+statics);
		
		//create a map that its keys are branch and its values are persons
		Map<String, List<account>> branchmap=accounts.stream()
				.collect(Collectors.groupingBy(account::getBranch));
		
		System.err.println("branch name \t accounts in branc");
		branchmap.forEach((t, u) -> System.out.println(t+"\t\t"+u));
	
		//grouping accounts into two group balance>=400 and balance<400		
		Map<Boolean, List<account>> richaccount=accounts.stream()
				.collect(Collectors.partitioningBy(t ->t.getBalance()>=400 ));
		System.out.println("grouping accounts into two group based on balance"+richaccount);
		
		
	}

}
