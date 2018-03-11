import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;

public class ControllerV2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_8;
	private JTextField textField_7;
	private JTextField textField_6;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;

	private JLabel name0;
	private JLabel name1;
	private JLabel name2;
	private JLabel name3;
	private JLabel name4;
	private JLabel name5;
	private JLabel name8;
	private JLabel name7;
	private JLabel name6;
	private JLabel name9;
	private JLabel name10;
	private JLabel name11;
	private JLabel name30;
	private JLabel name31;
	private JLabel name32;
	private JLabel name33;
	private JLabel name34;
	private JLabel name35;
	private JLabel name60;
	private JLabel name61;
	private JLabel name62;
	private JLabel name63;
	private JLabel name64;
	private JLabel name65;
	private JLabel name12;
	private JLabel name13;
	private JLabel name14;
	private JLabel name15;
	private JLabel name16;
	private JLabel name17;
	private JLabel name18;
	private JLabel name19;
	private JLabel name20;
	private JLabel name21;
	private JLabel name22;
	private JLabel name23;
	private JLabel name24;
	private JLabel name25;
	private JLabel name26;
	private JLabel name27;
	private JLabel name28;
	private JLabel name29;
	private JLabel name36;
	private JLabel name37;
	private JLabel name38;
	private JLabel name39;
	private JLabel name40;
	private JLabel name41;
	private JLabel name42;
	private JLabel name43;
	private JLabel name44;
	private JLabel name45;
	private JLabel name46;
	private JLabel name47;
	private JLabel name48;
	private JLabel name49;
	private JLabel name50;
	private JLabel name51;
	private JLabel name52;
	private JLabel name53;
	private JLabel name54;
	private JLabel name55;
	private JLabel name56;
	private JLabel name57;
	private JLabel name58;
	private JLabel name59;
	private JLabel name66;
	private JLabel name67;
	private JLabel name68;
	private JLabel name69;
	private JLabel name70;
	private JLabel name71;
	private JLabel name72;
	private JLabel name73;
	private JLabel name74;
	private JLabel name75;
	private JLabel name76;
	private JLabel name77;

	private JToggleButton win1;
	private JToggleButton win2;
	private JToggleButton win3;
	private JToggleButton win4;
	private JToggleButton win5;
	private JToggleButton win6;
	private JToggleButton win7;
	private JToggleButton win8;
	private JToggleButton win9;
	private JToggleButton win10;
	private JToggleButton win11;
	private JToggleButton win12;
	private JToggleButton win13;
	private JToggleButton win14;
	private JToggleButton win15;
	private JToggleButton win16;
	private JToggleButton win17;
	private JToggleButton win18;
	private JToggleButton win19;
	private JToggleButton win20;
	private JToggleButton win21;
	private JToggleButton win22;
	private JToggleButton win23;
	private JToggleButton win24;
	private JToggleButton win25;
	private JToggleButton win26;
	
	private ArrayList<JToggleButton> buttons;
	private ArrayList<JTextField> mobiePoints;
	private ArrayList<JTextArea> speakerPoints;
	private ArrayList<JLabel> names;

	private ArrayList<Indiv> allContestants;
	private JTextField txtRound;

	private int round;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControllerV2 frame = new ControllerV2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ControllerV2() {
		setTitle("SPARK Debating Tabulation");
		allContestants = new ArrayList<Indiv>();
		buttons = new ArrayList<JToggleButton>();
		mobiePoints = new ArrayList<JTextField>();
		speakerPoints = new ArrayList<JTextArea>();
		names = new ArrayList<JLabel>();
		round = 1;

		allContestants.add(new Indiv("Yung Chun Hin"));
		allContestants.add(new Indiv("Ethan Nicholas Chan"));
		allContestants.add(new Indiv("Gabrielle Luk"));
		allContestants.add(new Indiv("Lam Tung Kiu")); 
		allContestants.add(new Indiv("Tony Hon"));
		allContestants.add(new Indiv("Rachel Lu")); 

		allContestants.add(new Indiv("Nida Khan"));
		allContestants.add(new Indiv("Simon Yung"));
		allContestants.add(new Indiv("See Tin Wing Jamie")); 
		allContestants.add(new Indiv("Eunice Chong"));
		allContestants.add(new Indiv("So Hin Ka"));
		allContestants.add(new Indiv("Christina Kwok"));

		allContestants.add(new Indiv("Eunice Ng Hei Yin"));
		allContestants.add(new Indiv("Tina Wong"));
		allContestants.add(new Indiv("Abdullah Shek Yiu Lun Benjamin"));
		allContestants.add(new Indiv("Choi Yuk Chai Vito"));
		allContestants.add(new Indiv("Yeung Kit Yee Lilian"));
		allContestants.add(new Indiv("Gloria Ly"));

		allContestants.add(new Indiv("Bill Kot"));
		allContestants.add(new Indiv("Matthew Chiu"));
		allContestants.add(new Indiv("Belle Ho"));
		allContestants.add(new Indiv("Christie Cheng"));
		allContestants.add(new Indiv("Esther Tam"));
		allContestants.add(new Indiv("Leo Lai"));

		allContestants.add(new Indiv("Jason Cheng Chi Ho"));
		allContestants.add(new Indiv("Chan Ching Muk"));
		allContestants.add(new Indiv("Lorraine Tan"));
		allContestants.add(new Indiv("Choi Yuet Chai Tiger"));
		allContestants.add(new Indiv("Mark Wong Long Hin"));
		allContestants.add(new Indiv("Emi Otsuki"));

		allContestants.add(new Indiv("Aaditya Vora"));
		allContestants.add(new Indiv("Lam Gloria"));
		allContestants.add(new Indiv("Lam Yeung Ching"));
		allContestants.add(new Indiv("Wesley Wong"));
		allContestants.add(new Indiv("Angie Wong Hui Ching"));
		allContestants.add(new Indiv("Douglas Yang"));

		allContestants.add(new Indiv("Franco Lau"));
		allContestants.add(new Indiv("Yu Han Daisy Wang"));
		allContestants.add(new Indiv("Helen Chau"));
		allContestants.add(new Indiv("Sebastian Ching (UNTIL R3)"));
		allContestants.add(new Indiv("Thomas So"));
		allContestants.add(new Indiv("Gianna Lai")); 

		allContestants.add(new Indiv("Carolyn Chan"));
		allContestants.add(new Indiv("Yuen Ho Yi Holly"));
		allContestants.add(new Indiv("Yoyo Fong"));
		allContestants.add(new Indiv("Madeleine Wu"));
		allContestants.add(new Indiv("Mandy (ISF)"));
		allContestants.add(new Indiv("Simranprit Kaur"));

		allContestants.add(new Indiv("Vanessa Woo"));
		allContestants.add(new Indiv("Audrey Chow"));
		allContestants.add(new Indiv("Jenkin Yuen"));
		allContestants.add(new Indiv("Ng Yuen Man"));
		allContestants.add(new Indiv("Eiscen Caagbay"));
		allContestants.add(new Indiv("Sam Tsang"));

		allContestants.add(new Indiv("Harsh Jaluka"));
		allContestants.add(new Indiv("Edward Li"));
		allContestants.add(new Indiv("Khan Ammarah"));
		allContestants.add(new Indiv("Wong Yui Him"));
		allContestants.add(new Indiv("Peter Li"));
		allContestants.add(new Indiv("Chan Sum Yu"));

		allContestants.add(new Indiv("Anisa Wong"));
		allContestants.add(new Indiv("Samuel Cheung"));
		allContestants.add(new Indiv("Angela Yiu Chi Yuet"));
		allContestants.add(new Indiv("Wong King Sang Tommy"));
		allContestants.add(new Indiv("Lucas Szeto"));
		allContestants.add(new Indiv("Nicole Ho Lok Yin"));

		allContestants.add(new Indiv("Chan Daniel Lian"));
		allContestants.add(new Indiv("Nicole Lam"));
		allContestants.add(new Indiv("Genevieve Yeung"));
		allContestants.add(new Indiv("Caitlin Chung"));
		allContestants.add(new Indiv("Cyrus Wong"));
		allContestants.add(new Indiv("Amber Yeung"));

		allContestants.add(new Indiv("Alicia Lam"));
		allContestants.add(new Indiv("Fanny Fung"));
		allContestants.add(new Indiv("Abigail Wong"));
		allContestants.add(new Indiv("Tony Tam"));
		allContestants.add(new Indiv("Amelia Lee"));
		allContestants.add(new Indiv("Joy Chi"));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1072, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		int i = 0;

		name0 = new JLabel(allContestants.get(i).getName()); i++;
		name0.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name0.setBounds(16, 25, 56, 18);
		contentPane.add(name0);

		win1 = new JToggleButton("Win?");
		win1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win1.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win1.setBounds(82, 6, 27, 18);
		contentPane.add(win1);

		textField_0 = new JTextField();
		textField_0.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_0.setBounds(75, 25, 49, 23);
		contentPane.add(textField_0);
		textField_0.setColumns(10);

		name1 = new JLabel(allContestants.get(i).getName()); i++;
		name1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name1.setBounds(16, 45, 56, 18);
		contentPane.add(name1);

		name2 = new JLabel(allContestants.get(i).getName()); i++;
		name2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name2.setBounds(16, 64, 56, 18);
		contentPane.add(name2);

		JLabel lblTeam1 = new JLabel("Team 1 1G");
		lblTeam1.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam1.setBounds(16, 5, 56, 18);
		contentPane.add(lblTeam1);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_1.setColumns(10);
		textField_1.setBounds(75, 43, 49, 23);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_2.setColumns(10);
		textField_2.setBounds(75, 62, 49, 23);
		contentPane.add(textField_2);

		JLabel lblTeam2 = new JLabel("Team 2 1G");
		lblTeam2.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam2.setBounds(191, 5, 56, 18);
		contentPane.add(lblTeam2);

		win2 = new JToggleButton("Win?");
		win2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win2.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win2.setBounds(257, 6, 27, 18);
		contentPane.add(win2);

		name3 = new JLabel(allContestants.get(i).getName()); i++;
		name3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name3.setBounds(191, 25, 56, 18);
		contentPane.add(name3);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_3.setColumns(10);
		textField_3.setBounds(250, 25, 49, 23);
		contentPane.add(textField_3);

		name4 = new JLabel(allContestants.get(i).getName()); i++;
		name4.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name4.setBounds(191, 45, 56, 18);
		contentPane.add(name4);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_4.setColumns(10);
		textField_4.setBounds(250, 43, 49, 23);
		contentPane.add(textField_4);

		name5 = new JLabel(allContestants.get(i).getName()); i++;
		name5.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name5.setBounds(191, 64, 56, 18);
		contentPane.add(name5);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_5.setColumns(10);
		textField_5.setBounds(250, 62, 49, 23);
		contentPane.add(textField_5);

		JLabel lblTeam3 = new JLabel("Team 3 1F");
		lblTeam3.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam3.setBounds(16, 86, 56, 18);
		contentPane.add(lblTeam3);

		textField_6 = new JTextField();
		textField_6.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_6.setColumns(10);
		textField_6.setBounds(75, 106, 49, 23);
		contentPane.add(textField_6);

		name6 = new JLabel(allContestants.get(i).getName()); i++;
		name6.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name6.setBounds(16, 106, 56, 18);
		contentPane.add(name6);

		name7 = new JLabel(allContestants.get(i).getName()); i++;
		name7.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name7.setBounds(16, 126, 56, 18);
		contentPane.add(name7);

		textField_7 = new JTextField();
		textField_7.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_7.setColumns(10);
		textField_7.setBounds(75, 124, 49, 23);
		contentPane.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_8.setColumns(10);
		textField_8.setBounds(75, 143, 49, 23);
		contentPane.add(textField_8);

		name8 = new JLabel(allContestants.get(i).getName()); i++;
		name8.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name8.setBounds(16, 145, 56, 18);
		contentPane.add(name8);

		win3 = new JToggleButton("Win?");
		win3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win3.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win3.setBounds(82, 87, 27, 18);
		contentPane.add(win3);

		JLabel lblTeam4 = new JLabel("Team 4 1F");
		lblTeam4.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam4.setBounds(191, 85, 56, 18);
		contentPane.add(lblTeam4);

		name9 = new JLabel(allContestants.get(i).getName()); i++;
		name9.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name9.setBounds(191, 105, 56, 18);
		contentPane.add(name9);

		textField_9 = new JTextField();
		textField_9.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_9.setColumns(10);
		textField_9.setBounds(250, 105, 49, 23);
		contentPane.add(textField_9);

		name10 = new JLabel(allContestants.get(i).getName()); i++;
		name10.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name10.setBounds(191, 125, 56, 18);
		contentPane.add(name10);

		textField_10 = new JTextField();
		textField_10.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_10.setColumns(10);
		textField_10.setBounds(250, 123, 49, 23);
		contentPane.add(textField_10);

		name11 = new JLabel(allContestants.get(i).getName()); i++;
		name11.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name11.setBounds(191, 144, 56, 18);
		contentPane.add(name11);

		textField_11 = new JTextField();
		textField_11.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_11.setColumns(10);
		textField_11.setBounds(250, 142, 49, 23);
		contentPane.add(textField_11);

		win4 = new JToggleButton("Win?");
		win4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win4.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win4.setBounds(257, 86, 27, 18);
		contentPane.add(win4);

		JLabel lblTeam5 = new JLabel("Team 5 1E");
		lblTeam5.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam5.setBounds(16, 165, 56, 18);
		contentPane.add(lblTeam5);

		name12 = new JLabel(allContestants.get(i).getName()); i++;
		name12.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name12.setBounds(16, 185, 56, 18);
		contentPane.add(name12);

		name13 = new JLabel(allContestants.get(i).getName()); i++;
		name13.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name13.setBounds(16, 205, 56, 18);
		contentPane.add(name13);

		name14 = new JLabel(allContestants.get(i).getName()); i++;
		name14.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name14.setBounds(16, 224, 56, 18);
		contentPane.add(name14);

		win5 = new JToggleButton("Win?");
		win5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win5.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win5.setBounds(82, 166, 27, 18);
		contentPane.add(win5);

		JLabel lblTeam6 = new JLabel("Team 6 1E");
		lblTeam6.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam6.setBounds(191, 164, 56, 18);
		contentPane.add(lblTeam6);

		name15 = new JLabel(allContestants.get(i).getName()); i++;
		name15.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name15.setBounds(191, 184, 56, 18);
		contentPane.add(name15);

		name16 = new JLabel(allContestants.get(i).getName()); i++;
		name16.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name16.setBounds(191, 204, 56, 18);
		contentPane.add(name16);

		name17 = new JLabel(allContestants.get(i).getName()); i++;
		name17.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name17.setBounds(191, 223, 56, 18);
		contentPane.add(name17);

		win6 = new JToggleButton("Win?");
		win6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win6.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win6.setBounds(257, 165, 27, 18);
		contentPane.add(win6);

		JLabel lblTeam7 = new JLabel("Team 7 1D");
		lblTeam7.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam7.setBounds(16, 247, 60, 18);
		contentPane.add(lblTeam7);

		name18 = new JLabel(allContestants.get(i).getName()); i++;
		name18.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name18.setBounds(16, 267, 56, 18);
		contentPane.add(name18);

		name19 = new JLabel(allContestants.get(i).getName()); i++;
		name19.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name19.setBounds(16, 287, 56, 18);
		contentPane.add(name19);

		name20 = new JLabel(allContestants.get(i).getName()); i++;
		name20.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name20.setBounds(16, 306, 56, 18);
		contentPane.add(name20);

		win7 = new JToggleButton("Win?");
		win7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win7.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win7.setBounds(82, 248, 27, 18);
		contentPane.add(win7);

		JLabel lblTeam8 = new JLabel("Team 8 1D");
		lblTeam8.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam8.setBounds(191, 246, 60, 18);
		contentPane.add(lblTeam8);

		name21 = new JLabel(allContestants.get(i).getName()); i++;
		name21.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name21.setBounds(191, 266, 56, 18);
		contentPane.add(name21);

		name22 = new JLabel(allContestants.get(i).getName()); i++;
		name22.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name22.setBounds(191, 286, 56, 18);
		contentPane.add(name22);

		name23 = new JLabel(allContestants.get(i).getName()); i++;
		name23.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name23.setBounds(191, 305, 56, 18);
		contentPane.add(name23);

		win8 = new JToggleButton("Win?");
		win8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win8.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win8.setBounds(257, 247, 27, 18);
		contentPane.add(win8);

		JLabel lblTeam9 = new JLabel("Team 9 1C");
		lblTeam9.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam9.setBounds(16, 328, 56, 18);
		contentPane.add(lblTeam9);

		name24 = new JLabel(allContestants.get(i).getName()); i++;
		name24.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name24.setBounds(16, 348, 56, 18);
		contentPane.add(name24);

		name25 = new JLabel(allContestants.get(i).getName()); i++;
		name25.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name25.setBounds(16, 368, 56, 18);
		contentPane.add(name25);

		name26 = new JLabel(allContestants.get(i).getName()); i++;
		name26.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name26.setBounds(16, 387, 56, 18);
		contentPane.add(name26);

		win9 = new JToggleButton("Win?");
		win9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win9.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win9.setBounds(82, 329, 27, 18);
		contentPane.add(win9);

		JLabel lblTeam10 = new JLabel("Team 10 1C");
		lblTeam10.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam10.setBounds(191, 327, 65, 18);
		contentPane.add(lblTeam10);

		name27 = new JLabel(allContestants.get(i).getName()); i++;
		name27.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name27.setBounds(191, 347, 56, 18);
		contentPane.add(name27);

		name28 = new JLabel(allContestants.get(i).getName()); i++;
		name28.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name28.setBounds(191, 367, 56, 18);
		contentPane.add(name28);

		name29 = new JLabel(allContestants.get(i).getName()); i++;
		name29.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name29.setBounds(191, 386, 56, 18);
		contentPane.add(name29);

		win10 = new JToggleButton("Win?");
		win10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win10.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win10.setBounds(257, 328, 27, 18);
		contentPane.add(win10);

		name30 = new JLabel(allContestants.get(i).getName()); i++;
		name30.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name30.setBounds(369, 25, 56, 18);
		contentPane.add(name30);

		win11 = new JToggleButton("Win?");
		win11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win11.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win11.setBounds(435, 6, 27, 18);
		contentPane.add(win11);

		textField_30 = new JTextField();
		textField_30.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_30.setColumns(10);
		textField_30.setBounds(428, 25, 49, 23);
		contentPane.add(textField_30);

		name31 = new JLabel(allContestants.get(i).getName()); i++;
		name31.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name31.setBounds(369, 45, 56, 18);
		contentPane.add(name31);

		name32 = new JLabel(allContestants.get(i).getName()); i++;
		name32.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name32.setBounds(369, 64, 56, 18);
		contentPane.add(name32);

		JLabel lblTeam11 = new JLabel("Team 11 1B");
		lblTeam11.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam11.setBounds(369, 5, 65, 18);
		contentPane.add(lblTeam11);

		textField_31 = new JTextField();
		textField_31.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_31.setColumns(10);
		textField_31.setBounds(428, 43, 49, 23);
		contentPane.add(textField_31);

		textField_32 = new JTextField();
		textField_32.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_32.setColumns(10);
		textField_32.setBounds(428, 62, 49, 23);
		contentPane.add(textField_32);

		JLabel lblTeam12 = new JLabel("Team 12 1B");
		lblTeam12.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam12.setBounds(547, 6, 65, 18);
		contentPane.add(lblTeam12);

		win12 = new JToggleButton("Win?");
		win12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win12.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win12.setBounds(613, 7, 27, 18);
		contentPane.add(win12);

		name33 = new JLabel(allContestants.get(i).getName()); i++;
		name33.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name33.setBounds(547, 26, 56, 18);
		contentPane.add(name33);

		textField_33 = new JTextField();
		textField_33.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_33.setColumns(10);
		textField_33.setBounds(606, 26, 49, 23);
		contentPane.add(textField_33);

		name34 = new JLabel(allContestants.get(i).getName()); i++;
		name34.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name34.setBounds(547, 46, 56, 18);
		contentPane.add(name34);

		textField_34 = new JTextField();
		textField_34.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_34.setColumns(10);
		textField_34.setBounds(606, 44, 49, 23);
		contentPane.add(textField_34);

		name35 = new JLabel(allContestants.get(i).getName()); i++;
		name35.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name35.setBounds(547, 65, 56, 18);
		contentPane.add(name35);

		textField_35 = new JTextField();
		textField_35.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_35.setColumns(10);
		textField_35.setBounds(606, 63, 49, 23);
		contentPane.add(textField_35);

		JLabel lblTeam13 = new JLabel("Team 13 1A");
		lblTeam13.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam13.setBounds(369, 86, 65, 18);
		contentPane.add(lblTeam13);

		name36 = new JLabel(allContestants.get(i).getName()); i++;
		name36.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name36.setBounds(369, 106, 56, 18);
		contentPane.add(name36);

		name37 = new JLabel(allContestants.get(i).getName()); i++;
		name37.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name37.setBounds(369, 126, 56, 18);
		contentPane.add(name37);

		name38 = new JLabel(allContestants.get(i).getName()); i++;
		name38.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name38.setBounds(369, 145, 56, 18);
		contentPane.add(name38);

		win13 = new JToggleButton("Win?");
		win13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win13.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win13.setBounds(435, 87, 27, 18);
		contentPane.add(win13);

		JLabel lblTeam14 = new JLabel("Team 14 1A");
		lblTeam14.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam14.setBounds(547, 86, 65, 18);
		contentPane.add(lblTeam14);

		name39 = new JLabel(allContestants.get(i).getName()); i++;
		name39.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name39.setBounds(547, 106, 56, 18);
		contentPane.add(name39);

		name40 = new JLabel(allContestants.get(i).getName()); i++;
		name40.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name40.setBounds(547, 126, 56, 18);
		contentPane.add(name40);

		name41 = new JLabel(allContestants.get(i).getName()); i++;
		name41.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name41.setBounds(547, 145, 56, 18);
		contentPane.add(name41);

		win14 = new JToggleButton("Win?");
		win14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win14.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win14.setBounds(613, 87, 27, 18);
		contentPane.add(win14);

		JLabel lblTeam15 = new JLabel("Team 15 2A");
		lblTeam15.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam15.setBounds(369, 165, 65, 18);
		contentPane.add(lblTeam15);

		name42 = new JLabel(allContestants.get(i).getName()); i++;
		name42.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name42.setBounds(369, 185, 56, 18);
		contentPane.add(name42);

		name43 = new JLabel(allContestants.get(i).getName()); i++;
		name43.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name43.setBounds(369, 205, 56, 18);
		contentPane.add(name43);

		name44 = new JLabel(allContestants.get(i).getName()); i++;
		name44.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name44.setBounds(369, 224, 56, 18);
		contentPane.add(name44);

		win15 = new JToggleButton("Win?");
		win15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win15.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win15.setBounds(435, 166, 27, 18);
		contentPane.add(win15);

		JLabel lblTeam16 = new JLabel("Team 16 2A");
		lblTeam16.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam16.setBounds(547, 165, 65, 18);
		contentPane.add(lblTeam16);

		name45 = new JLabel(allContestants.get(i).getName()); i++;
		name45.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name45.setBounds(547, 185, 56, 18);
		contentPane.add(name45);

		name46 = new JLabel(allContestants.get(i).getName()); i++;
		name46.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name46.setBounds(547, 205, 56, 18);
		contentPane.add(name46);

		name47 = new JLabel(allContestants.get(i).getName()); i++;
		name47.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name47.setBounds(547, 224, 56, 18);
		contentPane.add(name47);

		win16 = new JToggleButton("Win?");
		win16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win16.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win16.setBounds(613, 166, 27, 18);
		contentPane.add(win16);

		JLabel lblTeam17 = new JLabel("Team 17 2B");
		lblTeam17.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam17.setBounds(369, 247, 65, 18);
		contentPane.add(lblTeam17);

		name48 = new JLabel(allContestants.get(i).getName()); i++;
		name48.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name48.setBounds(369, 267, 56, 18);
		contentPane.add(name48);

		name49 = new JLabel(allContestants.get(i).getName()); i++;
		name49.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name49.setBounds(369, 287, 56, 18);
		contentPane.add(name49);

		name50 = new JLabel(allContestants.get(i).getName()); i++;
		name50.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name50.setBounds(369, 306, 56, 18);
		contentPane.add(name50);

		win17 = new JToggleButton("Win?");
		win17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win17.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win17.setBounds(435, 248, 27, 18);
		contentPane.add(win17);

		JLabel lblTeam18 = new JLabel("Team 18 2B");
		lblTeam18.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam18.setBounds(547, 247, 65, 18);
		contentPane.add(lblTeam18);

		name51 = new JLabel(allContestants.get(i).getName()); i++;
		name51.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name51.setBounds(547, 267, 56, 18);
		contentPane.add(name51);

		name52 = new JLabel(allContestants.get(i).getName()); i++;
		name52.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name52.setBounds(547, 287, 56, 18);
		contentPane.add(name52);

		name53 = new JLabel(allContestants.get(i).getName()); i++;
		name53.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name53.setBounds(547, 306, 56, 18);
		contentPane.add(name53);

		win18 = new JToggleButton("Win?");
		win18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win18.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win18.setBounds(613, 248, 27, 18);
		contentPane.add(win18);

		JLabel lblTeam19 = new JLabel("Team 19 2C");
		lblTeam19.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam19.setBounds(369, 328, 65, 18);
		contentPane.add(lblTeam19);

		name54 = new JLabel(allContestants.get(i).getName()); i++;
		name54.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name54.setBounds(369, 348, 56, 18);
		contentPane.add(name54);

		name55 = new JLabel(allContestants.get(i).getName()); i++;
		name55.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name55.setBounds(369, 368, 56, 18);
		contentPane.add(name55);

		name56 = new JLabel(allContestants.get(i).getName()); i++;
		name56.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name56.setBounds(369, 387, 56, 18);
		contentPane.add(name56);

		win19 = new JToggleButton("Win?");
		win19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win19.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win19.setBounds(435, 329, 27, 18);
		contentPane.add(win19);

		JLabel lblTeam20 = new JLabel("Team 20 2C");
		lblTeam20.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam20.setBounds(547, 328, 65, 18);
		contentPane.add(lblTeam20);

		name57 = new JLabel(allContestants.get(i).getName()); i++;
		name57.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name57.setBounds(547, 348, 56, 18);
		contentPane.add(name57);

		name58 = new JLabel(allContestants.get(i).getName()); i++;
		name58.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name58.setBounds(547, 368, 56, 18);
		contentPane.add(name58);

		name59 = new JLabel(allContestants.get(i).getName()); i++;
		name59.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name59.setBounds(547, 387, 56, 18);
		contentPane.add(name59);

		win20 = new JToggleButton("Win?");
		win20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win20.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win20.setBounds(613, 329, 27, 18);
		contentPane.add(win20);

		name60 = new JLabel(allContestants.get(i).getName()); i++;
		name60.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name60.setBounds(713, 25, 56, 18);
		contentPane.add(name60);

		win21 = new JToggleButton("Win?");
		win21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win21.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win21.setBounds(779, 6, 27, 18);
		contentPane.add(win21);

		textField_60 = new JTextField();
		textField_60.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_60.setColumns(10);
		textField_60.setBounds(772, 25, 49, 23);
		contentPane.add(textField_60);

		name61 = new JLabel(allContestants.get(i).getName()); i++;
		name61.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name61.setBounds(713, 45, 56, 18);
		contentPane.add(name61);

		name62 = new JLabel(allContestants.get(i).getName()); i++;
		name62.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name62.setBounds(713, 64, 56, 18);
		contentPane.add(name62);

		JLabel lblTeam21 = new JLabel("Team 21 2D");
		lblTeam21.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam21.setBounds(713, 5, 65, 18);
		contentPane.add(lblTeam21);

		textField_61 = new JTextField();
		textField_61.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_61.setColumns(10);
		textField_61.setBounds(772, 43, 49, 23);
		contentPane.add(textField_61);

		textField_62 = new JTextField();
		textField_62.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_62.setColumns(10);
		textField_62.setBounds(772, 62, 49, 23);
		contentPane.add(textField_62);

		JLabel lblTeam22 = new JLabel("Team 22 2D");
		lblTeam22.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam22.setBounds(879, 5, 65, 18);
		contentPane.add(lblTeam22);

		win22 = new JToggleButton("Win?");
		win22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win22.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win22.setBounds(945, 6, 27, 18);
		contentPane.add(win22);

		name63 = new JLabel(allContestants.get(i).getName()); i++;
		name63.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name63.setBounds(879, 25, 56, 18);
		contentPane.add(name63);

		textField_63 = new JTextField();
		textField_63.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_63.setColumns(10);
		textField_63.setBounds(938, 25, 49, 23);
		contentPane.add(textField_63);

		name64 = new JLabel(allContestants.get(i).getName()); i++;
		name64.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name64.setBounds(879, 45, 56, 18);
		contentPane.add(name64);

		textField_64 = new JTextField();
		textField_64.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_64.setColumns(10);
		textField_64.setBounds(938, 43, 49, 23);
		contentPane.add(textField_64);

		name65 = new JLabel(allContestants.get(i).getName()); i++;
		name65.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name65.setBounds(879, 64, 56, 18);
		contentPane.add(name65);

		textField_65 = new JTextField();
		textField_65.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_65.setColumns(10);
		textField_65.setBounds(938, 62, 49, 23);
		contentPane.add(textField_65);

		JLabel lblTeam23 = new JLabel("Team 23 2E");
		lblTeam23.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam23.setBounds(713, 86, 65, 18);
		contentPane.add(lblTeam23);

		name66 = new JLabel(allContestants.get(i).getName()); i++;
		name66.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name66.setBounds(713, 106, 56, 18);
		contentPane.add(name66);

		name67 = new JLabel(allContestants.get(i).getName()); i++;
		name67.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name67.setBounds(713, 126, 56, 18);
		contentPane.add(name67);

		name68 = new JLabel(allContestants.get(i).getName()); i++;
		name68.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name68.setBounds(713, 145, 56, 18);
		contentPane.add(name68);

		win23 = new JToggleButton("Win?");
		win23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win23.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win23.setBounds(779, 87, 27, 18);
		contentPane.add(win23);

		JLabel lblTeam24 = new JLabel("Team 24 2E");
		lblTeam24.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam24.setBounds(879, 86, 65, 18);
		contentPane.add(lblTeam24);

		name69 = new JLabel(allContestants.get(i).getName()); i++;
		name69.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name69.setBounds(879, 106, 56, 18);
		contentPane.add(name69);

		name70 = new JLabel(allContestants.get(i).getName()); i++;
		name70.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name70.setBounds(879, 126, 56, 18);
		contentPane.add(name70);

		name71 = new JLabel(allContestants.get(i).getName()); i++;
		name71.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name71.setBounds(879, 145, 56, 18);
		contentPane.add(name71);

		win24 = new JToggleButton("Win?");
		win24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win24.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win24.setBounds(945, 87, 27, 18);
		contentPane.add(win24);

		JButton btnSubmit = new JButton("Update");
		btnSubmit.setBounds(918, 363, 117, 29);
		btnSubmit.addActionListener(this);
		contentPane.add(btnSubmit);

		JLabel lblTeam25 = new JLabel("Team 25 2F");
		lblTeam25.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam25.setBounds(713, 164, 65, 18);
		contentPane.add(lblTeam25);

		name72 = new JLabel(allContestants.get(i).getName()); i++;
		name72.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name72.setBounds(713, 184, 56, 18);
		contentPane.add(name72);

		name73 = new JLabel(allContestants.get(i).getName()); i++;
		name73.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name73.setBounds(713, 204, 56, 18);
		contentPane.add(name73);

		name74 = new JLabel(allContestants.get(i).getName()); i++;
		name74.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name74.setBounds(713, 223, 56, 18);
		contentPane.add(name74);

		win25 = new JToggleButton("Win?");
		win25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win25.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win25.setBounds(779, 165, 27, 18);
		contentPane.add(win25);

		JLabel lblTeam26 = new JLabel("Team 26 2F");
		lblTeam26.setFont(new Font("Lucida Grande", Font.BOLD, 10));
		lblTeam26.setBounds(879, 164, 65, 18);
		contentPane.add(lblTeam26);

		win26 = new JToggleButton("Win?");
		win26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		win26.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		win26.setBounds(945, 165, 27, 18);
		contentPane.add(win26);

		name75 = new JLabel(allContestants.get(i).getName()); i++;
		name75.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name75.setBounds(879, 184, 56, 18);
		contentPane.add(name75);

		name76 = new JLabel(allContestants.get(i).getName()); i++;
		name76.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name76.setBounds(879, 204, 56, 18);
		contentPane.add(name76);

		name77 = new JLabel(allContestants.get(i).getName()); i++;
		name77.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		name77.setBounds(879, 223, 56, 18);
		contentPane.add(name77);i++;i++;i++;i++;i++;

		textField_12 = new JTextField();
		textField_12.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_12.setColumns(10);
		textField_12.setBounds(75, 182, 49, 23);
		contentPane.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_13.setColumns(10);
		textField_13.setBounds(75, 200, 49, 23);
		contentPane.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_14.setColumns(10);
		textField_14.setBounds(75, 219, 49, 23);
		contentPane.add(textField_14);

		textField_15 = new JTextField();
		textField_15.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_15.setColumns(10);
		textField_15.setBounds(250, 181, 49, 23);
		contentPane.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_16.setColumns(10);
		textField_16.setBounds(250, 199, 49, 23);
		contentPane.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_17.setColumns(10);
		textField_17.setBounds(250, 218, 49, 23);
		contentPane.add(textField_17);

		textField_18 = new JTextField();
		textField_18.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_18.setColumns(10);
		textField_18.setBounds(75, 264, 49, 23);
		contentPane.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_19.setColumns(10);
		textField_19.setBounds(75, 282, 49, 23);
		contentPane.add(textField_19);

		textField_20 = new JTextField();
		textField_20.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_20.setColumns(10);
		textField_20.setBounds(75, 301, 49, 23);
		contentPane.add(textField_20);

		textField_21 = new JTextField();
		textField_21.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_21.setColumns(10);
		textField_21.setBounds(250, 263, 49, 23);
		contentPane.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_22.setColumns(10);
		textField_22.setBounds(250, 281, 49, 23);
		contentPane.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_23.setColumns(10);
		textField_23.setBounds(250, 300, 49, 23);
		contentPane.add(textField_23);

		textField_24 = new JTextField();
		textField_24.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_24.setColumns(10);
		textField_24.setBounds(75, 345, 49, 23);
		contentPane.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_25.setColumns(10);
		textField_25.setBounds(75, 363, 49, 23);
		contentPane.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_26.setColumns(10);
		textField_26.setBounds(75, 382, 49, 23);
		contentPane.add(textField_26);

		textField_27 = new JTextField();
		textField_27.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_27.setColumns(10);
		textField_27.setBounds(250, 344, 49, 23);
		contentPane.add(textField_27);

		textField_28 = new JTextField();
		textField_28.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_28.setColumns(10);
		textField_28.setBounds(250, 362, 49, 23);
		contentPane.add(textField_28);

		textField_29 = new JTextField();
		textField_29.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_29.setColumns(10);
		textField_29.setBounds(250, 381, 49, 23);
		contentPane.add(textField_29);

		textField_36 = new JTextField();
		textField_36.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_36.setColumns(10);
		textField_36.setBounds(428, 105, 49, 23);
		contentPane.add(textField_36);

		textField_37 = new JTextField();
		textField_37.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_37.setColumns(10);
		textField_37.setBounds(428, 123, 49, 23);
		contentPane.add(textField_37);

		textField_38 = new JTextField();
		textField_38.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_38.setColumns(10);
		textField_38.setBounds(428, 142, 49, 23);
		contentPane.add(textField_38);

		textField_39 = new JTextField();
		textField_39.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_39.setColumns(10);
		textField_39.setBounds(606, 105, 49, 23);
		contentPane.add(textField_39);

		textField_40 = new JTextField();
		textField_40.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_40.setColumns(10);
		textField_40.setBounds(606, 123, 49, 23);
		contentPane.add(textField_40);

		textField_41 = new JTextField();
		textField_41.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_41.setColumns(10);
		textField_41.setBounds(606, 142, 49, 23);
		contentPane.add(textField_41);

		textField_42 = new JTextField();
		textField_42.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_42.setColumns(10);
		textField_42.setBounds(428, 181, 49, 23);
		contentPane.add(textField_42);

		textField_43 = new JTextField();
		textField_43.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_43.setColumns(10);
		textField_43.setBounds(428, 199, 49, 23);
		contentPane.add(textField_43);

		textField_44 = new JTextField();
		textField_44.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_44.setColumns(10);
		textField_44.setBounds(428, 218, 49, 23);
		contentPane.add(textField_44);

		textField_45 = new JTextField();
		textField_45.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_45.setColumns(10);
		textField_45.setBounds(606, 181, 49, 23);
		contentPane.add(textField_45);

		textField_46 = new JTextField();
		textField_46.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_46.setColumns(10);
		textField_46.setBounds(606, 199, 49, 23);
		contentPane.add(textField_46);

		textField_47 = new JTextField();
		textField_47.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_47.setColumns(10);
		textField_47.setBounds(606, 218, 49, 23);
		contentPane.add(textField_47);

		textField_48 = new JTextField();
		textField_48.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_48.setColumns(10);
		textField_48.setBounds(428, 263, 49, 23);
		contentPane.add(textField_48);

		textField_49 = new JTextField();
		textField_49.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_49.setColumns(10);
		textField_49.setBounds(428, 281, 49, 23);
		contentPane.add(textField_49);

		textField_50 = new JTextField();
		textField_50.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_50.setColumns(10);
		textField_50.setBounds(428, 300, 49, 23);
		contentPane.add(textField_50);

		textField_51 = new JTextField();
		textField_51.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_51.setColumns(10);
		textField_51.setBounds(606, 263, 49, 23);
		contentPane.add(textField_51);

		textField_52 = new JTextField();
		textField_52.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_52.setColumns(10);
		textField_52.setBounds(606, 281, 49, 23);
		contentPane.add(textField_52);

		textField_53 = new JTextField();
		textField_53.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_53.setColumns(10);
		textField_53.setBounds(606, 300, 49, 23);
		contentPane.add(textField_53);

		textField_54 = new JTextField();
		textField_54.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_54.setColumns(10);
		textField_54.setBounds(428, 344, 49, 23);
		contentPane.add(textField_54);

		textField_55 = new JTextField();
		textField_55.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_55.setColumns(10);
		textField_55.setBounds(428, 362, 49, 23);
		contentPane.add(textField_55);

		textField_56 = new JTextField();
		textField_56.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_56.setColumns(10);
		textField_56.setBounds(428, 381, 49, 23);
		contentPane.add(textField_56);

		textField_57 = new JTextField();
		textField_57.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_57.setColumns(10);
		textField_57.setBounds(606, 344, 49, 23);
		contentPane.add(textField_57);

		textField_58 = new JTextField();
		textField_58.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_58.setColumns(10);
		textField_58.setBounds(606, 362, 49, 23);
		contentPane.add(textField_58);

		textField_59 = new JTextField();
		textField_59.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_59.setColumns(10);
		textField_59.setBounds(606, 381, 49, 23);
		contentPane.add(textField_59);

		textField_66 = new JTextField();
		textField_66.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_66.setColumns(10);
		textField_66.setBounds(772, 105, 49, 23);
		contentPane.add(textField_66);

		textField_67 = new JTextField();
		textField_67.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_67.setColumns(10);
		textField_67.setBounds(772, 123, 49, 23);
		contentPane.add(textField_67);

		textField_68 = new JTextField();
		textField_68.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_68.setColumns(10);
		textField_68.setBounds(772, 142, 49, 23);
		contentPane.add(textField_68);

		textField_69 = new JTextField();
		textField_69.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_69.setColumns(10);
		textField_69.setBounds(938, 105, 49, 23);
		contentPane.add(textField_69);

		textField_70 = new JTextField();
		textField_70.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_70.setColumns(10);
		textField_70.setBounds(938, 123, 49, 23);
		contentPane.add(textField_70);

		textField_71 = new JTextField();
		textField_71.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_71.setColumns(10);
		textField_71.setBounds(938, 142, 49, 23);
		contentPane.add(textField_71);

		textField_72 = new JTextField();
		textField_72.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_72.setColumns(10);
		textField_72.setBounds(772, 181, 49, 23);
		contentPane.add(textField_72);

		textField_73 = new JTextField();
		textField_73.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_73.setColumns(10);
		textField_73.setBounds(772, 199, 49, 23);
		contentPane.add(textField_73);

		textField_74 = new JTextField();
		textField_74.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_74.setColumns(10);
		textField_74.setBounds(772, 218, 49, 23);
		contentPane.add(textField_74);

		textField_75 = new JTextField();
		textField_75.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_75.setColumns(10);
		textField_75.setBounds(938, 181, 49, 23);
		contentPane.add(textField_75);

		textField_76 = new JTextField();
		textField_76.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_76.setColumns(10);
		textField_76.setBounds(938, 199, 49, 23);
		contentPane.add(textField_76);

		textField_77 = new JTextField();
		textField_77.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		textField_77.setColumns(10);
		textField_77.setBounds(938, 218, 49, 23);
		contentPane.add(textField_77);

		JTextArea textArea_0 = new JTextArea();
		textArea_0.setBounds(130, 28, 49, 16);
		contentPane.add(textArea_0);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(130, 47, 49, 16);
		contentPane.add(textArea_1);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(130, 66, 49, 16);
		contentPane.add(textArea_2);

		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(308, 28, 49, 16);
		contentPane.add(textArea_3);

		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(308, 47, 49, 16);
		contentPane.add(textArea_4);

		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(308, 66, 49, 16);
		contentPane.add(textArea_5);

		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(130, 110, 49, 16);
		contentPane.add(textArea_6);

		JTextArea textArea_7 = new JTextArea();
		textArea_7.setBounds(130, 129, 49, 16);
		contentPane.add(textArea_7);

		JTextArea textArea_8 = new JTextArea();
		textArea_8.setBounds(130, 148, 49, 16);
		contentPane.add(textArea_8);

		JTextArea textArea_9 = new JTextArea();
		textArea_9.setBounds(308, 110, 49, 16);
		contentPane.add(textArea_9);

		JTextArea textArea_10 = new JTextArea();
		textArea_10.setBounds(308, 129, 49, 16);
		contentPane.add(textArea_10);

		JTextArea textArea_11 = new JTextArea();
		textArea_11.setBounds(308, 148, 49, 16);
		contentPane.add(textArea_11);

		JTextArea textArea_12 = new JTextArea();
		textArea_12.setBounds(130, 185, 49, 16);
		contentPane.add(textArea_12);

		JTextArea textArea_13 = new JTextArea();
		textArea_13.setBounds(130, 204, 49, 16);
		contentPane.add(textArea_13);

		JTextArea textArea_14 = new JTextArea();
		textArea_14.setBounds(130, 223, 49, 16);
		contentPane.add(textArea_14);

		JTextArea textArea_15 = new JTextArea();
		textArea_15.setBounds(308, 185, 49, 16);
		contentPane.add(textArea_15);

		JTextArea textArea_16 = new JTextArea();
		textArea_16.setBounds(308, 204, 49, 16);
		contentPane.add(textArea_16);

		JTextArea textArea_17 = new JTextArea();
		textArea_17.setBounds(308, 223, 49, 16);
		contentPane.add(textArea_17);

		JTextArea textArea_18 = new JTextArea();
		textArea_18.setBounds(130, 267, 49, 16);
		contentPane.add(textArea_18);

		JTextArea textArea_19 = new JTextArea();
		textArea_19.setBounds(130, 286, 49, 16);
		contentPane.add(textArea_19);

		JTextArea textArea_20 = new JTextArea();
		textArea_20.setBounds(130, 305, 49, 16);
		contentPane.add(textArea_20);

		JTextArea textArea_21 = new JTextArea();
		textArea_21.setBounds(308, 267, 49, 16);
		contentPane.add(textArea_21);

		JTextArea textArea_22 = new JTextArea();
		textArea_22.setBounds(308, 286, 49, 16);
		contentPane.add(textArea_22);

		JTextArea textArea_23 = new JTextArea();
		textArea_23.setBounds(308, 305, 49, 16);
		contentPane.add(textArea_23);

		JTextArea textArea_24 = new JTextArea();
		textArea_24.setBounds(130, 348, 49, 16);
		contentPane.add(textArea_24);

		JTextArea textArea_25 = new JTextArea();
		textArea_25.setBounds(130, 366, 49, 16);
		contentPane.add(textArea_25);

		JTextArea textArea_26 = new JTextArea();
		textArea_26.setBounds(130, 385, 49, 16);
		contentPane.add(textArea_26);

		JTextArea textArea_27 = new JTextArea();
		textArea_27.setBounds(308, 347, 49, 16);
		contentPane.add(textArea_27);

		JTextArea textArea_28 = new JTextArea();
		textArea_28.setBounds(308, 365, 49, 16);
		contentPane.add(textArea_28);

		JTextArea textArea_29 = new JTextArea();
		textArea_29.setBounds(308, 384, 49, 16);
		contentPane.add(textArea_29);

		JTextArea textArea_30 = new JTextArea();
		textArea_30.setBounds(478, 28, 49, 16);
		contentPane.add(textArea_30);

		JTextArea textArea_31 = new JTextArea();
		textArea_31.setBounds(478, 47, 49, 16);
		contentPane.add(textArea_31);

		JTextArea textArea_32 = new JTextArea();
		textArea_32.setBounds(478, 66, 49, 16);
		contentPane.add(textArea_32);

		JTextArea textArea_33 = new JTextArea();
		textArea_33.setBounds(656, 28, 49, 16);
		contentPane.add(textArea_33);

		JTextArea textArea_34 = new JTextArea();
		textArea_34.setBounds(656, 47, 49, 16);
		contentPane.add(textArea_34);

		JTextArea textArea_35 = new JTextArea();
		textArea_35.setBounds(656, 66, 49, 16);
		contentPane.add(textArea_35);

		JTextArea textArea_36 = new JTextArea();
		textArea_36.setBounds(478, 110, 49, 16);
		contentPane.add(textArea_36);

		JTextArea textArea_37 = new JTextArea();
		textArea_37.setBounds(478, 129, 49, 16);
		contentPane.add(textArea_37);

		JTextArea textArea_38 = new JTextArea();
		textArea_38.setBounds(478, 148, 49, 16);
		contentPane.add(textArea_38);

		JTextArea textArea_39 = new JTextArea();
		textArea_39.setBounds(656, 110, 49, 16);
		contentPane.add(textArea_39);

		JTextArea textArea_40 = new JTextArea();
		textArea_40.setBounds(656, 129, 49, 16);
		contentPane.add(textArea_40);

		JTextArea textArea_41 = new JTextArea();
		textArea_41.setBounds(656, 148, 49, 16);
		contentPane.add(textArea_41);

		JTextArea textArea_42 = new JTextArea();
		textArea_42.setBounds(478, 185, 49, 16);
		contentPane.add(textArea_42);

		JTextArea textArea_43 = new JTextArea();
		textArea_43.setBounds(478, 204, 49, 16);
		contentPane.add(textArea_43);

		JTextArea textArea_44 = new JTextArea();
		textArea_44.setBounds(478, 223, 49, 16);
		contentPane.add(textArea_44);

		JTextArea textArea_45 = new JTextArea();
		textArea_45.setBounds(656, 185, 49, 16);
		contentPane.add(textArea_45);

		JTextArea textArea_46 = new JTextArea();
		textArea_46.setBounds(656, 204, 49, 16);
		contentPane.add(textArea_46);

		JTextArea textArea_47 = new JTextArea();
		textArea_47.setBounds(656, 223, 49, 16);
		contentPane.add(textArea_47);

		JTextArea textArea_48 = new JTextArea();
		textArea_48.setBounds(478, 267, 49, 16);
		contentPane.add(textArea_48);

		JTextArea textArea_49 = new JTextArea();
		textArea_49.setBounds(478, 286, 49, 16);
		contentPane.add(textArea_49);

		JTextArea textArea_50 = new JTextArea();
		textArea_50.setBounds(478, 305, 49, 16);
		contentPane.add(textArea_50);

		JTextArea textArea_51 = new JTextArea();
		textArea_51.setBounds(656, 267, 49, 16);
		contentPane.add(textArea_51);

		JTextArea textArea_52 = new JTextArea();
		textArea_52.setBounds(656, 286, 49, 16);
		contentPane.add(textArea_52);

		JTextArea textArea_53 = new JTextArea();
		textArea_53.setBounds(656, 305, 49, 16);
		contentPane.add(textArea_53);

		JTextArea textArea_54 = new JTextArea();
		textArea_54.setBounds(478, 348, 49, 16);
		contentPane.add(textArea_54);

		JTextArea textArea_55 = new JTextArea();
		textArea_55.setBounds(478, 366, 49, 16);
		contentPane.add(textArea_55);

		JTextArea textArea_56 = new JTextArea();
		textArea_56.setBounds(478, 385, 49, 16);
		contentPane.add(textArea_56);

		JTextArea textArea_57 = new JTextArea();
		textArea_57.setBounds(656, 347, 49, 16);
		contentPane.add(textArea_57);

		JTextArea textArea_58 = new JTextArea();
		textArea_58.setBounds(656, 365, 49, 16);
		contentPane.add(textArea_58);

		JTextArea textArea_59 = new JTextArea();
		textArea_59.setBounds(656, 384, 49, 16);
		contentPane.add(textArea_59);

		JTextArea textArea_60 = new JTextArea();
		textArea_60.setBounds(822, 27, 49, 16);
		contentPane.add(textArea_60);

		JTextArea textArea_61 = new JTextArea();
		textArea_61.setBounds(822, 46, 49, 16);
		contentPane.add(textArea_61);

		JTextArea textArea_62 = new JTextArea();
		textArea_62.setBounds(822, 65, 49, 16);
		contentPane.add(textArea_62);

		JTextArea textArea_63 = new JTextArea();
		textArea_63.setBounds(1000, 27, 49, 16);
		contentPane.add(textArea_63);

		JTextArea textArea_64 = new JTextArea();
		textArea_64.setBounds(1000, 46, 49, 16);
		contentPane.add(textArea_64);

		JTextArea textArea_65 = new JTextArea();
		textArea_65.setBounds(1000, 65, 49, 16);
		contentPane.add(textArea_65);

		JTextArea textArea_66 = new JTextArea();
		textArea_66.setBounds(822, 109, 49, 16);
		contentPane.add(textArea_66);

		JTextArea textArea_67 = new JTextArea();
		textArea_67.setBounds(822, 128, 49, 16);
		contentPane.add(textArea_67);

		JTextArea textArea_68 = new JTextArea();
		textArea_68.setBounds(822, 147, 49, 16);
		contentPane.add(textArea_68);

		JTextArea textArea_69 = new JTextArea();
		textArea_69.setBounds(1000, 109, 49, 16);
		contentPane.add(textArea_69);

		JTextArea textArea_70 = new JTextArea();
		textArea_70.setBounds(1000, 128, 49, 16);
		contentPane.add(textArea_70);

		JTextArea textArea_71 = new JTextArea();
		textArea_71.setBounds(1000, 147, 49, 16);
		contentPane.add(textArea_71);

		JTextArea textArea_72 = new JTextArea();
		textArea_72.setBounds(822, 184, 49, 16);
		contentPane.add(textArea_72);

		JTextArea textArea_73 = new JTextArea();
		textArea_73.setBounds(822, 203, 49, 16);
		contentPane.add(textArea_73);

		JTextArea textArea_74 = new JTextArea();
		textArea_74.setBounds(822, 222, 49, 16);
		contentPane.add(textArea_74);

		JTextArea textArea_75 = new JTextArea();
		textArea_75.setBounds(1000, 184, 49, 16);
		contentPane.add(textArea_75);

		JTextArea textArea_76 = new JTextArea();
		textArea_76.setBounds(1000, 203, 49, 16);
		contentPane.add(textArea_76);

		JTextArea textArea_77 = new JTextArea();
		textArea_77.setBounds(1000, 222, 49, 16);
		contentPane.add(textArea_77);

		buttons.add(win1);
		buttons.add(win2);
		buttons.add(win3);
		buttons.add(win4);
		buttons.add(win5);
		buttons.add(win6);
		buttons.add(win7);
		buttons.add(win8);
		buttons.add(win9);
		buttons.add(win10);
		buttons.add(win11);
		buttons.add(win12);
		buttons.add(win13);
		buttons.add(win14);
		buttons.add(win15);
		buttons.add(win16);
		buttons.add(win17);
		buttons.add(win18);
		buttons.add(win19);
		buttons.add(win20);
		buttons.add(win21);
		buttons.add(win22);
		buttons.add(win23);
		buttons.add(win24);
		buttons.add(win25);
		buttons.add(win26);

		mobiePoints.add(textField_0); 
		mobiePoints.add(textField_1);
		mobiePoints.add(textField_2);
		mobiePoints.add(textField_3);
		mobiePoints.add(textField_4);
		mobiePoints.add(textField_5);
		mobiePoints.add(textField_6);
		mobiePoints.add(textField_7);
		mobiePoints.add(textField_8);
		mobiePoints.add(textField_9);
		mobiePoints.add(textField_10);
		mobiePoints.add(textField_11);
		mobiePoints.add(textField_12);
		mobiePoints.add(textField_13);
		mobiePoints.add(textField_14);
		mobiePoints.add(textField_15);
		mobiePoints.add(textField_16);
		mobiePoints.add(textField_17);
		mobiePoints.add(textField_18);
		mobiePoints.add(textField_19);
		mobiePoints.add(textField_20);
		mobiePoints.add(textField_21);
		mobiePoints.add(textField_22);
		mobiePoints.add(textField_23);
		mobiePoints.add(textField_24);
		mobiePoints.add(textField_25);
		mobiePoints.add(textField_26);
		mobiePoints.add(textField_27);
		mobiePoints.add(textField_28);
		mobiePoints.add(textField_29);
		mobiePoints.add(textField_30);
		mobiePoints.add(textField_31);
		mobiePoints.add(textField_32);
		mobiePoints.add(textField_33);
		mobiePoints.add(textField_34);
		mobiePoints.add(textField_35);
		mobiePoints.add(textField_36);
		mobiePoints.add(textField_37);
		mobiePoints.add(textField_38);
		mobiePoints.add(textField_39);
		mobiePoints.add(textField_40);
		mobiePoints.add(textField_41);
		mobiePoints.add(textField_42);
		mobiePoints.add(textField_43);
		mobiePoints.add(textField_44);
		mobiePoints.add(textField_45);
		mobiePoints.add(textField_46);
		mobiePoints.add(textField_47);
		mobiePoints.add(textField_48);
		mobiePoints.add(textField_49);
		mobiePoints.add(textField_50);
		mobiePoints.add(textField_51);
		mobiePoints.add(textField_52);
		mobiePoints.add(textField_53);
		mobiePoints.add(textField_54);
		mobiePoints.add(textField_55);
		mobiePoints.add(textField_56);
		mobiePoints.add(textField_57);
		mobiePoints.add(textField_58);
		mobiePoints.add(textField_59);
		mobiePoints.add(textField_60);
		mobiePoints.add(textField_61);
		mobiePoints.add(textField_62);
		mobiePoints.add(textField_63);
		mobiePoints.add(textField_64);
		mobiePoints.add(textField_65);
		mobiePoints.add(textField_66);
		mobiePoints.add(textField_67);
		mobiePoints.add(textField_68);
		mobiePoints.add(textField_69);
		mobiePoints.add(textField_70);
		mobiePoints.add(textField_71);
		mobiePoints.add(textField_72);
		mobiePoints.add(textField_73);
		mobiePoints.add(textField_74);
		mobiePoints.add(textField_75);
		mobiePoints.add(textField_76);
		mobiePoints.add(textField_77);

		speakerPoints.add(textArea_0);
		speakerPoints.add(textArea_1);
		speakerPoints.add(textArea_2);
		speakerPoints.add(textArea_3);
		speakerPoints.add(textArea_4);
		speakerPoints.add(textArea_5);
		speakerPoints.add(textArea_6);
		speakerPoints.add(textArea_7);
		speakerPoints.add(textArea_8);
		speakerPoints.add(textArea_9);
		speakerPoints.add(textArea_10);
		speakerPoints.add(textArea_11);
		speakerPoints.add(textArea_12);
		speakerPoints.add(textArea_13);
		speakerPoints.add(textArea_14);
		speakerPoints.add(textArea_15);
		speakerPoints.add(textArea_16);
		speakerPoints.add(textArea_17);
		speakerPoints.add(textArea_18);
		speakerPoints.add(textArea_19);
		speakerPoints.add(textArea_20);
		speakerPoints.add(textArea_21);
		speakerPoints.add(textArea_22);
		speakerPoints.add(textArea_23);
		speakerPoints.add(textArea_24);
		speakerPoints.add(textArea_25);
		speakerPoints.add(textArea_26);
		speakerPoints.add(textArea_27);
		speakerPoints.add(textArea_28);
		speakerPoints.add(textArea_29);
		speakerPoints.add(textArea_30);
		speakerPoints.add(textArea_31);
		speakerPoints.add(textArea_32);
		speakerPoints.add(textArea_33);
		speakerPoints.add(textArea_34);
		speakerPoints.add(textArea_35);
		speakerPoints.add(textArea_36);
		speakerPoints.add(textArea_37);
		speakerPoints.add(textArea_38);
		speakerPoints.add(textArea_39);
		speakerPoints.add(textArea_40);
		speakerPoints.add(textArea_41);
		speakerPoints.add(textArea_42);
		speakerPoints.add(textArea_43);
		speakerPoints.add(textArea_44);
		speakerPoints.add(textArea_45);
		speakerPoints.add(textArea_46);
		speakerPoints.add(textArea_47);
		speakerPoints.add(textArea_48);
		speakerPoints.add(textArea_49);
		speakerPoints.add(textArea_50);
		speakerPoints.add(textArea_51);
		speakerPoints.add(textArea_52);
		speakerPoints.add(textArea_53);
		speakerPoints.add(textArea_54);
		speakerPoints.add(textArea_55);
		speakerPoints.add(textArea_56);
		speakerPoints.add(textArea_57);
		speakerPoints.add(textArea_58);
		speakerPoints.add(textArea_59);
		speakerPoints.add(textArea_60);
		speakerPoints.add(textArea_61);
		speakerPoints.add(textArea_62);
		speakerPoints.add(textArea_63);
		speakerPoints.add(textArea_64);
		speakerPoints.add(textArea_65);
		speakerPoints.add(textArea_66);
		speakerPoints.add(textArea_67);
		speakerPoints.add(textArea_68);
		speakerPoints.add(textArea_69);
		speakerPoints.add(textArea_70);
		speakerPoints.add(textArea_71);
		speakerPoints.add(textArea_72);
		speakerPoints.add(textArea_73);
		speakerPoints.add(textArea_74);
		speakerPoints.add(textArea_75);
		speakerPoints.add(textArea_76);
		speakerPoints.add(textArea_77);

		names.add(name0);
		names.add(name1);
		names.add(name2);
		names.add(name3);
		names.add(name4);
		names.add(name5);
		names.add(name6);
		names.add(name7);
		names.add(name8);
		names.add(name9);
		names.add(name10);
		names.add(name11);
		names.add(name12);
		names.add(name13);
		names.add(name14);
		names.add(name15);
		names.add(name16);
		names.add(name17);
		names.add(name18);
		names.add(name19);
		names.add(name20);
		names.add(name21);
		names.add(name22);
		names.add(name23);
		names.add(name24);
		names.add(name25);
		names.add(name26);
		names.add(name27);
		names.add(name28);
		names.add(name29);
		names.add(name30);
		names.add(name31);
		names.add(name32);
		names.add(name33);
		names.add(name34);
		names.add(name35);
		names.add(name36);
		names.add(name37);
		names.add(name38);
		names.add(name39);
		names.add(name40);
		names.add(name41);
		names.add(name42);
		names.add(name43);
		names.add(name44);
		names.add(name45);
		names.add(name46);
		names.add(name47);
		names.add(name48);
		names.add(name49);
		names.add(name50);
		names.add(name51);
		names.add(name52);
		names.add(name53);
		names.add(name54);
		names.add(name55);
		names.add(name56);
		names.add(name57);
		names.add(name58);
		names.add(name59);
		names.add(name60);
		names.add(name61);
		names.add(name62);
		names.add(name63);
		names.add(name64);
		names.add(name65);
		names.add(name66);
		names.add(name67);
		names.add(name68);
		names.add(name69);
		names.add(name70);
		names.add(name71);
		names.add(name72);
		names.add(name73);
		names.add(name74);
		names.add(name75);
		names.add(name76);
		names.add(name77);	
		
		txtRound = new JTextField();
		txtRound.setText("Round 1");
		txtRound.setBounds(772, 363, 71, 26);
		contentPane.add(txtRound);
		txtRound.setColumns(10);
	}

	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i<buttons.size(); i++) {
			if (buttons.get(i).isSelected()) {
				allContestants.get(i*3+2).addWinScore("1");
				allContestants.get(i*3+1).addWinScore("1");
				allContestants.get(i*3).addWinScore("1");
			}
			else {
				allContestants.get(i*3+2).addWinScore("0");
				allContestants.get(i*3+1).addWinScore("0");
				allContestants.get(i*3).addWinScore("0");
			} 
		}
		for (int j=0; j<mobiePoints.size(); j++) {
			String setScore = mobiePoints.get(j).getText();
			double score = Double.parseDouble(setScore);
			allContestants.get(j).addAccumulatedPoints(score);
			String setScore2 = speakerPoints.get(j).getText();
			double speakerScore = Double.parseDouble(setScore2);
			allContestants.get(j).addSpeakerScore(speakerScore);
		}

		Indiv temp;
		for (int c = 0; c < allContestants.size(); c++) {
			for (int d = c; d > 0; d--) {
				if(allContestants.get(d).getAccumulatedPoints() > allContestants.get(d-1).getAccumulatedPoints()) {
					temp = allContestants.get(d);
					allContestants.set(d, allContestants.get(d-1));
					allContestants.set(d-1, temp);
				}
			}
		}

		int beginIndex = 0;
		
		for (int a = 0; a < allContestants.size() - 1; a++) {
			if (allContestants.get(a).getAccumulatedPoints() != allContestants.get(a+1).getAccumulatedPoints()) {
				for (int f = beginIndex; f < a + 1; f++) {
					for (int g = f; g > beginIndex; g--) {
						if(allContestants.get(g).getAvgSpeakerScore() > allContestants.get(g-1).getAvgSpeakerScore()) {
							temp = allContestants.get(g);
							allContestants.set(g, allContestants.get(g-1));
							allContestants.set(g-1, temp);
						}
					}
				}
				beginIndex = a+1;
			}
		}
		
		for (int c = allContestants.size() - 1; c > 0; c--) {
			if (allContestants.get(c).getAccumulatedPoints() != allContestants.get(c-1).getAccumulatedPoints()) {
				for (int f = c; f < allContestants.size(); f++) {
					for (int g = f; g > c; g--) {
						if(allContestants.get(g).getAvgSpeakerScore() > allContestants.get(g-1).getAvgSpeakerScore()) {
							temp = allContestants.get(g);
							allContestants.set(g, allContestants.get(g-1));
							allContestants.set(g-1, temp);
						}
					}
				}
				break;
			}
		}
		
		for (int k = 0; k<allContestants.size(); k++) {
			if (!txtRound.getText().equals("Round 4")) {
				allContestants.get(k).addRoomPoints(k);
			}
		}
		
		for (int b = 0; b < allContestants.size(); b++) {
			names.get(b).setText("" + allContestants.get(b));
			if (b%3==0 && b!=0) {
				System.out.println("");
				System.out.println("");
				System.out.println("Team" + b/3);
			}
			System.out.print("" + allContestants.get(b).getName() + ", ");
			mobiePoints.get(b).setText("" + allContestants.get(b).getAccumulatedPoints());
			speakerPoints.get(b).setText("" + allContestants.get(b).getAvgSpeakerScore());
		}
		
		round++;
		txtRound.setText("Round " + round);

	}
}
