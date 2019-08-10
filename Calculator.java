import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField textfield1, textfield2, textfield3;
	
    JButton button1 = new JButton("+");
    JButton button2 = new JButton("-");
    JLabel l1 = new JLabel("Input1");
    JLabel l2 = new JLabel("Input2");
    JLabel l3 = new JLabel("Output");
  

    public Calculator() {
        initUI();
    }

    public final void initUI() {
    	
        textfield1 = new JTextField("",10);
        textfield2 = new JTextField("",10);
        textfield3 = new JTextField("",20);
        
	    l1.setBounds(10,20,100,30);
	    textfield1.setBounds(60,20,100,30);
	    l2.setBounds(10,50,100,30);
	    textfield2.setBounds(60,50,100,30);
        button1.setBounds(50, 85, 20, 20);
        button2.setBounds(80, 85, 20, 20);
        l3.setBounds(10,120,100,30);
        textfield3.setBounds(60,120,100,30);
		getContentPane().setLayout(null);
		getContentPane().add(textfield1);
		getContentPane().add(textfield2);
        getContentPane().add(button1);
        getContentPane().add(button2);
        getContentPane().add(textfield3);
        getContentPane().add(l2);
        getContentPane().add(l1);
        getContentPane().add(l3);

        button1.setEnabled(true);
        button2.setEnabled(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	
    public void actionPerformed(ActionEvent e){
				Double x = getTextField1();
				Double y = getTextField2();
				Double z = (double) 0;
				
				if(button2.isSelected()) {
					z = x - y;
				}
				else if (button1.isSelected()) {
					z = x + y;
				}
				
				setTextField3(z);
		}
    
    private void setTextField3(Double z) {
		// TODO Auto-generated method stub
    	//System.out.print(z);
    	String s = Double.toString(z);
    	textfield3.setText(s);
		
	}

	private Double getTextField2() {
		// TODO Auto-generated method stub
		String s = textfield2.getText();
		Double i1 = Double.parseDouble(s);
		return i1;
	}

	private Double getTextField1() {
		// TODO Auto-generated method stub
		String s = textfield1.getText();
		Double i1 = Double.parseDouble(s);
		return i1;
	}

	public static void main(String[] args) {
        Calculator ex = new Calculator();
        ex.setVisible(true);
    }
}
