import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TakeInput extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TakeInput() {
       setTitle("Simple example");
       setSize(300, 200);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       TakeInput ex = new TakeInput();
       ex.setVisible(true);
    }
}
