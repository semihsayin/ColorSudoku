package Project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonTest extends ColorSudokuFrame {

public ButtonTest() {
Test();
		
	}
public static int Test() {

			
				
				for(int x=1;x<=9;x++) {
					for(int y=1;y<=9;y++) {
						for(int a=1;a<=9;a++) {
							if(button[x][a].getBackground()!=Color.WHITE && button[x][a].getBackground().equals(button[x][y].getBackground()) && a!=y){
							  JOptionPane.showMessageDialog(pnl1,"               HATA VAR        ","    HATA   ",0);
							  return 1;
							  
								
							}
							else if(button[a][y].getBackground()!=Color.WHITE && button[a][y].getBackground().equals(button[x][y].getBackground()) && a!=x){
								  JOptionPane.showMessageDialog(pnl1,"               HATA VAR        ","  HATA ",0);
								  return 1;
						}
						
					}
						

				}
					

				}
              
				for(int x=1;x<=3;x++) {
					for(int y=1;y<=3;y++) {
						for(int a=1;a<=3;a++) {
						   for(int b=1;b<=3;b++) {	
						
							if(button[x][y].getBackground()!=Color.WHITE && button[x][y].getBackground().equals(button[a][b].getBackground()) && a!=x && y!=b){
							  JOptionPane.showMessageDialog(pnl1,"               HATA VAR        ","    HATA   ",0);
							  return 1;
			
							}
}
						}
					}
				}
				
				for(int x=4;x<=6;x++) {
					for(int y=1;y<=3;y++) {
						for(int a=4;a<=6;a++) {
						   for(int b=1;b<=3;b++) {	
						
							if(button[x][y].getBackground()!=Color.WHITE && button[x][y].getBackground().equals(button[a][b].getBackground()) && a!=x && y!=b){
							  JOptionPane.showMessageDialog(pnl1,"               HATA VAR        ","    HATA   ",0);
							  return 1;
			
							}
}
						}
					}
				}
				
				for(int x=7;x<=9;x++) {
					for(int y=1;y<=3;y++) {
						for(int a=7;a<=9;a++) {
						   for(int b=1;b<=3;b++) {	
						
							if(button[x][y].getBackground()!=Color.WHITE && button[x][y].getBackground().equals(button[a][b].getBackground()) && a!=x && y!=b){
							  JOptionPane.showMessageDialog(pnl1,"               HATA VAR        ","    HATA   ",0);
							  return 1;
			
							}
}
						}
					}
				}
				for(int x=1;x<=3;x++) {
					for(int y=4;y<=6;y++) {
						for(int a=1;a<=3;a++) {
						   for(int b=4;b<=6;b++) {	
						
							if(button[x][y].getBackground()!=Color.WHITE && button[x][y].getBackground().equals(button[a][b].getBackground()) && a!=x && y!=b){
							  JOptionPane.showMessageDialog(pnl1,"               HATA VAR        ","    HATA   ",0);
							  return 1;
			
							}
}
						}
					}
				}
				
				for(int x=1;x<=3;x++) {
					for(int y=7;y<=9;y++) {
						for(int a=1;a<=3;a++) {
						   for(int b=7;b<=9;b++) {	
						
							if(button[x][y].getBackground()!=Color.WHITE && button[x][y].getBackground().equals(button[a][b].getBackground()) && a!=x && y!=b){
							  JOptionPane.showMessageDialog(pnl1,"               HATA VAR        ","    HATA   ",0);
							  return 1;
			
							}
}
						}
					}
				}
				for(int x=4;x<=6;x++) {
					for(int y=4;y<=6;y++) {
						for(int a=4;a<=6;a++) {
						   for(int b=4;b<=6;b++) {	
						
							if(button[x][y].getBackground()!=Color.WHITE && button[x][y].getBackground().equals(button[a][b].getBackground()) && a!=x && y!=b){
							  JOptionPane.showMessageDialog(pnl1,"               HATA VAR        ","    HATA   ",0);
							  return 1;
			
							}
}
						}
					}
				}
				for(int x=7;x<=9;x++) {
					for(int y=4;y<=6;y++) {
						for(int a=7;a<=9;a++) {
						   for(int b=4;b<=6;b++) {	
						
							if(button[x][y].getBackground()!=Color.WHITE && button[x][y].getBackground().equals(button[a][b].getBackground()) && a!=x && y!=b){
							  JOptionPane.showMessageDialog(pnl1,"               HATA VAR        ","    HATA   ",0);
							  return 1;
			
							}
}
						}
					}
				}
				for(int x=1;x<=3;x++) {
					for(int y=7;y<=9;y++) {
						for(int a=1;a<=3;a++) {
						   for(int b=7;b<=9;b++) {	
						
							if(button[x][y].getBackground()!=Color.WHITE && button[x][y].getBackground().equals(button[a][b].getBackground()) && a!=x && y!=b){
							  JOptionPane.showMessageDialog(pnl1,"               HATA VAR        ","    HATA   ",0);
							  return 1;
			
							}
}
						}
					}
				}
				for(int x=4;x<=6;x++) {
					for(int y=7;y<=9;y++) {
						for(int a=4;a<=6;a++) {
						   for(int b=7;b<=9;b++) {	
						
							if(button[x][y].getBackground()!=Color.WHITE && button[x][y].getBackground().equals(button[a][b].getBackground()) && a!=x && y!=b){
							  JOptionPane.showMessageDialog(pnl1,"               HATA VAR        ","    HATA   ",0);
							  return 1;
			
							}
}
						}
					}
				}
				for(int x=7;x<=9;x++) {
					for(int y=7;y<=9;y++) {
						for(int a=7;a<=9;a++) {
						   for(int b=7;b<=9;b++) {	
						
							if(button[x][y].getBackground()!=Color.WHITE && button[x][y].getBackground().equals(button[a][b].getBackground()) && a!=x && y!=b){
							  JOptionPane.showMessageDialog(pnl1,"               HATA VAR        ","    HATA   ",0);
							  return 1;
			
							}
}
						}
					}
				}
				return 0;
  
}

}
	


