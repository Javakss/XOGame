package guessmynumbergame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class xogame {

	private JFrame frame;
	
	int nowxoro=1;
	String temp;
	JLabel gamecomment = new JLabel("");
	boolean win=false;
	String computer="";
	
	JButton b9 = new JButton("");
	JButton b6 = new JButton("");
	JButton b3 = new JButton("");
	JButton b8 = new JButton("");
	JButton b5 = new JButton("");
	JButton b2 = new JButton("");
	JButton b7 = new JButton("");
	JButton b4 = new JButton("");	
	JButton b1 = new JButton("");
	private final JButton btnNewButton_1_1 = new JButton("Exit");
	Random randomob=new Random();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					xogame window = new xogame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public xogame() {
		initialize();
	}

	
	void tie(){
		
		
		if(nowxoro==9&&(gamecomment.getText()=="")) {
			gamecomment.setText("Both Loss Match Tie");

		}
		
		
			
		}
			
		
		
	
	void nowxoro() {
		
		nowxoro++;	
		
	}
	
	void wincheck() {
		
	
if(b1.getText()==b2.getText()&&b1.getText()==b3.getText()&&b2.getText()==b3.getText()) {
			
			
	temp=b1.getText()+b2.getText()+b3.getText();
			if(temp.equals("XXX")||temp.equals("OOO")) {
				gamecomment.setText("' "+b1.getText()+" is a Winner '");
				
			}
		
		}

 if(b1.getText()==b5.getText()&&b1.getText()==b9.getText()&&b9.getText()==b5.getText()) {
			
	temp=b1.getText()+b5.getText()+b9.getText();
	
	if(temp.equals("XXX")||temp.equals("OOO")) {
		gamecomment.setText("' "+b1.getText()+" is a Winner '");
		
	}		
			
			
		}

 if(b1.getText()==b4.getText()&&b1.getText()==b7.getText()&&b4.getText()==b7.getText()){
			
	temp=b1.getText()+b4.getText()+b7.getText();
	if(temp.equals("XXX")||temp.equals("OOO")) {
		gamecomment.setText("' "+b1.getText()+" is a Winner '");

	}
			
		}
 if(b2.getText()==b5.getText()&&b5.getText()==b8.getText()){
	
	temp=b2.getText()+b5.getText()+b8.getText();
	if(temp.equals("XXX")||temp.equals("OOO")) {
		gamecomment.setText("' "+b2.getText()+" is a Winner '");

	}	

}

 if(b3.getText()==b6.getText()&&b6.getText()==b9.getText()){
			
	temp=b3.getText()+b6.getText()+b9.getText();
	
	if(temp.equals("XXX")||temp.equals("OOO")) {
		
		gamecomment.setText("' "+b3.getText()+" is a Winner '");

	}
			
		}
		
if(b7.getText()==b8.getText()&&b8.getText()==b9.getText()){
			
			temp=b7.getText()+b8.getText()+b9.getText();
			if(temp.equals("XXX")||temp.equals("OOO")) {
				gamecomment.setText("' "+b7.getText()+" is a Winner '");

			}

		}
		
		if(b7.getText()==b5.getText()&&b5.getText()==b3.getText()){
			
			temp=b7.getText()+b5.getText()+b3.getText();
			if(temp.equals("XXX")||temp.equals("OOO")) {
				
				gamecomment.setText("' "+b7.getText()+" is a Winner '");

			}
			
		}
		 if(b4.getText()==b5.getText()&&b6.getText()==b5.getText()){
			
			temp=b4.getText()+b5.getText()+b6.getText();
			if(temp.equals("XXX")||temp.equals("OOO")) {
				gamecomment.setText("' "+b4.getText()+" is a Winner '");

			}
			
		}
		 tie();
		
	}
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 420, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 3, 3, 5, (Color) new Color(102, 204, 255)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 404, 339);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			b1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
			if(b1.getText().equals("")) {
				
				if(nowxoro%2!=0) {
					
					b1.setText("X");
					
					
					
					}else if(nowxoro%2==0) {
						
						b1.setText("O");
					}
				 	wincheck();
					nowxoro();	
				
			}
			
						
			}
		});
		
		b1.setForeground(Color.BLACK);
		
		b1.setBackground(new Color(102, 204, 255));
		b1.setBorder(BorderFactory.createLineBorder(Color.white));
		b1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		b1.setBounds(10, 11, 84, 75);
		panel.add(b1);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
				if(b4.getText().equals("")) {
					if(nowxoro%2!=0) {
						
						b4.setText("X");
						
					}else {
						
						b4.setText("O");
				
					}
					wincheck();
					nowxoro();
	
					
				}		
				
				
			}
		});
		
		b4.setForeground(Color.BLACK);
		
		b4.setBackground(new Color(102, 204, 255));
		b4.setFont(new Font("Times New Roman", Font.BOLD, 40));
		b4.setBounds(10, 97, 84, 75);
		b4.setBorder(BorderFactory.createLineBorder(Color.white));
		panel.add(b4);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
