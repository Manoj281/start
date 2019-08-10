import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//It is of course possible to define externally the action listener class as follows.

class MyActionListener implements ActionListener{
	public MyActionListener(String msg){
		this.msg = msg;
	}
	public void actionPerformed(ActionEvent e){
		System.out.println(msg);
	}
	String msg;
}
