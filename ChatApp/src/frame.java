import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class frame {
	static String LatestUser;
	static JButton button;
public static void main(String[] args) {
		
	//ImageIcon icon = new ImageIcon("");
	button = new JButton();
	button.setBounds(200, 100, 100, 50);
	//button.addActionListener(e -> {
	//	try {
	//		input = LatestUser;
	//	} catch (Exception e1) {
	//		e1.printStackTrace();
		
		button.setText("Create");
		button.setFocusable(false);
		//button.getHorizontalTextPosition(); 
		//button.getVerticalTextPosition();
		// if I want to add image to the button and align text accordingly
		button.setFont(new Font("MV Boli",Font.PLAIN,25));
		button.setIconTextGap(-15);
		button.setForeground(Color.black);
		button.setBackground(Color.green);
		button.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	
	Border border = BorderFactory.createLineBorder(Color.black, 3);
	JLabel label = new JLabel();
	label.setText("Welcome, Sign in below ");
	label.setForeground(Color.green);
	label.setFont(new Font("MV Boli",Font.BOLD, 30));
	label.setBackground(Color.black);
	label.setOpaque(true);
	label.setBorder(border);
	label.setVerticalAlignment(JLabel.TOP);
	label.setHorizontalAlignment(JLabel.CENTER);
	//label.setHorizontalTextPosition(JLabel.CENTER);
	//label.setVerticalTextPosition(JLabel.TOP);
	// if I want to add image to the label and align text accordingly
	
	JFrame frame = new JFrame();
	frame.setSize(500,500);
	frame.setVisible(true);
	frame.setTitle("#MartinRatted");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.add(label);
	frame.add(button);
	frame.setLayout(null);
	
	//layout when logged in
	class whenLoggedIn extends JFrame implements ActionListen {
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());
		frame
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);
		
		panel1.setPrefferedSize(new Dimension(100,100));
		panel2.setPrefferedSize(new Dimension(100,100));
		panel3.setPrefferedSize(new Dimension(100,100));
		panel4.setPrefferedSize(new Dimension(100,100));
		panel5.setPrefferedSize(new Dimension(100,100));
		
		frame.add(panel1,BorderLayout.North);
		frame.add(panel2,BorderLayout.west);
		frame.add(panel3,BorderLayout.east);
		frame.add(panel4,BorderLayout.south);
		frame.add(panel5,BorderLayout.center);
	}
		
		//layout when signed in but not logged in
		class whenLoggingIn {
			
		}
		
		
	
	
	
	
	
	
	
	
	//ImageIcon image = new ImageIcon(); 
	//frame.setIconImage(image.getImage());
	//insert name of picture after putting it in project
	//frame.getContentPane().setBackground(new Color(0,0,0));	
	
}


	
