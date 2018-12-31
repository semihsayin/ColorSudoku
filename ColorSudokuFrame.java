package Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ColorSudokuFrame extends JFrame {
	public static final JButton[][] button=new JButton[10][10];
	private Container pane=new Container();
	public static JPanel pnl1=new JPanel();
	
	public JPanel pnl2=new JPanel();
	public static MyColors Colors;
	int click=0;
	 JButton test=new JButton("TEST");
	private JButton clear=new JButton("NEW SUDOKU");
	 ButtonTest bt;
    
	SolveSudoku sl;
	
	public ColorSudokuFrame() {
		this.setTitle("Color Sudoku by Semih Sayýn");
		this.setSize(803,900);
	    this.setResizable(false);
	    pnl1.setBorder(BorderFactory.createMatteBorder(3,3,3,3,Color.BLACK));
		pnl1.setLocation(0,0);
		
	    test.setLocation(75,810);
	    test.setBackground(Color.WHITE);
	    test.setSize(150,55);
	    
	    clear.setBackground(Color.WHITE);
	    clear.setLocation(300,810);
	    clear.setSize(150,55);
	
	    
	   test.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			bt.Test();
			
		}
	});
	   
	   clear.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i=1;i<=15;i++) {
		       
				sl.ChangeRow();
			
			sl.ChangeColumn();
			for(int l=1;l<=9;l++) {
				for(int j=1;j<=9;j++){
					if(button[l][j].getBackground()!=Color.WHITE) {
						
				       
					}
				
					}
				}
			
			
			}
			
			}
		
	});
 
		this.add(pnl1);
		this.add(test);
		this.add(clear);
	
     	this.setLayout(null);
         
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
         
	
		setButton();
		ButtonBorder();
		
		
	   sl.Solve();
	    RandomColor();
	   
	}
	

	public class ButtonClick extends MouseAdapter{
		
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mousePressed(e);
			
		    click++;
		
		    if(click>=10) {
		     click=click%9;	
		     
		    }
	
		   
		   if( e.getSource() instanceof JButton) {
			if(e.getButton() == MouseEvent.BUTTON1) {
				
            
            	 
            		
                 switch(click) {
                 
                 case 1:((JButton)e.getSource()).setBackground(Colors.MY_BLUE);  break; case 2:((JButton)e.getSource()).setBackground(Colors.MY_RED);  break;
                 case 3:((JButton)e.getSource()).setBackground(Colors.MY_GREEN); break; case 4:((JButton)e.getSource()).setBackground(Colors.MY_GREY);  break;
                 case 5:((JButton)e.getSource()).setBackground(Colors.MY_ORANGE);  break; case 6:((JButton)e.getSource()).setBackground(Colors.MY_PÝNK);  break;
                 case 7:((JButton)e.getSource()).setBackground(Colors.MY_PURPLE);  break; case 8:((JButton)e.getSource()).setBackground(Colors.MY_YELLOW);  break;
                 case 9:((JButton)e.getSource()).setBackground(Colors.MY_BROWN);  break;
                   }
                
            	
            }
             
		}
			else if(e.getButton() == MouseEvent.BUTTON3) {
			
				((JButton)e.getSource()).setBackground(Color.WHITE);
			
				click=0;
				
			}
		}
		
	}
	
	

	public void setButton() {
		
		
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++){
				button[i][j]=new JButton();
				button[i][j].setBackground(Color.WHITE);
				button[i][j].addMouseListener(new ButtonClick());
				button[i][j].setEnabled(true);
				pnl1.setSize(800,800);
				pnl1.setLayout(new GridLayout(9,9));
				pnl1.add(button[i][j]);
				
					
				}
				
			}
			
		
		}
		
	
	
	public void ButtonBorder() {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++){
				if(i==1||i==4||i==7) {
		button[i][1].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));
		button[i][2].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));			
		button[i][3].setBorder(BorderFactory.createMatteBorder(1,1,1,4,Color.BLACK));
		button[i][4].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));
		button[i][5].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));	
	    button[i][6].setBorder(BorderFactory.createMatteBorder(1,1,1,4,Color.BLACK));
		button[i][8].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));	
		button[i][9].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));	
	    button[i][9].setBorder(BorderFactory.createMatteBorder(1,1,1,4,Color.BLACK));
				}
				
				else if(i==2||i==5||i==8) {
					button[i][1].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));	
					button[i][2].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));	
					button[i][3].setBorder(BorderFactory.createMatteBorder(1,1,1,4,Color.BLACK));
					button[i][4].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));	
					button[i][5].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));	
					button[i][6].setBorder(BorderFactory.createMatteBorder(1,1,1,4,Color.BLACK));
					button[i][7].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));	
					button[i][8].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));	
					button[i][9].setBorder(BorderFactory.createMatteBorder(1,1,1,4,Color.BLACK));
					
					
				}
				
				else if(i==3||i==6) {
					//button[i][j].setBorder(BorderFactory.createMatteBorder(top, left, bottom, right, color));
					button[i][1].setBorder(BorderFactory.createMatteBorder(1,1,4,1,Color.BLACK));
					button[i][4].setBorder(BorderFactory.createMatteBorder(1,1,4,1,Color.BLACK));
					button[i][7].setBorder(BorderFactory.createMatteBorder(1,1,4,1,Color.BLACK));
					button[i][2].setBorder(BorderFactory.createMatteBorder(1,1,4,1,Color.BLACK));
					button[i][5].setBorder(BorderFactory.createMatteBorder(1,1,4,1,Color.BLACK));
					button[i][8].setBorder(BorderFactory.createMatteBorder(1,1,4,1,Color.BLACK));
					button[i][3].setBorder(BorderFactory.createMatteBorder(1,1,4,4,Color.BLACK));
				    button[i][6].setBorder(BorderFactory.createMatteBorder(1,1,4,4,Color.BLACK));
				    button[i][9].setBorder(BorderFactory.createMatteBorder(1,1,4,4,Color.BLACK));
					
				}
				else {
					button[i][1].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));	
					button[i][4].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));	
					button[i][5].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));	
					button[i][7].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));	
					button[i][8].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));	
					button[i][2].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));	
					button[i][3].setBorder(BorderFactory.createMatteBorder(1,1,1,4,Color.BLACK));
					button[i][6].setBorder(BorderFactory.createMatteBorder(1,1,1,4,Color.BLACK));
					button[i][9].setBorder(BorderFactory.createMatteBorder(1,1,1,4,Color.BLACK));
				}
				}
		}
		
	}
	
public void RandomColor() {
    
	for(int i=1;i<=35;i++) {
		int x=(int)((Math.random()*9)+1);
		int y=(int)((Math.random()*9)+1);
		
		button[x][y].setBackground(Color.WHITE);
	  
		
	}
	
}
}


