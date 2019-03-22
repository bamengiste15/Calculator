//Bereket Mengiste
//bamengiste15@ole.augie.edu
//Calculator.java
import javax.swing.*;							
import java.awt.*; 							
import java.awt.event.*;	
public class Calculator extends JFrame implements ActionListener
{
	private JButton btnAdd = new JButton("+");					
	private JButton btnSubtract = new JButton("-");			
	private JButton btnMultiply = new JButton("*");			
	private JButton btnDivide = new JButton("/");
	private JButton btnSquareRoot = new JButton("sqrt");			
	public Calculator()							
	{
		addControls();								
		registerListeners();					
		setTitle("Calculator");						
		setSize(250,125);
		setLocationRelativeTo(null); 						
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );		
		setVisible(true);							
	}									
	public void addControls()							
	{
		setLayout(new GridLayout(1,4));				
		add(btnAdd);						
		add(btnSubtract);						
		add(btnMultiply);						
		add(btnDivide);	
		add(btnSquareRoot);				
	}									
	public void registerListeners()					
	{
		btnAdd.addActionListener(this);				
		btnSubtract.addActionListener(this);				
		btnMultiply.addActionListener(this);				
		btnDivide.addActionListener(this);
		btnSquareRoot.addActionListener(this);				
	}	
	public void actionPerformed(ActionEvent e)					
	{
		double result=0.0;
   		if(e.getSource() == btnAdd) 					
		{	
			String oper1 = JOptionPane.showInputDialog
							(null, "Operand1" , "0.0");	
			String oper2 = JOptionPane.showInputDialog
							(null, "Operand2" , "0.0");	
			double num1=Double.parseDouble(oper1);
			double num2=Double.parseDouble(oper2);
			result=num1+num2;				
			JOptionPane.showMessageDialog(null, oper1+"+"+oper2+
													"="+result);  		
		}
   		else if(e.getSource() == btnSubtract) 					
		{	
			String oper1 = JOptionPane.showInputDialog
							(null, "Operand1" , "0.0");	
			String oper2 = JOptionPane.showInputDialog
							(null, "Operand2" , "0.0");	
			double num1=Double.parseDouble(oper1);
			double num2=Double.parseDouble(oper2);
			result=num1-num2;				
			JOptionPane.showMessageDialog(null, oper1+"-"+oper2+
													"="+result);  		
		}
   		else if(e.getSource() == btnMultiply) 					
		{	
			String oper1 = JOptionPane.showInputDialog
							(null, "Operand1" , "0.0");	
			String oper2 = JOptionPane.showInputDialog
							(null, "Operand2" , "0.0");	
			double num1=Double.parseDouble(oper1);
			double num2=Double.parseDouble(oper2);
			result=num1*num2;				
			JOptionPane.showMessageDialog(null, oper1+"*"+oper2+
													"="+result);  		
		}
   		else if (e.getSource() == btnDivide) 					
		{	
			String oper1 = JOptionPane.showInputDialog
							(null, "Operand1" , "0.0");	
			String oper2 = JOptionPane.showInputDialog
							(null, "Operand2" , "0.0");	
			double num1=Double.parseDouble(oper1);
			double num2=Double.parseDouble(oper2);
			if(num2==0.0)
				JOptionPane.showMessageDialog
				(null, "Cannot divide by 0", "Error",
						  JOptionPane.ERROR_MESSAGE);
			else 
			{
				result=num1/num2;	
				JOptionPane.showMessageDialog(null, oper1+"/"+oper2+
														"="+result);
			}  		
		}
		else if (e.getSource() == btnSquareRoot)
		{
			String oper1 = JOptionPane.showInputDialog
							(null, "Operand1" , "0.0");	
			double num1=Double.parseDouble(oper1);
			if (num1<0)
				JOptionPane.showMessageDialog
				(null,"Cannot be a negative number","Error",
								 JOptionPane.ERROR_MESSAGE);
			else 
			{
				result= Math.sqrt(num1);
				JOptionPane.showMessageDialog(null, "sqrt("+oper1+
													 ")="+result);
			}
		}
	}									
	public static void main(String[] args)
   	{
		Calculator f=new Calculator();					
	}
}