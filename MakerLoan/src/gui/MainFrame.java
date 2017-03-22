package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import administration.Course;
import administration.Department;
import hr.AcademicEmployee;
import hr.AdminEmployee;
import hr.Person;
import hr.Student;
import inventory.Item;
import inventory.Loan;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfDepName;
	private JTextField tfDepCode;
	private JTextField tfCourseName;
	private JTextField tfCourseID;
	private JComboBox cbDepartmentsCourse;
	private JTextField tfPersonName;
	private JTextField tfPersonSurname;
	private JTextField tfPersonPhone;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblPersonID;
	private JTextField tfItemName;
	private JTextField tfItemId;
	private JList lsItems;
	private JComboBox cbLoanItems;
	private JComboBox cbLoanPerson;
	private JList lsLoans;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setResizable(false);
		setTitle("MakerLoan, take 2 takk for at du sletta filene mine. ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 516, 515);
		contentPane.add(tabbedPane);
		
		JPanel tabDepartments = new JPanel();
		tabbedPane.addTab("Departments", null, tabDepartments, null);
		tabDepartments.setLayout(null);
		
		JPanel DepartmentForm = new JPanel();
		DepartmentForm.setBounds(0, 0, 155, 477);
		tabDepartments.add(DepartmentForm);
		DepartmentForm.setLayout(null);
		
		JLabel lblDepName = new JLabel("Name");
		lblDepName.setBounds(10, 25, 83, 14);
		DepartmentForm.add(lblDepName);
		
		tfDepName = new JTextField();
		tfDepName.setBounds(10, 50, 133, 20);
		DepartmentForm.add(tfDepName);
		tfDepName.setColumns(10);
		
		JLabel lblDepCode = new JLabel("Code");
		lblDepCode.setBounds(10, 81, 46, 14);
		DepartmentForm.add(lblDepCode);
		
		tfDepCode = new JTextField();
		tfDepCode.setBounds(10, 106, 133, 20);
		DepartmentForm.add(tfDepCode);
		tfDepCode.setColumns(10);
		
		JPanel DepartmentList = new JPanel();
		DepartmentList.setBounds(165, 0, 337, 477);
		tabDepartments.add(DepartmentList);
		DepartmentList.setLayout(null);
		
		JList lsDepartments = new JList();
		lsDepartments.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lsDepartments.setBounds(10, 11, 317, 455);
		DepartmentList.add(lsDepartments);
		
		JPanel tabCourses = new JPanel();
		tabbedPane.addTab("Courses", null, tabCourses, null);
		tabCourses.setLayout(null);
		
		JPanel CourseForm = new JPanel();
		CourseForm.setBounds(0, 0, 156, 477);
		tabCourses.add(CourseForm);
		CourseForm.setLayout(null);
		
		JLabel lblCourseName = new JLabel("Name");
		lblCourseName.setBounds(10, 25, 46, 14);
		CourseForm.add(lblCourseName);
		
		tfCourseName = new JTextField();
		tfCourseName.setBounds(10, 50, 133, 20);
		CourseForm.add(tfCourseName);
		tfCourseName.setColumns(10);
		
		JLabel lblCourseId = new JLabel("Course ID");
		lblCourseId.setBounds(10, 81, 86, 14);
		CourseForm.add(lblCourseId);
		
		tfCourseID = new JTextField();
		tfCourseID.setBounds(10, 106, 133, 20);
		CourseForm.add(tfCourseID);
		tfCourseID.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(10, 137, 69, 14);
		CourseForm.add(lblDepartment);
		
		cbDepartmentsCourse = new JComboBox();
		cbDepartmentsCourse.setBounds(10, 162, 133, 20);
		CourseForm.add(cbDepartmentsCourse);
		
		JPanel panel = new JPanel();
		panel.setBounds(166, 0, 335, 477);
		tabCourses.add(panel);
		panel.setLayout(null);
		
		JList courseList = new JList();
		courseList.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		courseList.setBounds(10, 11, 315, 455);
		panel.add(courseList);
		
		JButton btnCreateCourse = new JButton("Create");
		btnCreateCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Course(tfCourseName.getText(), tfCourseID.getText(), (Department)cbDepartmentsCourse.getSelectedItem());
				
				DefaultListModel<Course> cbCoursesModel = new DefaultListModel<>();
				
				for(Course c: Course.getCourses()) {
					cbCoursesModel.addElement(c);
				}
				
				courseList.setModel(cbCoursesModel);
				
			}
		});
		btnCreateCourse.setBounds(10, 196, 89, 23);
		CourseForm.add(btnCreateCourse);
		

		
		JPanel tabPerson = new JPanel();
		tabbedPane.addTab("Persons", null, tabPerson, null);
		tabPerson.setLayout(null);
		
		JPanel personForm = new JPanel();
		personForm.setBounds(0, 0, 154, 477);
		tabPerson.add(personForm);
		personForm.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 25, 133, 14);
		personForm.add(lblName);
		
		tfPersonName = new JTextField();
		tfPersonName.setBounds(10, 50, 133, 20);
		personForm.add(tfPersonName);
		tfPersonName.setColumns(10);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(10, 81, 133, 14);
		personForm.add(lblSurname);
		
		tfPersonSurname = new JTextField();
		tfPersonSurname.setBounds(10, 106, 133, 20);
		personForm.add(tfPersonSurname);
		tfPersonSurname.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(10, 137, 133, 14);
		personForm.add(lblPhone);
		
		tfPersonPhone = new JTextField();
		tfPersonPhone.setBounds(10, 162, 133, 20);
		personForm.add(tfPersonPhone);
		tfPersonPhone.setColumns(10);
		
		JLabel lblDepartment_1 = new JLabel("Department");
		lblDepartment_1.setBounds(10, 193, 133, 14);
		personForm.add(lblDepartment_1);
		
		JComboBox cbPersonDep = new JComboBox();
		cbPersonDep.setBounds(10, 218, 133, 20);
		personForm.add(cbPersonDep);
		
		JRadioButton rdbtnStudent = new JRadioButton("Student");
		rdbtnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblPersonID.setText("Student ID");
			}
		});
		buttonGroup.add(rdbtnStudent);
		rdbtnStudent.setSelected(true);
		rdbtnStudent.setBounds(10, 245, 133, 23);
		personForm.add(rdbtnStudent);
		
		JRadioButton rdbtnAcademicemployee = new JRadioButton("Academic Employee");
		rdbtnAcademicemployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPersonID.setText("Employee ID");
			}
		});
		buttonGroup.add(rdbtnAcademicemployee);
		rdbtnAcademicemployee.setBounds(10, 271, 185, 23);
		personForm.add(rdbtnAcademicemployee);
		
		JRadioButton rdbtnAdminemployee = new JRadioButton("Admin Employee");
		rdbtnAdminemployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPersonID.setText("Employee ID");
			}
		});
		buttonGroup.add(rdbtnAdminemployee);
		rdbtnAdminemployee.setBounds(10, 297, 134, 23);
		personForm.add(rdbtnAdminemployee);
		
		lblPersonID = new JLabel("Student ID");
		lblPersonID.setBounds(10, 327, 86, 14);
		personForm.add(lblPersonID);
		
		JTextField tfPersonID = new JTextField();
		tfPersonID.setBounds(10, 352, 133, 20);
		personForm.add(tfPersonID);
		tfPersonID.setColumns(10);
		

		
		JPanel personList = new JPanel();
		personList.setBounds(158, 0, 343, 477);
		tabPerson.add(personList);
		personList.setLayout(null);
		
		JList lsPersonList = new JList();
		lsPersonList.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lsPersonList.setBounds(10, 11, 323, 455);
		personList.add(lsPersonList);
		
		JButton btnCreatePerson = new JButton("Create");
		btnCreatePerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = tfPersonName.getText();
				String surName = tfPersonSurname.getText();
				String phone = tfPersonPhone.getText();
				String personID = tfPersonID.getText();
				Department department = (Department) cbPersonDep.getSelectedItem();
				
				if(rdbtnAcademicemployee.isSelected()) {
					new AcademicEmployee(name, surName, phone, department, personID);
				} else if (rdbtnAdminemployee.isSelected()) {
					new AdminEmployee(name, surName, phone, department, personID);
				} else if (rdbtnStudent.isSelected()) {
					new Student(name, surName, phone, department, personID);
				}
				
				DefaultListModel<Person> personModel = new DefaultListModel<>();
				DefaultComboBoxModel<Person> cbPersonModel = new DefaultComboBoxModel<>();
				
				for(Person p: Person.getPersons()) {
					personModel.addElement(p);
					cbPersonModel.addElement(p);
				}
				
				lsPersonList.setModel(personModel);
				cbLoanPerson.setModel(cbPersonModel);
				
			}
		});
		btnCreatePerson.setBounds(10, 383, 89, 23);
		personForm.add(btnCreatePerson);
		
		JButton btnCreateDep = new JButton("Create");
		btnCreateDep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Department(tfDepName.getText(), tfDepCode.getText());
				
				DefaultListModel<Department> model = new DefaultListModel<>();
				DefaultComboBoxModel<Department> cbModel = new DefaultComboBoxModel<>();
				
				for(Department d: Department.getDepartments()) {
					model.addElement(d);
					cbModel.addElement(d);
				}
				
				lsDepartments.setModel(model);
				cbDepartmentsCourse.setModel(cbModel);
				cbPersonDep.setModel(cbModel);
				
			}
		});
		btnCreateDep.setBounds(10, 140, 89, 23);
		DepartmentForm.add(btnCreateDep);
		
		JPanel tabItems = new JPanel();
		tabbedPane.addTab("Items", null, tabItems, null);
		tabItems.setLayout(null);
		
		JPanel ItemForm = new JPanel();
		ItemForm.setBounds(0, 0, 156, 477);
		tabItems.add(ItemForm);
		ItemForm.setLayout(null);
		
		JLabel lblItemName = new JLabel("Name");
		lblItemName.setBounds(10, 25, 46, 14);
		ItemForm.add(lblItemName);
		
		tfItemName = new JTextField();
		tfItemName.setBounds(10, 50, 133, 20);
		ItemForm.add(tfItemName);
		tfItemName.setColumns(10);
		
		JLabel lblItemId = new JLabel("ID");
		lblItemId.setBounds(10, 81, 46, 14);
		ItemForm.add(lblItemId);
		
		tfItemId = new JTextField();
		tfItemId.setBounds(10, 106, 133, 20);
		ItemForm.add(tfItemId);
		tfItemId.setColumns(10);
		
		JButton btnItemCreate = new JButton("Create");
		btnItemCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			new Item(tfItemName.getText(), Integer.parseInt(tfItemId.getText()));
				
			DefaultListModel<Item> itemModel = new DefaultListModel<>();
			DefaultComboBoxModel<Item> cbItemModel = new DefaultComboBoxModel<>();
			
			for(Item i: Item.getItems()) {
				itemModel.addElement(i);
				cbItemModel.addElement(i);
			}
			
			lsItems.setModel(itemModel);
			cbLoanItems.setModel(cbItemModel);
			
			
			}
		});
		btnItemCreate.setBounds(10, 137, 85, 19);
		ItemForm.add(btnItemCreate);
		
		JPanel itemList = new JPanel();
		itemList.setBounds(166, 0, 335, 477);
		tabItems.add(itemList);
		itemList.setLayout(null);
		
		lsItems = new JList();
		lsItems.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lsItems.setBounds(10, 11, 315, 455);
		itemList.add(lsItems);
		
		JPanel tabLoan = new JPanel();
		tabbedPane.addTab("Loans", null, tabLoan, null);
		tabLoan.setLayout(null);
		
		JPanel loanForm = new JPanel();
		loanForm.setBounds(0, 0, 157, 477);
		tabLoan.add(loanForm);
		loanForm.setLayout(null);
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setBounds(10, 25, 126, 14);
		loanForm.add(lblItem);
		
		cbLoanItems = new JComboBox();
		cbLoanItems.setBounds(10, 50, 133, 20);
		loanForm.add(cbLoanItems);
		
		JLabel lblItemPerson = new JLabel("Loaned To");
		lblItemPerson.setBounds(10, 81, 139, 14);
		loanForm.add(lblItemPerson);
		
		cbLoanPerson = new JComboBox();
		cbLoanPerson.setBounds(10, 106, 133, 20);
		loanForm.add(cbLoanPerson);
		
		JButton btnLoan = new JButton("Loan!");
		btnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Item item = (Item) cbLoanItems.getSelectedItem();
				Person person = (Person) cbLoanPerson.getSelectedItem();
				
				new Loan(item, person, new GregorianCalendar());
				
				DefaultListModel<Loan> loanModel = new DefaultListModel<>();
				
				for(Loan l: Loan.getLoans()) {
					loanModel.addElement(l);
				}
			
				lsLoans.setModel(loanModel);
				
			}
		});
		btnLoan.setBounds(10, 137, 85, 19);
		loanForm.add(btnLoan);
		
		JPanel loanList = new JPanel();
		loanList.setBounds(167, 0, 334, 477);
		tabLoan.add(loanList);
		loanList.setLayout(null);
		
		lsLoans = new JList();
		lsLoans.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lsLoans.setBounds(10, 11, 314, 295);
		loanList.add(lsLoans);
		
		JButton btnLevert = new JButton("Levert");
		btnLevert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Loan item = (Loan) lsLoans.getModel().getElementAt(lsLoans.getSelectedIndex());
				Loan.getLoans().remove(item);
				
				DefaultListModel<Loan> loanModel = new DefaultListModel<>();
				
				for(Loan l: Loan.getLoans()) {
					loanModel.addElement(l);
				}
			
				lsLoans.setModel(loanModel);
				
				//DefaultListModel loanModel = (DefaultListModel) lsLoans.getModel();
				//loanModel.remove(lsLoans.getSelectedIndex());
				
			}
		});
		btnLevert.setBounds(239, 317, 85, 19);
		loanList.add(btnLevert);
		
		JLabel lblDato = new JLabel("Dato");
		lblDato.setBounds(10, 319, 46, 14);
		loanList.add(lblDato);
		
		JLabel lblEtternavn = new JLabel("Etternavn");
		lblEtternavn.setBounds(10, 396, 61, 14);
		loanList.add(lblEtternavn);
		
		JRadioButton rdbtnStigende = new JRadioButton("Nyeste f\u00F8rst");
		buttonGroup_1.add(rdbtnStigende);
		rdbtnStigende.setBounds(10, 340, 109, 23);
		loanList.add(rdbtnStigende);
		
		JRadioButton rdbtnSynkende = new JRadioButton("Eldste f\u00F8rst");
		buttonGroup_1.add(rdbtnSynkende);
		rdbtnSynkende.setBounds(10, 366, 109, 23);
		loanList.add(rdbtnSynkende);
		
		JRadioButton rdbtnA = new JRadioButton("A-\u00C5");
		buttonGroup_1.add(rdbtnA);
		rdbtnA.setBounds(10, 417, 109, 23);
		loanList.add(rdbtnA);
		
		JButton btnSorter = new JButton("Sorter");
		btnSorter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Loan> SortList = Loan.getLoans();
				
				if(rdbtnSynkende.isSelected()) {
					Collections.sort(SortList, Loan.Comparators.AGEDESC);;					
				} else if (rdbtnStigende.isSelected()) {
					Collections.sort(SortList, Loan.Comparators.AGEASC);
				} else if (rdbtnA.isSelected()) {
					Collections.sort(SortList, Loan.Comparators.NAME);
				}
				
				DefaultListModel<Loan> loanModel = new DefaultListModel<>();
				
				for(Loan l: Loan.getLoans()) {
					loanModel.addElement(l);
				}
			
				lsLoans.setModel(loanModel);
			}
		});
		btnSorter.setBounds(10, 447, 85, 19);
		loanList.add(btnSorter);

		
	}
}
