package projectEuler;

public class AAM_LongestCollatzSequence {
	public static void main (String [] args){
		long numBase = 2;
		long num = 2;
		long cant = 0;
		long [] cants = new long[1000000];
		int i = 0;
		boolean fin = false;
		while(i<cants.length){
			cants[i]=-1;
			i++;
		}
		i=0;
		while (numBase<1000000){
			num=numBase;
			//System.out.println(numBase);
			while(num!=1 && fin==false){
				if(num<1000000&&cants[Integer.parseInt(Long.toString(num))]!=-1){
					cant=cant+cants[Integer.parseInt(Long.toString(num))];
					fin = true;
				}else{
					if(num%2==0){
						num=num/2;
						cant++;
						//System.out.print(" "+num);
					}else{
						num=num*3+1;
						cant++;
						//System.out.print(" "+num);
					}
				}
			}
			//System.out.print(" // "+cant);
			//System.out.println();
			cants[Integer.parseInt(Long.toString(numBase))]=cant;
			if(cant==524){
				System.out.println(numBase);
			}
			numBase++;
			cant=0;
			fin=false;
		}
		while(i<=cants.length-2){
			cants[i+1]=Math.max(cants[i], cants[i+1]);
			i++;
		}System.out.println(cants[999999]);
	}

}
