package com.wallaceespindola.companies;
/**
 * Test via Codility for MTT Dublin
 * 
 * @author Wallace 
 */
public class TestMTT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test MTT Codility !!!");

		//Solution 1
		Solution1 s1 = new Solution1();

		int[] a = {4, 6, 2, 2, 6, 6, 1};
		//int[] a = {4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1};
		//int[] a = {4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1, 4, 6, 2, 2, 6, 6, 1};
		int result = s1.solution(a);
		System.out.println("Solution 1 - Result:" + result);
		
		//Solution 2
		int A = -1234;
		int B = -5678;
		Solution2 s2 = new Solution2();
		result = s2.solution(A, B);
		System.out.println(A);
		System.out.println(B);
		System.out.println("Solution 2 - Result:" + result);
		
		// Solution 3
		
		//	A[0][0] = 5    A[0][1] = 4    A[0][2] = 4
		//	A[1][0] = 4    A[1][1] = 3    A[1][2] = 4
		//	A[2][0] = 3    A[2][1] = 2    A[2][2] = 4
		//	A[3][0] = 2    A[3][1] = 2    A[3][2] = 2
		//	A[4][0] = 3    A[4][1] = 3    A[4][2] = 4
		//	A[5][0] = 1    A[5][1] = 4    A[5][2] = 4
		//	A[6][0] = 4    A[6][1] = 1    A[6][2] = 1

		int[][] C = {	{5,4,4}, 
						{4,3,4}, 
						{3,2,4}, 
						{2,2,2}, 
						{3,3,4}, 
						{1,4,4}, 
						{4,1,1}	  };
		
		Solution3 s3 = new Solution3();
		result = s3.solution(C);
		System.out.println("Solution 3 - Result:" + result);
	}
}

class Solution3 {
    public int solution(int[][] A) {
    	
    	// TODO to be continued to result correctly, time is over
    	
    	// Fazer todo o código, resultado esperado 11, retornado 20
    	
    	int count = 0;
    	
    	for (int row=0; row < A.length; row++)
    	{
    	    for (int col=0; col < A[row].length; col++)
    	    {
    	        int value = A[row][col];
    	        
        		try {
        			if(value == A[row-1][col]) {
        				count++;
        			}
        		} catch (Exception e) {
    				// TODO: handle exception
    			}
        		try {
        			if(value == A[row+1][col]) {
        				count++;
        			}
        		} catch (Exception e) {
    				// TODO: handle exception
    			}
        		try {
        			if(value == A[row][col-1]) {
        				count++;
        			}
        		} catch (Exception e) {
    				// TODO: handle exception
    			}
        		try {
        			if(value == A[row][col+1]) {
        				count++;
        			}
        		} catch (Exception e) {
    				// TODO: handle exception
    			}
        		
    	        //System.out.println(value);
    	        
    	    }
    	}
    	
    	return count;
    }
}

class Solution2 {
    public int solution(int A, int B) {
    	
    	// Fazer todo o código, resultado esperado alcançado
        
    	int A1 = Math.abs(A);
    	int B1 = Math.abs(B);
    	
    	int bigger = Math.max(A1, B1);
    	
    	StringBuffer a = new StringBuffer(Integer.valueOf(A1).toString());
    	StringBuffer b = new StringBuffer(Integer.valueOf(B1).toString());
    	StringBuffer big = new StringBuffer(Integer.valueOf(bigger).toString());
    	
    	int N = big.length();
    	
    	StringBuffer buffer = new StringBuffer();
    	
    	for (int i = 0; i < N; i++) {
    		try {
    			buffer.append(a.charAt(i));
    		} catch (Exception e1) {
				// TODO: handle exception
			}
    		try {
    			buffer.append(b.charAt(i));
    		} catch (Exception e2) {
				// TODO: handle exception
			}
    	}
    	
    	long tempResult = Long.parseLong(buffer.toString());
    	int result = 0;
    	
    	if (tempResult > 100000000) {
    		result = -1;
    	} else {
    		result = Integer.parseInt(String.valueOf(tempResult));
    	}
    	
    	return result;
    }
}

class Solution1 {
	int solution(int[] A) {
		
		//Esperado rodar otimizado em complexidade O(N)
		
		int N = A.length;
		int result = 0;
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i==j || j<i) { //Optimization code - begin
					continue;
				} //Optimization code - end 
				if (A[i] == A[j]) {
					result = Math.max(result, Math.abs(i - j));
					count++;
					//System.out.println("i="+i+", j="+j+", result="+result+", count="+count);
				}
			}
		}
		return result;
	}
}
