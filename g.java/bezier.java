
//int main()
//{
//int x[4],y[4],i;
//double put_x,put_y,t;
//int gr=DETECT,gm;
//initgraph(&gr,&gm,"C:\\TURBOC3\\BGI");
//printf("\n****** Bezier Curve ***********");
//printf("\n Please enter x and y coordinates ");
//for(i=0;i<4;i++)
//{
//scanf("%d%d",&x[i],&y[i]);
//putpixel(x[i],y[i],3);                // Control Points
//}
//
//for(t=0.0;t<=1.0;t=t+0.001)             // t always lies between 0 and 1
//{
//put_x = pow(1-t,3)*x[0] + 3*t*pow(1-t,2)*x[1] + 3*t*t*(1-t)*x[2] + pow(t,3)*x[3]; // Formula to draw curve
//put_y =  pow(1-t,3)*y[0] + 3*t*pow(1-t,2)*y[1] + 3*t*t*(1-t)*y[2] + pow(t,3)*y[3];
//putpixel(put_x,put_y, WHITE);            // putting pixel
//}
//getch();
//closegraph();
//}


// Input 200 300
/*300 400
300 300
100 100*/



import java.awt.*;

import javax.swing.*;

import java.util.Scanner;

import static java.lang.Math.pow;

class bezier extends JPanel {

    private static final int W = 400;
    private static final int H = 400;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double putX , putY,t;
        System.out.println("\\n****** Bezier Curve ***********");
        System.out.println("\\n Please enter x and y coordinates");
        int[] x = new int[4];
        int[] y = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("x:");
            x[i] = sc.nextInt();
            System.out.print("\ty:");
            y[i] = sc.nextInt();


        }
        JFrame frame = new JFrame("Line Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new bezier());
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
//double put_x,put_y,t;
//int gr=DETECT,gm;
//initgraph(&gr,&gm,"C:\\TURBOC3\\BGI");
//printf("\n****** Bezier Curve ***********");
//printf("\n Please enter x and y coordinates ");
//for(i=0;i<4;i++)
//{
//scanf("%d%d",&x[i],&y[i]);
//putpixel(x[i],y[i],3);                // Control Points
//}
//
//for(t=0.0;t<=1.0;t=t+0.001)             // t always lies between 0 and 1
//{
//put_x = pow(1-t,3)*x[0] + 3*t*pow(1-t,2)*x[1] + 3*t*t*(1-t)*x[2] + pow(t,3)*x[3]; // Formula to draw curve
//put_y =  pow(1-t,3)*y[0] + 3*t*pow(1-t,2)*y[1] + 3*t*t*(1-t)*y[2] + pow(t,3)*y[3];
//putpixel(put_x,put_y, WHITE);            // putting pixel
//}
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);

        System.out.println("test");
        //int x[4],y[4],i;
        int[] x = new int[4];
        int[] y = new int[4];
        Scanner sc = new Scanner(System.in);
        double putX , putY,t;
        System.out.println("\\n****** Bezier Curve ***********");
        System.out.println("\\n Please enter x and y coordinates");
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < 4; i++) {
            System.out.println("x:");
            x[i] = sc.nextInt();
            System.out.print("\ty:");
            y[i] = sc.nextInt();
            drawADot(g2, x[i], y[i]);

        }
        
        for (t = 0.0; t <=1.0; t=t+0.001) {
            putX = pow(1-t,3)*x[0] + 3*t*pow(1-t,2)*x[1] + 3*t*t*(1-t)*x[2] + pow(t,3)*x[3]; // Formula to draw curve
            putY =  pow(1-t,3)*y[0] + 3*t*pow(1-t,2)*y[1] + 3*t*t*(1-t)*y[2] + pow(t,3)*y[3];
            g2.drawRect((int)putX, (int)putY, 2, 2);
        }

    }

    private void drawADot(Graphics2D g2d, int x, int y) {
        int dotSize = 5; // Size of the dot
        g2d.fillOval(x - dotSize / 2, y - dotSize / 2, dotSize, dotSize);
    }
}

