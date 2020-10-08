package projectEuler;

public class AAD_Capicua {
	public static void main (String [] args){
		int num = 998001;
		int i = 0;
		boolean vaBien = false;
		boolean meSirve = false;
		int n = 0;
		int divA = 999;
		int divB = 999;
		while(num>1 && n < 200){
			String numLet = Integer.toString(num);
			 do{
				if(numLet.endsWith(""+numLet.charAt(0))){
					vaBien = true;
					if(i >= numLet.length()/2 || numLet.length()<=3){
						//System.out.println(numLet +" "+ num);
						meSirve = true;
						n++;
					}
					i++;
					if(numLet.length()>3){
						numLet = numLet.substring(1, numLet.length()-1);
					}else{vaBien = false;}
				}else{
					vaBien = false;
				}
			}while(vaBien != false);
			 
			if(meSirve == true){
				while(divA>=100){
					while(divB>=1){
						if(divA*divB == num){
							System.out.println(num +" = "+divA+" * "+divB);
							divB--;
						}else{divB--;}
					}
					divA--;
					divB = 999;
				}
				divA=999;
				divB=999;
			}
			
			i=0;
			meSirve = false;
			num--;
		}
	}
}







//while(divA<999 && num%divA == 0){
//divA++;
//}while(divB<999 && (num%divA)%divB == 0){
//divB++;
//}
//if(divA*divB == num){
//System.out.println(num+" = "+divA+"*"+divB);
//}



/* 	numLet = Integer.toString(num);
			while(i<numLet.length()/2){
					if(numLet.charAt(numLet.length()-1) == numLet.charAt(0)){
						System.out.println("No Funco una pija "+numLet);
						i++;
						numLet = numLet.substring(i,numLet.length()-i);
						System.out.println("A ver ahora "+numLet);
					}
					i++;
					
			}
			i = 0;
			num--;
 
*/