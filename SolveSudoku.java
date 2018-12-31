package Project;

import javax.swing.JButton;

public class SolveSudoku extends ColorSudokuFrame {
	public static JButton[][] empty=new JButton[10][10];
    
public SolveSudoku() {

	MyColors Colors;
	ChangeRow();
	ChangeColumn();
}
	
	public static void Solve() {
		button[1][1].setBackground(Colors.MY_RED);
		button[1][2].setBackground(Colors.MY_GREEN);
		button[1][3].setBackground(Colors.MY_BLUE);
		button[2][1].setBackground(Colors.MY_BROWN);
		button[2][2].setBackground(Colors.MY_YELLOW);
		button[2][3].setBackground(Colors.MY_PÝNK);
		button[3][1].setBackground(Colors.MY_ORANGE);
		button[3][2].setBackground(Colors.MY_GREY);
		button[3][3].setBackground(Colors.MY_PURPLE);
		
		button[1][4].setBackground(Colors.MY_GREY);
		button[1][5].setBackground(Colors.MY_PURPLE);
		button[1][6].setBackground(Colors.MY_YELLOW);
		button[2][4].setBackground(Colors.MY_ORANGE);
		button[2][5].setBackground(Colors.MY_RED);
		button[2][6].setBackground(Colors.MY_GREEN);
		button[3][4].setBackground(Colors.MY_PÝNK);
        button[3][5].setBackground(Colors.MY_BROWN);
        button[3][6].setBackground(Colors.MY_BLUE);
        
        button[1][7].setBackground(Colors.MY_BROWN);
        button[1][8].setBackground(Colors.MY_ORANGE);
        button[1][9].setBackground(Colors.MY_PÝNK);
        button[2][7].setBackground(Colors.MY_BLUE);
		button[2][8].setBackground(Colors.MY_GREY);
		button[2][9].setBackground(Colors.MY_PURPLE);
		button[3][7].setBackground(Colors.MY_GREEN);
        button[3][8].setBackground(Colors.MY_RED);
        button[3][9].setBackground(Colors.MY_YELLOW);
        
        button[4][1].setBackground(Colors.MY_PÝNK);
		button[4][2].setBackground(Colors.MY_BROWN);
		button[4][3].setBackground(Colors.MY_GREY);
		button[5][1].setBackground(Colors.MY_YELLOW);
		button[5][2].setBackground(Colors.MY_PURPLE);
		button[5][3].setBackground(Colors.MY_GREEN);
		button[6][1].setBackground(Colors.MY_BLUE);
		button[6][2].setBackground(Colors.MY_RED);
		button[6][3].setBackground(Colors.MY_ORANGE);
		
		   button[4][4].setBackground(Colors.MY_GREEN);
			button[4][5].setBackground(Colors.MY_YELLOW);
			button[4][6].setBackground(Colors.MY_ORANGE);
			button[5][4].setBackground(Colors.MY_BROWN);
			button[5][5].setBackground(Colors.MY_BLUE);
			button[5][6].setBackground(Colors.MY_RED);
			button[6][4].setBackground(Colors.MY_PURPLE);
			button[6][5].setBackground(Colors.MY_PÝNK);
			button[6][6].setBackground(Colors.MY_GREY);
			
			   button[4][7].setBackground(Colors.MY_PURPLE);
		        button[4][8].setBackground(Colors.MY_BLUE);
		        button[4][9].setBackground(Colors.MY_RED);
		        button[5][7].setBackground(Colors.MY_ORANGE);
				button[5][8].setBackground(Colors.MY_PÝNK);
				button[5][9].setBackground(Colors.MY_GREY);
				button[6][7].setBackground(Colors.MY_YELLOW);
		        button[6][8].setBackground(Colors.MY_GREEN);
		        button[6][9].setBackground(Colors.MY_BROWN);
		        
		    	button[7][1].setBackground(Colors.MY_PURPLE);
				button[7][2].setBackground(Colors.MY_BLUE);
				button[7][3].setBackground(Colors.MY_RED);
				button[8][1].setBackground(Colors.MY_GREY);
				button[8][2].setBackground(Colors.MY_ORANGE);
				button[8][3].setBackground(Colors.MY_YELLOW);
				button[9][1].setBackground(Colors.MY_GREEN);
				button[9][2].setBackground(Colors.MY_PÝNK);
				button[9][3].setBackground(Colors.MY_BROWN);       
				
				button[7][4].setBackground(Colors.MY_YELLOW);
				button[7][5].setBackground(Colors.MY_ORANGE);
				button[7][6].setBackground(Colors.MY_PÝNK);
				button[8][4].setBackground(Colors.MY_RED);
				button[8][5].setBackground(Colors.MY_GREEN);
				button[8][6].setBackground(Colors.MY_BROWN);
				button[9][4].setBackground(Colors.MY_BLUE);
		        button[9][5].setBackground(Colors.MY_GREY);
		        button[9][6].setBackground(Colors.MY_PURPLE);
		        
		        button[7][7].setBackground(Colors.MY_GREY);
		        button[7][8].setBackground(Colors.MY_BROWN);
		        button[7][9].setBackground(Colors.MY_GREEN);
		        button[8][7].setBackground(Colors.MY_PÝNK);
				button[8][8].setBackground(Colors.MY_PURPLE);
				button[8][9].setBackground(Colors.MY_BLUE);
				button[9][7].setBackground(Colors.MY_RED);
		        button[9][8].setBackground(Colors.MY_YELLOW);
		        button[9][9].setBackground(Colors.MY_ORANGE);
    
    
        }
	public static void ChangeRow() 	{	
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++){
			 empty[i][j]=new JButton();
			}
		}
		
			
		int a=(int)((Math.random()*9)+1);
		int b=(int)((Math.random()*9)+1);
		
	
	 
          if(a>=1 && a<=3 && b>=1 && b<=3) {	
		for(int i=1;i<=9;i++) {
			empty[a][i].setBackground(button[a][i].getBackground());
			button[a][i].setBackground(button[b][i].getBackground());
			button[b][i].setBackground(empty[a][i].getBackground());
		}
          }
          
          else if(a>=4 && a<=6 && b>=4 && b<=6) {
		for(int i=1;i<=9;i++) {
			empty[a][i].setBackground(button[a][i].getBackground());
			button[a][i].setBackground(button[b][i].getBackground());
			button[b][i].setBackground(empty[a][i].getBackground());
		}
		}
          else if(a>=7 && a<=9 && b>=7 && b<=9) {
		for(int i=1;i<=9;i++) {
			empty[a][i].setBackground(button[a][i].getBackground());
			button[a][i].setBackground(button[b][i].getBackground());
			button[b][i].setBackground(empty[a][i].getBackground());
		}
		
		}
          else {
        	  ChangeRow();
		}
	
	for(int i=1;i<=9;i++) {
		for(int j=1;j<=9;j++){
		 empty[i][j]=new JButton();
		}
	}
	
		
	
	
	}
   public static void ChangeColumn() {
	   
		
		int c=(int)((Math.random()*9)+1);
		int d=(int)((Math.random()*9)+1);
		

	 
	      if(c>=1 && c<=3 && d>=1 && d<=3) {	
		for(int i=1;i<=9;i++) {
			empty[i][c].setBackground(button[i][c].getBackground());
			button[i][c].setBackground(button[i][d].getBackground());
			button[i][d].setBackground(empty[i][c].getBackground());
		}
	      }
	      
	      else if(c>=4 && c<=6 && d>=4 && d<=6) {
		for(int i=1;i<=9;i++) {
			empty[i][c].setBackground(button[i][c].getBackground());
			button[i][c].setBackground(button[i][d].getBackground());
			button[i][d].setBackground(empty[i][c].getBackground());
		}
		}
	      else if(c>=7 && c<=9 && d>=7 && d<=9) {
		for(int i=1;i<=9;i++) {
			empty[i][c].setBackground(button[i][c].getBackground());
			button[i][c].setBackground(button[i][d].getBackground());
			button[i][d].setBackground(empty[i][c].getBackground());
		}
		
		}
	   
		}

   
	


	}

	