b7.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
				
				if(b7.getText().equals("")) {
					if(nowxoro%2!=0) {
						
						b7.setText("X");
										
									}else {
										
										b7.setText("O");
								
									}
					wincheck();
									nowxoro();		
					
					
				}	
			}
		});
		
		
		b7.setForeground(Color.BLACK);
		b7.setBackground(new Color(102, 204, 255));
		b7.setFont(new Font("Times New Roman", Font.BOLD, 40));
		b7.setBorder(BorderFactory.createLineBorder(Color.white));

		b7.setBounds(10, 183, 84, 75);
		panel.add(b7);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				b2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
				if(b2.getText().equals("")) {
					
					
					if(nowxoro%2!=0) {
						
						b2.setText("X");
										
									}else {
										
										b2.setText("O");
								
									}
					wincheck();
									nowxoro();	
					
				}

				
				
			}
		});
		
		
		b2.setForeground(Color.BLACK);
		b2.setBackground(new Color(102, 204, 255));
		b2.setFont(new Font("Times New Roman", Font.BOLD, 40));
		b2.setBorder(BorderFactory.createLineBorder(Color.white));

		b2.setBounds(104, 11, 84, 75);
		panel.add(b2);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b5.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
				if(b5.getText().equals("")) {
					
					if(nowxoro%2!=0) {
				   		
			   			 b5.setText("X");
							
						}else {
						
				
							
								b5.setText("O");
					
						}
					wincheck();
						nowxoro();	
					
					
				}
					
				
			}
		});
		
		
		
		b5.setForeground(Color.BLACK);
		b5.setBackground(new Color(102, 204, 255));
		b5.setFont(new Font("Times New Roman", Font.BOLD, 40));
		b5.setBorder(BorderFactory.createLineBorder(Color.white));

		b5.setBounds(104, 97, 84, 75);
		panel.add(b5);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
b8.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
				
				if(b8.getText().equals("")) {
					
					if(nowxoro%2!=0) {
						
						b8.setText("X");
										
					}else {
								
						b8.setText("O");
								
									}
					
									wincheck();
									nowxoro();
	
					
				}	
			}
		});
		
		
		
		b8.setForeground(Color.BLACK);
		b8.setBackground(new Color(102, 204, 255));
		b8.setFont(new Font("Times New Roman", Font.BOLD, 40));
		b8.setBorder(BorderFactory.createLineBorder(Color.white));

		b8.setBounds(104, 183, 84, 75);
		panel.add(b8);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
b3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
				
				
				if(b3.getText().equals("")) {
					if(nowxoro%2!=0) {
						
						b3.setText("X");
										
									}else {
								
										b3.setText("O");
								
									}
					wincheck();
									nowxoro();	
					
				}	
				
			}
		});
		
		
		b3.setForeground(Color.BLACK);
		b3.setBackground(new Color(102, 204, 255));
		b3.setFont(new Font("Times New Roman", Font.BOLD, 40));
		b3.setBorder(BorderFactory.createLineBorder(Color.white));

		b3.setBounds(198, 11, 84, 75);
		panel.add(b3);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				b6.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
				
				if(b6.getText().equals("")) {
					
					if(nowxoro%2!=0) {
						
						b6.setText("X");
										
									}else {
									
										b6.setText("O");
								
									}
					
					wincheck();
									nowxoro();		
					
					
				}
			}
		});
		
		
		
		b6.setForeground(Color.BLACK);
		b6.setBackground(new Color(102, 204, 255));
		b6.setFont(new Font("Times New Roman", Font.BOLD, 40));
		b6.setBorder(BorderFactory.createLineBorder(Color.white));

		b6.setBounds(198, 97, 84, 75);
		panel.add(b6);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
b9.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
				
				if(b9.getText().equals("")) {
					
					if(nowxoro%2!=0) {
						
						b9.setText("X");
										
									}else {
								
										b9.setText("O");
								
									}
					
					wincheck();
									nowxoro();
	
				}
				
			}
		});
		
	
		
		b9.setForeground(Color.BLACK);
		b9.setBackground(new Color(102, 204, 255));
		
		b9.setFont(new Font("Times New Roman", Font.BOLD, 40));
		b9.setBorder(BorderFactory.createLineBorder(Color.white));

		b9.setBounds(198, 183, 84, 75);
		panel.add(b9);
		gamecomment.setForeground(new Color(0, 0, 0));
		
		gamecomment.setFont(new Font("Times New Roman", Font.BOLD, 39));
		gamecomment.setBounds(10, 271, 384, 57);
		panel.add(gamecomment);
		
		JButton btnNewButton = new JButton("Restart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nowxoro=1;
				temp="";
			
				gamecomment.setText("");
				b1.setText("");
				b1.setBorder(BorderFactory.createLineBorder(Color.white));
				b2.setText("");
				b2.setBorder(BorderFactory.createLineBorder(Color.white));
				b3.setText("");
				b3.setBorder(BorderFactory.createLineBorder(Color.white));
				b4.setText("");
				b4.setBorder(BorderFactory.createLineBorder(Color.white));
				b5.setText("");
				b5.setBorder(BorderFactory.createLineBorder(Color.white));
				b6.setText("");
				b6.setBorder(BorderFactory.createLineBorder(Color.white));
				b7.setText("");
				b7.setBorder(BorderFactory.createLineBorder(Color.white));
				b8.setText("");
				b8.setBorder(BorderFactory.createLineBorder(Color.white));
				b9.setText("");
				b9.setBorder(BorderFactory.createLineBorder(Color.white));

				
				
				
			}
		});
		btnNewButton.setForeground(new Color(255, 51, 204));
		btnNewButton.setBorder(BorderFactory.createLineBorder(Color.pink,2));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton.setBounds(292, 92, 102, 42);
		panel.add(btnNewButton);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				
				
			}
		});
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton_1_1.setBounds(292, 145, 102, 42);
		
		panel.add(btnNewButton_1_1);
	}
}
