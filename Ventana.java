import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;




public class Ventana {
	JFrame frame= new JFrame();
	
	JMenuBar menubar= new JMenuBar();
	JMenu menu= new JMenu("Menu");
	JMenuItem abrir= new JMenuItem("Abrir");
	JMenuItem salir= new JMenuItem("Salir");
	JTextArea texto= new JTextArea("");
	
	JTextArea textarea= new JTextArea();
	JLabel nombretext= new JLabel();
	
	public Ventana()
	{
		frame.setTitle("Train Simulator 1885");   
		frame.setSize(1000, 600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(textarea);
		frame.add(nombretext);
		frame.add(menubar);
		textarea.setVisible(false);
		textarea.setBounds(10, 50, 700, 500);
		nombretext.setVisible(true);
		nombretext.setBounds(25, 30, 500, 10);

		
		menubar.add(menu);
		menubar.setBounds(0, 0, 1000, 20);
		menu.add(abrir=new JMenu("Abrir"));
		menu.add(salir= new JMenu("Salir"));
		
		
		
		
		
	}
 }
 

