package src.Laba2;

import java.awt.event.*;
import javax.swing.*;

public class NewWindow extends AbstractAction {
	private static JLabel lineLable1;
	private String wh;

	private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e) {
		
		JFrame info = new JFrame("Информация");
		info.setBounds(500,400,400,300);
		
		JLabel infoR = new JLabel("Юлия Реутова - 816");
		infoR.setBounds(130, 50, 300, 50);
		
		JLabel infoA = new JLabel("Алсу Ахмадуллина - 389");
		infoA.setBounds(130, 90, 300, 50);

		
		JButton returnToMainButton = new JButton("Выход");
		returnToMainButton.setBounds(100,200,200,30);
		info.add(returnToMainButton);
		returnToMainButton.addActionListener(m -> {
			info.dispose();
			
		});

		subversion subver = new subversion(wh);
		lineLable1 = new JLabel("Ваши пожелания:" + wh);
		lineLable1.setBounds(130, 140, 300, 50);


		info.add(infoR);
		info.add(infoA);
		info.add(lineLable1);
		info.setSize(400,400);
		info.setLayout(null);
		info.setVisible(true);
	}

	//public static void newWindow(String wh) {
		//subversion subver = new subversion(wh);
		//lineLable1 = new JLabel("Ваши пожелания:" + wh);
		//lineLable1.setBounds(130, 140, 300, 50);

	//}
}
