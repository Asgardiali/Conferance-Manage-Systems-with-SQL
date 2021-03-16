package KonferansSistemi;

	import java.awt.Dimension;

	import javax.swing.BorderFactory;
	import javax.swing.JFrame;
	import javax.swing.JScrollPane;
	import javax.swing.JTextArea;

	public class TextArea {
	  public static void main(String[] args) {
		  
		  
	    JFrame f = new JFrame();
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JTextArea area = new JTextArea();
	    area.setLineWrap(true);
	    area.setWrapStyleWord(true);
	    area.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

	    f.add(new JScrollPane(area));
	    f.setSize(new Dimension(350, 300));

	    f.setLocationRelativeTo(null);
	    f.setVisible(true);
	    
	    
	  }
	}