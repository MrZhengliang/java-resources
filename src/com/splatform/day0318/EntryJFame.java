package com.splatform.day0318;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * <p>
 * descrption:
 * </p>
 * 
 * @author
 * @date 2015年3月18日
 * @Copyright
 */
public class EntryJFame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2701097547465264713L;
	
	
	public static void main(String[] args) {
		System.out.println("321123");
		EntryJFame ejf = new EntryJFame();
	}
	
	
	// 定义组件
	JLabel jl1, jl2;
	JTextField jtf1;
	JPasswordField jpf1;
	JCheckBox jcb1;
	JButton jb1;
	JPanel jp1;
	JButton jb2;

	public EntryJFame() {
		// 创建组件
		jl1 = new JLabel("用户名", JLabel.LEFT);

		jl2 = new JLabel("密码", JLabel.LEFT);

		jtf1 = new JTextField(5);
		jpf1 = new JPasswordField(5);
		jcb1 = new JCheckBox("记住我的登录状态");

		jb2 = new JButton(new ImageIcon(
				"C:\\Documents and Settings\\Administrator\\桌面\\JButton2.jpg"));
		jp1 = new JPanel();

		ImageIcon img = new ImageIcon(
				"C:\\Documents and Settings\\Administrator\\桌面\\登录界面.png");
		JLabel imgLabel = new JLabel(img);
		getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
		// 注意这里是关键，将背景标签添加到jfram的LayeredPane面板里。
		imgLabel.setBounds(0, 0, 980, 580);
		// 设置背景标签的位置
		Container cp = this.getContentPane();
		cp.setLayout(new BorderLayout());
		((JComponent) cp).setOpaque(false);

		// jp1.setOpaque(false);
		setFont(new Font("Helvetica", Font.PLAIN, 14));
		// 设置布局
		jp1.setLayout(new GridLayout(3, 3));
		// 添加组件
		jp1.add(jl1);
		jp1.add(jtf1);
		jp1.add(jl2);
		
		jp1.add(jpf1);
		jp1.add(jcb1);
		jp1.add(jb2);

		this.add(jp1, BorderLayout.SOUTH);

		// 设置窗体属性
		this.setSize(320,480);
		//this.setSize(980, 580);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}
}
