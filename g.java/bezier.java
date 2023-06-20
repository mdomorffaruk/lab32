
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


import javax.swing.*;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

class bezier extends JFrame {

    private static final int W = 400;
    private static final int H = 400;


    public static void main(String[] args) {
//        Frame bezierCurveFrame = new Frame("BezierCurveFrame");
//        bezierCurveFrame.setSize(W,H);
//        Applet bezierApplet = new bezier();
//        bezierCurveFrame.add(bezierApplet);
//        bezierCurveFrame.setVisible(true);
//        bezierCurveFrame.addWindowFocusListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                super.windowClosing(e);
//            }
//        });

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

//        System.out.println("test");
//        //int x[4],y[4],i;
//        int[] x = new int[4];
//        int[] y = new int[4];
//        Scanner sc = new Scanner(System.in);
//        double putX , putY,t;
//        System.out.println("\\n****** Bezier Curve ***********");
//        System.out.println("\\n Please enter x and y coordinates");
//        Graphics g;
//        for (int i = 0; i < 4; i++) {
//            System.out.println("x:");
//            x[i] = sc.nextInt();
//            System.out.print("\ty:");
//            y[i] = sc.nextInt();
//            paint()
//
//        }
//        for (t = 0.0; t <=1.0; t=t+0.001) {
//
//        }

    }
}

