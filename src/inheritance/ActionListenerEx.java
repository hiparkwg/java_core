// class와 interface 동시에 상속받기

package inheritance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;;

public class ActionListenerEx extends JFrame implements ActionListener{

   JButton btn;
   ActionListenerEx(){

      btn = new JButton("OK");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLayout(null);
      this.setTitle("나도 Frame이다.");
      this.add(btn);
      btn.setBounds(40, 40, 100, 40);
      btn.addActionListener(this);
      this.setBounds(500,400,400,200);

   }


	@Override
	public void actionPerformed(ActionEvent e) {
      System.out.println("OK.");
	}

   public static void main(String[] args) {
      ActionListenerEx mf = new ActionListenerEx();
      mf.setVisible(true);		
      
   }

}
