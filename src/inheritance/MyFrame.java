package inheritance;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("나도 Frame이다.");
        this.setBounds(500,400,400,200);

    }
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setVisible(true);
    }
}
