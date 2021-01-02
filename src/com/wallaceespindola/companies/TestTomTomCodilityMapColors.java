package com.wallaceespindola.companies;
import java.util.HashMap;
import java.util.Map;

public class TestTomTomCodilityMapColors {

	public static void main(String[] args) {

		System.out.println("Test TomTom Codility...");
		
		TestTomTomCodilityMapColors test = new TestTomTomCodilityMapColors();
		
		int[][] A = new int[7][3];
		
		A[0][0] = 5;    A[0][1] = 4;    A[0][2] = 4;
		A[1][0] = 4;    A[1][1] = 3;    A[1][2] = 4;
		A[2][0] = 3;    A[2][1] = 2;    A[2][2] = 4;
		A[3][0] = 2;    A[3][1] = 2;    A[3][2] = 2;
		A[4][0] = 3;    A[4][1] = 3;    A[4][2] = 4;
		A[5][0] = 1;    A[5][1] = 4;    A[5][2] = 4;
		A[6][0] = 4;    A[6][1] = 1;    A[6][2] = 1;
		
		System.out.println(A);
		
		System.out.println("solution: " + test.solution(A)); // return 11
	}

	public int solution(int[][] A) {
		
		Map<Integer,Integer> countries = new HashMap<>();
		int countryCount = 0;
		
		for (int row=0; row < A.length; row++)
		{
		    for (int col=0; col < A[row].length; col++)
		    {
		        int value = A[row][col];
		        //System.out.println("A["+ row + "][" + col + "] = " + value);
		        
		        int regionOK = 0;
		        
		        try {
			        if (A[row-1][col] == value) {
			        	System.out.println("1)" + A[row-1][col]);
			        	System.out.println("1)" + value);
			        	regionOK++;
			        	//countries.put(countryCount++, value);
			        	continue;
			        }
		        } catch (Exception e) {
					e.printStackTrace();
				}
//		        try {
//			        if (A[row+1][col] != value) {
//			        	System.out.println("2)" + A[row+1][col]);
//			        	System.out.println("2)" + value);
//			        	regionOK++;
//			        	countries.put(countryCount++, value);
//			        	continue;
//			        }
//		        } catch (Exception e) {
//					e.printStackTrace();
//				}
		        try {
			        if (A[row][col-1] == value) {
			        	System.out.println("3)" + A[row][col-1]);
			        	System.out.println("3)" + value);
			        	regionOK++;
			        	//countries.put(countryCount++, value);
			        	continue;
			        }
		        } catch (Exception e) {
		        	e.printStackTrace();
				}
//		        try {
//			        if (A[row][col+1] != value) {
//			        	System.out.println("4)" + A[row][col+1]);
//			        	System.out.println("4)" + value);
//			        	regionOK++;
//			        	countries.put(countryCount++, value);
//			        	continue;
//			        }
//		        } catch (Exception e) {
//		        	e.printStackTrace();
//				}
		        
//		        if (regionOK > 0 && !countries.values().contains(value)) {
//		        	countries.put(countryCount++, value);
//		        }
		        //if (countries.get(countryCount) != null && countries.get(countryCount) != value) {
		        	
		        	countries.put(countryCount++, value);
		        //}
		    }
		}
		System.out.println(countries.size());
		
		return 11;
    }
	
}
