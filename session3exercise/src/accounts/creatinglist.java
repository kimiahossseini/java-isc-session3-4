package accounts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class creatinglist {

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
		//sort your list based on balance---------------------------------
		Collections.sort(accounts, new Comparator<account>() {
			@Override
			public int compare(account o1, account o2) {
				return o1.getBalance()-o2.getBalance();
			}	
		});
		System.out.println("we have sorted your list basedn on balance ascending: "+ accounts );
		//sort your list reversing ------------------------------------------
		Collections.sort(accounts, new Comparator<account>() {
			@Override
			public int compare(account o1, account o2) {
				return o2.getBalance()-o1.getBalance();
			}	
		});
		System.out.println("we have sorted your list basedn on balance descending: "+ accounts );
		//we put accounts with same branch in a list----------------------------------
		List<account> mirdamadbranch= new ArrayList<>();
		List<account> zafarbranch= new ArrayList<>();
		List<account> vanakbranch= new ArrayList<>();
		for (Iterator<account> iterator = accounts.iterator(); iterator.hasNext();) {
			account userr = (account) iterator.next();
			if(userr.getBranch()=="mirdamad") {
				mirdamadbranch.add(userr);
			}
			if(userr.getBranch()=="zafar") {
				zafarbranch.add(userr);
			}
			if(userr.getBranch()=="vanak") {
				vanakbranch.add(userr);
			}
		}
		//create a map that its keys are code of branch and values are list of accounts------------
		// code mirdamad branch "b01" //code zafar branch "b02" //code vanak branch "bo3"
		Map<String,List<account>> mapbranch=new HashMap<>();
		mapbranch.put("b01", mirdamadbranch);
		mapbranch.put("b02", zafarbranch);
		mapbranch.put("b03", vanakbranch);
		//we want to show our mapbranch-------------------------------------------
		System.out.println("we map your list of accounts to a map based on code of branch:");
		System.out.println("code product in map:"+"\t"+"product info:");
		for (Map.Entry<String, List<account>> entry : mapbranch.entrySet()) {
			String key = entry.getKey();
			List<account> val = entry.getValue();
			System.out.println(key +"\t\t\t"+val);
		}
		//we want to remove key "b03"--------------------------------------------
		mapbranch.remove("b03");
		System.out.println("we have removed branch with code b03 form your map:");
		System.out.println("code product in map:"+"\t"+"product info:");
		for (Map.Entry<String, List<account>> entry : mapbranch.entrySet()) {
			String key = entry.getKey();
			List<account> val = entry.getValue();
			System.out.println(key +"\t\t\t"+val);
		}
		///we want to find accounts that their name contains "A"-------------------------
		List<account> Aaccount=new ArrayList<>();
		for (Iterator<account> iterator = accounts.iterator(); iterator.hasNext();) {
			account user = (account) iterator.next();
			if(user.getName().contains("A")) {
				Aaccount.add(user);
			}
		}
		System.out.println("we find accounts that their name contains A "+ Aaccount);
		//we want to find accounts that their name starts with A---function---------
		
		
		//we want capital acconts' name----------------------------------------------------------------
		for (Iterator<account> iterator = accounts.iterator(); iterator.hasNext();) {
			account userrr = (account) iterator.next();
			userrr.setName(userrr.getName().toUpperCase());
		}
		System.out.println("we rewrite accounts' name in capital letter  "+ accounts);
		//we want find accounts with this condition balance>10 and its name start with A--------------------------
		List<account> specificaccount=new ArrayList<>();
		for (Iterator<account> iterator = accounts.iterator(); iterator.hasNext();) {
			account useR = (account) iterator.next();
			if(useR.getName().contains("A") && useR.getBalance()>10) {
				specificaccount.add(useR);
			}
		}
		if(specificaccount!=null) {
		       System.out.println("we find an account that ist name contains A and balance>10");
		       System.out.println(specificaccount);
		}else
			System.out.println("we don't find this specific account");

	}
		
		
}

		
		
		
		
	


