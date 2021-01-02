package com.wallaceespindola.companies;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DonutMapperHackerRankAmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Amazon Donut Mapper Test!!!");

		String[][] donutConstraintPairs = { { "cruller", "vegan" }, { "beignet", "coffee" }, { "wally", "doce-de-leite" } };
		//System.out.println(donutConstraintPairs[0][0] + "-" + donutConstraintPairs[0][1]);
		//System.out.println(donutConstraintPairs[1][0] + "-" + donutConstraintPairs[1][1]);

		//String[][] candidateConstraintPairs = { { "rob", "coffee" }, { "beth", "vegan" } };
		String[][] candidateConstraintPairs = { { "rob", "coffee" }, { "beth", "*" } };

		String[][] result = matchDonuts(donutConstraintPairs, candidateConstraintPairs);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i][0] + "-" + result[i][1]);
		}
	}

	private static String[][] matchDonuts(String[][] donutConstraintPairs, String[][] candidateConstraintPairs) {

		Map<String, HashSet<String>> map = new LinkedHashMap<>();

		for (int i = 0; i < donutConstraintPairs.length; i++) {
			for (int j = 0; j < candidateConstraintPairs.length; j++) {

				if ((donutConstraintPairs[i][1].equals(candidateConstraintPairs[j][1]))) {
				
					if (!map.containsKey(candidateConstraintPairs[j][0])) {
						map.put(candidateConstraintPairs[j][0], new LinkedHashSet<String>());
					}
					map.get(candidateConstraintPairs[j][0]).add(donutConstraintPairs[i][0]);
				
				} else if (candidateConstraintPairs[i][1].equals("*")) {
					
					if (!map.containsKey(candidateConstraintPairs[j][0])) {
						map.put(candidateConstraintPairs[j][0], new LinkedHashSet<String>());
					}
					for (int j2 = 0; j2 < donutConstraintPairs.length; j2++) {
						map.get(candidateConstraintPairs[j][0]).add(donutConstraintPairs[j2][0]);
					}
				}
			}
		}
		
		int listSize = 0;
		for (Iterator iterator = map.values().iterator(); iterator.hasNext();) {
			Set setVal = (Set) iterator.next();
			listSize = listSize + setVal.size();
		}

		String[][] result = new String[listSize][2];
		int z = 0;
		
		Iterator entries = map.keySet().iterator();
		while (entries.hasNext()) {
			String key = (String) entries.next();
			Set val = (Set)map.get(key);
			//System.out.println(key+"/"+val);
			
			for (Iterator iterator = val.iterator(); iterator.hasNext();) {
				String value = (String) iterator.next();
				result[z][0] = key;
				result[z][1] = value;
				z++;
			}
		}

		return result;
	}

}
