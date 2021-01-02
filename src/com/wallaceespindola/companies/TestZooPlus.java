package com.wallaceespindola.companies;
/**
 * Test via Codility for ZooPlus Frankfurt
 * 
 * @author Wallace
 */
public class TestZooPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test ZooPlus Codility !!!");
		
		// testes basicos
//		System.out.println("3:["+solution(new String())+"]");
//		System.out.println("3:["+solution("")+"]");
//		System.out.println("3:["+solution(" ")+"]");
//		System.out.println("3:["+solution(null)+"]");

		String test = " 0 22- ";
		System.out.println("3:["+solution(test)+"]");
		
//		test = " 0 2-";
//		System.out.println("3:["+solution(test)+"]");
//		
//		test = " 0 22 -5558- 80 89 008-8555 5-8-";
//		System.out.println("3:["+solution(test)+"]");
		
		test = "0 - 22 1985--324";
		System.out.println("3:["+solution(test)+"]");
//		System.out.println("3:["+solution(test+"1")+"]");
//		System.out.println("3:["+solution(test+"12")+"]");
//		System.out.println("3:["+solution(test+"123")+"]");
		
//		System.out.println("3:["+solution(test)+"]");
//		System.out.println("3:["+solution(test + "")+"]");
//		System.out.println("3:["+solution(test + " ")+"]");
//		System.out.println("3:["+solution(test + "--")+"]");
//		System.out.println("3:["+solution(test + "- ")+"]");
		test = "555372654";
		System.out.println("3:["+solution(test)+"]");
//		System.out.println("3:["+solution(test)+"]");
//		System.out.println("3:["+solution(test + "")+"]");
//		System.out.println("3:["+solution(test + " ")+"]");
//		System.out.println("3:["+solution(test + "--")+"]");
//		System.out.println("3:["+solution(test + "- ")+"]");
	}

	public static String solution(String S) {
	        // write your code in Java SE 8
			
			System.out.println("\n1:["+S+"]");
		
	        if (S == null || S.isEmpty() || S.trim() == "") {
	            return "";
	        }
	        
	        String iniText = S.replaceAll(" ", "").replaceAll("-", "");
	        
	        StringBuffer finalText = new StringBuffer("");
	        
	        int count = 0;
	        int len = iniText.length();
	        
	        System.out.println("2:["+iniText+"]-"+len);
	        
	        if (len <=3 ) {
	        	return iniText;
	        }
	        
	        for (int i = 0; i < (iniText.length()); i++) {
	        	
	        	finalText.append(iniText.charAt(i));
				
	        	count++;
				int finalLength = iniText.length() - (i+1);
				
				if (finalLength > 3 && count == 3 ) {
					finalText.append("-");
					count = 0;
				} else if (finalLength == 4 ) {
					finalText.append(iniText.charAt(i+1));
					System.out.println("x:["+finalText.toString()+"]");
					finalText.append(iniText.charAt(i+2));
					System.out.println("x:["+finalText.toString()+"]");
					finalText.append("-");
					finalText.append(iniText.charAt(i+3));
					System.out.println("x:["+finalText.toString()+"]");
					finalText.append(iniText.charAt(i+4));
					System.out.println("x:["+finalText.toString()+"]");
					break;
				} else if (finalLength == 3 ) {
					finalText.append(iniText.charAt(i+1));
					System.out.println("x:["+finalText.toString()+"]");
					finalText.append(iniText.charAt(i+2));
					System.out.println("x:["+finalText.toString()+"]");
					finalText.append(iniText.charAt(i+3));
					System.out.println("x:["+finalText.toString()+"]");
					break;
				} else if (finalLength == 2 ) {
					finalText.append(iniText.charAt(i+1));
					System.out.println("x:["+finalText.toString()+"]");
					finalText.append(iniText.charAt(i+2));
					System.out.println("x:["+finalText.toString()+"]");
					break;
				} else if (finalLength == 1 ) {
					finalText.append(iniText.charAt(i+1));
					System.out.println("x:["+finalText.toString()+"]");
					break;
				}
			}
	        
	        return finalText.toString();
	}
}
