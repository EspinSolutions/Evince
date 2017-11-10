package com.espinsolutions.evince.menu;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;

	// Fonts
	private Font number = new Font("Futura", Font.BOLD, 60);
	private Font heading = new Font("Futura", Font.PLAIN, 20);
	
	// Images
	private JLabel usersSquare = new JLabel();
	private JLabel hoursSquare = new JLabel();
	private JLabel daysSquare = new JLabel();
	
	// Navigation
//	private JLabel logo = new JLabel();
//	private JButton dashboard = new JButton();
//	private JButton leaderboards = new JButton();
//	private JButton search = new JButton();
//	private JButton about = new JButton();
//	private JButton admin = new JButton();
//	private JButton create = new JButton(); // this one should be green or smth in a box
	
	// Text
	private JLabel usersText = new JLabel();
	private JLabel hoursText = new JLabel();
	private JLabel daysText = new JLabel();
	
	private JLabel subUsersText = new JLabel();
	private JLabel subHoursText = new JLabel();
	private JLabel subDaysText = new JLabel();
	
	public Dashboard() {
		
		setTitle("Evince | Dashboard");
		setName("Evince | Dashboard");
		setSize(1000, 750);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(227, 228, 232));
		
		// Users
		usersText.setFont(number);
		usersText.setForeground(Color.WHITE);
		usersText.setBounds(125, 150, 100, 100);
		usersText.setText("12");
		
		subUsersText.setFont(heading);
		subUsersText.setForeground(Color.WHITE);
		subUsersText.setBounds(105, 200, 300, 100);
		subUsersText.setText("users registered");

		// Hours
		hoursText.setFont(number);
		hoursText.setForeground(Color.WHITE);
		hoursText.setBounds(450, 150, 200, 100);
		hoursText.setText("10");
		
		subHoursText.setFont(heading);
		subHoursText.setForeground(Color.WHITE);
		subHoursText.setBounds(430, 200, 300, 100);
		subHoursText.setText("hours tracked");
		
		// Days
		daysText.setFont(number);
		daysText.setForeground(Color.WHITE);
		daysText.setBounds(775, 150, 200, 100);
		daysText.setText("83");
		
		subDaysText.setFont(heading);
		subDaysText.setForeground(Color.WHITE);
		subDaysText.setBounds(775, 200, 100, 100);
		subDaysText.setText("days left");
		
		// Squares
		usersSquare.setIcon(new ImageIcon(getClass().getResource("/resources/usersSquare.png")));
		usersSquare.setBounds(27, 120, 300, 200);
		
		hoursSquare.setIcon(new ImageIcon(getClass().getResource("/resources/hoursSquare.png")));
		hoursSquare.setBounds(347, 120, 300, 200);
		
		daysSquare.setIcon(new ImageIcon(getClass().getResource("/resources/daysSquare.png")));
		daysSquare.setBounds(667, 120, 300, 200);
		
		add(usersText);
		add(hoursText);
		add(daysText);
		
		add(subUsersText);
		add(subHoursText);
		add(subDaysText);
		
		add(usersSquare);
		add(hoursSquare);
		add(daysSquare);
		
		setVisible(true);
		
	}
	
}
