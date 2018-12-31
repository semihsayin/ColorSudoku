package Project;

import java.awt.Color;

public class MyColors {
     
	public static final Color MY_BLUE=new Color(58,105,199);
	public static final Color MY_RED=new Color(255,30,68);
	public static final Color MY_YELLOW=new Color(240,247,14);
	public static final Color MY_ORANGE=new Color(255,168,53);
	public static final Color MY_PÝNK=new Color(255,124,220);
	public static final Color MY_GREEN=new Color(69,246,56);
	public static final Color MY_PURPLE=new Color(172,63,255);
	public static final Color MY_GREY=new Color(192,192,192);
	public static final Color MY_BROWN=new Color(128,77,77);
	
	
	
	public static Color RandomColor() {
		
		int r=(int)((Math.random()*9)+1);
		
		if(r==1) {
			return MyColors.MY_BLUE;
			}
			else if(r==2) {
				return MyColors.MY_RED;
			
			}
			else if(r==3) {
				return MyColors.MY_YELLOW;
				}
			else if(r==4) {
				return MyColors.MY_ORANGE;
				}
			else if(r==5) {
				
				return MyColors.MY_PÝNK;
			}
			else if(r==6) {
			   return MyColors.MY_GREEN;
			}
			else if(r==7) {
				return MyColors.MY_PURPLE;
				
			}
			else if(r==8) {
				return MyColors.MY_GREY;
				
			}
			else if(r==9) {
				return MyColors.MY_BROWN;
				
			}
	
			else 
		return null;

	}

	
}
