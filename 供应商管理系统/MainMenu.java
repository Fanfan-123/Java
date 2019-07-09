package danfeng.ui;

import java.awt.EventQueue;

import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

import danfeng.dao.DeptDaoImp;
import danfeng.domain.Department;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JList;

public class MainMenu {
	private JPanel panel;
	private JFrame frame;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	
	private RadioButtonListener radioListener;
	private RadioButtonListener1 radioListener1;
	String[] str=new String[2];
	private JTextField textField_23;
	private JTextField textField_24;
	
	Department dept1=new Department();
	DeptDaoImp ddi1=new  DeptDaoImp();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_25;
	private JTextField textField_26;
	String []colNames;
	Object[][] datas;
	DefaultTableModel model;
	JScrollPane jsp;
	private JTextField textField_28;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//初始panel界面
	private void initPanel(){
		panel.removeAll();
		
		JLabel label = new JLabel("欢迎进入供应商管理系统！！！");
		label.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 40));
		label.setBounds(30, 224, 700, 100);
		panel.add(label);
		
		frame.getContentPane().repaint();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		radioListener=new RadioButtonListener();
		radioListener1=new RadioButtonListener1();

		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("\u5458\u5DE5\u7BA1\u7406");
		frame.setJMenuBar(menuBar);









		JMenu DepartmentManagement = new JMenu("供应商管理部门系统操作处");
		menuBar.add(DepartmentManagement);

		JSeparator separator_5 = new JSeparator();
		DepartmentManagement.add(separator_5);

		JMenuItem D_add = new JMenuItem("增加供应信息");
		D_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				
				JLabel label = new JLabel("添加供应信息");
				label.setFont(new Font("宋体", Font.BOLD, 20));
				label.setBounds(392, 45, 134, 35);
				panel.add(label);
				
				JLabel label_1 = new JLabel("供应商品名称");
				label_1.setFont(new Font("宋体", Font.PLAIN, 15));
				label_1.setBounds(289, 213, 93, 29);
				panel.add(label_1);
				
				textField_3 = new JTextField();
				textField_3.setBounds(413, 217, 100, 21);
				panel.add(textField_3);
				textField_3.setColumns(10);
				
				JButton btnNewButton_4 = new JButton("添加成功");
				btnNewButton_4.setBounds(353, 370, 93, 23);
				btnNewButton_4.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println(textField_3.getText()+">>"+textField_23.getText());
						
						DeptDaoImp ddi=new DeptDaoImp();
						Department dept =new Department(ddi.genId(),textField_3.getText(),textField_23.getText());
						ddi.add(dept);
						
						initPanel();
					}
					
				});
				
				panel.add(btnNewButton_4);
				
				JButton btnNewButton_5 = new JButton("取消");
				btnNewButton_5.setBounds(456, 370, 93, 23);
				btnNewButton_5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						initPanel();
					}
				});
				
				panel.add(btnNewButton_5);
				
				JLabel label_2 = new JLabel("订单编号");
				label_2.setFont(new Font("宋体", Font.PLAIN, 15));
				label_2.setBounds(289, 274, 93, 29);
				panel.add(label_2);
				
				textField_23 = new JTextField();
				textField_23.setColumns(10);
				textField_23.setBounds(413, 278, 100, 21);
				panel.add(textField_23);
				
				
				frame.getContentPane().repaint();
			}
		});
		DepartmentManagement.add(D_add);

		JSeparator separator_6 = new JSeparator();
		DepartmentManagement.add(separator_6);

		JMenuItem D_delete = new JMenuItem("删除供应信息");
		D_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=JOptionPane.showInputDialog(null,"请输入删除供应商编号","删除",JOptionPane.PLAIN_MESSAGE);
				DeptDaoImp ddi=new DeptDaoImp();
				ddi.delete(Integer.parseInt(str));
				
				initPanel();
			}
		});
		DepartmentManagement.add(D_delete);

		JSeparator separator_7 = new JSeparator();
		DepartmentManagement.add(separator_7);
		JMenuItem D_modify = new JMenuItem("修改供应信息");
		D_modify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=JOptionPane.showInputDialog(null,"请输入修改供应商编号","查询",JOptionPane.PLAIN_MESSAGE);
				dept1.setD_id(Integer.parseInt(str));
				Department dept=ddi1.queryDept(dept1);
				
				panel.removeAll();
				
				JLabel label = new JLabel("\u4FEE\u6539\u90E8\u95E8\u4FE1\u606F");
				label.setFont(new Font("宋体", Font.BOLD, 20));
				label.setBounds(392, 45, 134, 35);
				panel.add(label);
				
				JLabel label_1 = new JLabel("供应商品名称");
				label_1.setFont(new Font("宋体", Font.PLAIN, 15));
				label_1.setBounds(289, 213, 100, 29);
				panel.add(label_1);
				
				textField_3 = new JTextField(dept.getD_name());
				textField_3.setBounds(413, 217, 100, 21);
				panel.add(textField_3);
				textField_3.setColumns(10);
				
				JButton btnNewButton_4 = new JButton("确认修改");
				btnNewButton_4.setBounds(353, 370, 93, 23);
				btnNewButton_4.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						ddi1.delete(dept1.getD_id());
						
						System.out.println(textField_24.getText()+">>"+textField_3.getText()+">>"+textField_23.getText()+">>");
						Department ndept=new Department(Integer.parseInt(textField_24.getText()),textField_3.getText(),textField_23.getText());
						ddi1.modify(ndept);
						
						initPanel();
					}
					
				});
				panel.add(btnNewButton_4);
				
				JButton btnNewButton_5 = new JButton("取消");

				btnNewButton_5.setBounds(456, 370, 93, 23);
				btnNewButton_5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						initPanel();
					}
				});
				
				panel.add(btnNewButton_5);
				
				JLabel label_2 = new JLabel("订单编号");
				label_2.setFont(new Font("宋体", Font.PLAIN, 15));
				label_2.setBounds(289, 274, 93, 29);
				panel.add(label_2);
				
				textField_23 = new JTextField(dept.getD_admin());
				textField_23.setColumns(10);
				textField_23.setBounds(413, 278, 100, 21);
				panel.add(textField_23);
				
				JLabel label_3 = new JLabel("供应商编号");
				label_3.setFont(new Font("宋体", Font.PLAIN, 15));
				label_3.setBounds(289, 148, 93, 29);
				panel.add(label_3);
				
				textField_24 = new JTextField(String.valueOf(dept.getD_id()));
				textField_24.setColumns(10);
				textField_24.setBounds(413, 152, 100, 21);
				panel.add(textField_24);
				
				
				frame.getContentPane().repaint();
			}
		});
		DepartmentManagement.add(D_modify);
		
		JMenuItem Dept_display = new JMenuItem("查看供应信息");
		Dept_display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				
				JLabel label = new JLabel("供应信息表");
				label.setFont(new Font("宋体", Font.BOLD, 20));
				label.setBounds(439, 50, 121, 40);
				panel.add(label);
				
				List<Department> list=ddi1.queryDepts(dept1);
				colNames=new String[]{"供应商编号","供应商品名称","订单编号"};
				datas=new Object[list.size()][3];
				
					for(int i=0;i<list.size();i++){
						datas[i][0]=String.valueOf(list.get(i).getD_id());
						datas[i][1]=list.get(i).getD_name();
						datas[i][2]=list.get(i).getD_admin();
					}
				
				model=new DefaultTableModel(datas,colNames);
				JTable table=new JTable(model);
				table.setFont(new Font("宋体", Font.PLAIN, 15));
				jsp=new JScrollPane(table);
				jsp.setBounds(330, 123, 338, 164);
				
				panel.add(jsp);
				
				JButton btnNewButton_2 = new JButton("确认");
				btnNewButton_2.setBounds(446, 403, 93, 23);
				btnNewButton_2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						initPanel();
					}
				});
				panel.add(btnNewButton_2);
				
				
				frame.getContentPane().repaint();
			}
		});
		
		JSeparator separator = new JSeparator();
		DepartmentManagement.add(separator);
		DepartmentManagement.add(Dept_display);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 984, 541);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		initPanel();

	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	//单选按钮监听
	public class RadioButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton jrb = (JRadioButton) e.getSource();
			if (jrb.isSelected()) {
				str[0] = jrb.getText();
			}

		}

	}

	public class RadioButtonListener1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton jrb = (JRadioButton) e.getSource();
			if (jrb.isSelected()) {
				str[1] = jrb.getText();
			}

		}

	}
}
