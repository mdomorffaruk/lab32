import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

class TestDRAW extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int x1 = 50; // Starting x-coordinate
        int y1 = 50; // Starting y-coordinate
        int x2 = 200; // Ending x-coordinate
        int y2 = 200; // Ending y-coordinate
        g2d.drawLine(x1, y1, x2, y2);
        // Draw a dot
        int dotX = 150; // X-coordinate for the dot
        int dotY = 100; // Y-coordinate for the dot
        drawADot(g2d, dotX, dotY);
//        for (int i = 0; i < 100; i++) {
//            drawADot(g2d, i, i+5);
//        }
    }
    private void drawADot(Graphics2D g2d, int x, int y) {
        int dotSize = 5; // Size of the dot
        g2d.fillOval(x - dotSize / 2, y - dotSize / 2, dotSize, dotSize);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Line Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TestDRAW());
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
