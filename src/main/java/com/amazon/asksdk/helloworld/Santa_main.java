package com.amazon.asksdk.helloworld;

import com.amazon.asksdk.helloworld.SantaTimeV2; 

public class Santa_main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new SantaTimeV2(); 
    boolean euChristmas; 
    euChristmas=true; 
    boolean usChristmas; 
    if(euChristmas==true) {usChristmas=false;}
    else{usChristmas=true;}
    int month_math=new SantaTimeV2().getDaysToChristmas(euChristmas, usChristmas); 
    
    
    System.out.println(month_math);
    System.out.print(euChristmas +"\t"+ usChristmas);
	}
		
}
