/**
 * 
 */
package com.splatform.day0119;

/**
 * @author fuzl
 *
 */
public class TestPlus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int S=0;
//		for(int j=1;j<3000;j++){
//			S+=j;
//			if(S>5000){
//				S=S-j;
//				System.out.println("最大值S:"+S+";J:"+j);
//				break;
//			}
//		}
		
		int S=0;
		int j=1;
		do{
			S+=j;
			if(S>=5000){
				S=S-j;
				System.out.println("最大值S:"+S+";J:"+j);
				break;
			}
			j+=1;
		}while(true);
		
		
//		int s = 0;
//	    int i = 1;
//	    while(true) {
//	        s += i;
//	        i++;
//	        if((s+i)>=5000){
//	            System.out.println("最大值:" + s);
//	            break;
//	        }
//	    }
	}

}
