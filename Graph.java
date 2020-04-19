import java.awt.*;
public class Graph {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(220,150);
		panel.setBackground(Color.YELLOW);  //set yellow background
		Graphics g = panel.getGraphics();
		
		//draw two identical blue ovals
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		g.fillOval(130, 25, 40, 40);
		
		
		//draw a red rectangle
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		
		//draw a black line
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);
		
		
	}
}
