/* SantaTime Version2 
 * 03.11.2017
 * Mrs. Caticorn
 */


package com.amazon.asksdk.helloworld;
import java.text.DateFormat;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class SantaTimeV2 {

	public int getDaysToChristmas(boolean euChristmas, boolean usChristmas) {
		// TODO Auto-generated method stub
		
	// todays date
		        GregorianCalendar now = new GregorianCalendar(); 
		        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);      // 00.00.0000
		   
    // date to string to substrings & integers
		        // substring: day
				String s1=df.format(now.getTime()); 
				int a=s1.indexOf('.'); 
				String day=s1.substring(0, a); 
				// Casting to integer
				int day1; 
				day1=Integer.parseInt(day); 
	//testday
	//day1=25; 
									
				// substring: month
				int b=s1.indexOf('.', a+1); 
				String month=s1.substring(a+1, b);
				// Casting to integer 
				int month1; 
				month1=Integer.parseInt(month); 
	//test month
	//month1=12;
	     		
				// substring: year	
				String year=s1.substring(b+1);
				// Casting to integer
				int year1; 
				year1=Integer.parseInt(year);
	//test year
	//year1=2017;
			
				
	//days per month
		int jan=31; int feb; int mar=31;	int apr=30;int may=31; int jun=30; 
		int jul=31; int aug=31; int sep=30; int oct=31; int nov=30; int dec=31;
		
	//feb: leap years/ normal years
		if(year1%4==0){
			if(year1%100==0){
				if(year1%400==0) {feb=29;}
				else {feb=28;}
			}
			
			else{feb=29;} 
		}
		else{feb=28;} 
		
	// Christmas date 
		// Santa comes on 24.12. 
			int SantaEU=7; // 31-24=7
		
		// Santa comes on 25.12.
			int SantaUS=6; // 31-25=6
		
		//dec: before Christmas
			
			int decEU=dec-SantaEU;
			int decUS=dec-SantaUS;
			int santa;
			int month_math; 
			
			//for December 25
			if(usChristmas==true) {santa = decUS;} 
			else {
				//for December 24	            	   
				if(euChristmas==true) {santa = decEU; 
				}
				/* Christmas is on December 25. 
				 * We don't support RussianOrthodoxChristmas yet. 
				 */
				else { 
					santa=decUS; 
				}
			}

			switch(month1) {
			case 1: month_math=feb+mar+apr+may+jun+jul+aug+sep+oct+nov+santa+jan-day1; break; 
			case 2: month_math=mar+apr+may+jun+jul+aug+sep+oct+nov+santa+feb-day1; break; 
			case 3: month_math=apr+may+jun+jul+aug+sep+oct+nov+santa+mar-day1; break; 
			case 4: month_math=may+jun+jul+aug+sep+oct+nov+santa+apr-day1; break; 
			case 5: month_math=jun+jul+aug+sep+oct+nov+santa+may-day1; break; 
			case 6: month_math=jul+aug+sep+oct+nov+santa+jun-day1; break; 
			case 7: month_math=aug+sep+oct+nov+santa+jul-day1; break;
			case 8: month_math=sep+oct+nov+santa+aug-day1; break;
			case 9: month_math=oct+nov+santa+sep-day1;break;
			case 10: month_math=nov+santa+oct-day1; break; 
			case 11: month_math=santa+nov-day1; break;
			default: 
				// december
				// before / on December 24 / December 25 
				if(day1<=santa) {month_math=santa-day1;}
				// after December 24 /25 & following year: leap year or not?
				else {final int Year2=year1+1; int feb1;
				if(Year2%4==0){
					if(Year2%100==0){
						if(Year2%400==0) {feb1=29;}
						else {feb1=28;}
					}
					else{feb1=29;} 
				}
				else{feb1=28;} 
				month_math=dec-day1+jan+feb1+mar+apr+may+jun+jul+aug+sep+oct+nov+santa;				
				break;}
				break;
			}
		return month_math; 
	}

}


	

    
	
	
	
				
				

	

