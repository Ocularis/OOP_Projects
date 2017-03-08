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

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

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
		setTitle("MakerLoan, take 2 takk for at du sletta filene mine. ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 506, 505);
		contentPane.add(tabbedPane);
		
		JPanel tabDepartments = new JPanel();
		tabbedPane.addTab("Departments", null, tabDepartments, null);
		tabDepartments.setLayout(null);
		
		JPanel DepartmentForm = new JPanel();
		DepartmentForm.setBounds(0, 0, 249, 477);
		tabDepartments.add(DepartmentForm);
		DepartmentForm.setLayout(null);
		
		JLabel lblDepName = new JLabel("Name");
		lblDepName.setBounds(10, 25, 83, 14);
		DepartmentForm.add(lblDepName);
		
		tfDepName = new JTextField();
		tfDepName.setBounds(10, 50, 229, 20);
		DepartmentForm.add(tfDepName);
		tfDepName.setColumns(10);
		
		JLabel lblDepCode = new JLabel("Code");
		lblDepCode.setBounds(10, 81, 46, 14);
		DepartmentForm.add(lblDepCode);
		
		tfDepCode = new JTextField();
		tfDepCode.setBounds(10, 106, 229, 20);
		DepartmentForm.add(tfDepCode);
		tfDepCode.setColumns(10);
		
		JPanel DepartmentList = new JPanel();
		DepartmentList.setBounds(253, 0, 249, 477);
		tabDepartments.add(DepartmentList);
		DepartmentList.setLayout(null);
		
		JList lsDepartments = new JList();
		lsDepartments.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lsDepartments.setBounds(10, 11, 229, 455);
		DepartmentList.add(lsDepartments);
		
		JPanel tabCourses = new JPanel();
		tabbedPane.addTab("Courses", null, tabCourses, null);
		tabCourses.setLayout(null);
		
		JPanel CourseForm = new JPanel();
		CourseForm.setBounds(0, 0, 249, 477);
		tabCourses.add(CourseForm);
		CourseForm.setLayout(null);
		
		JLabel lblCourseName = new JLabel("Name");
		lblCourseName.setBounds(10, 25, 46, 14);
		CourseForm.add(lblCourseName);
		
		tfCourseName = new JTextField();
		tfCourseName.setBounds(10, 50, 229, 20);
		CourseForm.add(tfCourseName);
		tfCourseName.setColumns(10);
		
		JLabel lblCourseId = new JLabel("Course ID");
		lblCourseId.setBounds(10, 81, 86, 14);
		CourseForm.add(lblCourseId);
		
		tfCourseID = new JTextField();
		tfCourseID.setBounds(10, 106, 229, 20);
		CourseForm.add(tfCourseID);
		tfCourseID.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(10, 137, 69, 14);
		CourseForm.add(lblDepartment);
		
		cbDepartmentsCourse = new JComboBox();
		cbDepartmentsCourse.setBounds(10, 162, 229, 20);
		CourseForm.add(cbDepartmentsCourse);
		
		JPanel panel = new JPanel();
		panel.setBounds(259, 0, 242, 477);
		tabCourses.add(panel);
		panel.setLayout(null);
		
		JList courseList = new JList();
		courseList.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		courseList.setBounds(10, 11, 222, 455);
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
		personForm.setBounds(0, 0, 249, 477);
		tabPerson.add(personForm);
		personForm.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 25, 46, 14);
		personForm.add(lblName);
		
		tfPersonName = new JTextField();
		tfPersonName.setBounds(10, 50, 229, 20);
		personForm.add(tfPersonName);
		tfPersonName.setColumns(10);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(10, 81, 46, 14);
		personForm.add(lblSurname);
		
		tfPersonSurname = new JTextField();
		tfPersonSurname.setBounds(10, 106, 229, 20);
		personForm.add(tfPersonSurname);
		tfPersonSurname.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(10, 137, 46, 14);
		personForm.add(lblPhone);
		
		tfPersonPhone = new JTextField();
		tfPersonPhone.setBounds(10, 162, 229, 20);
		personForm.add(tfPersonPhone);
		tfPersonPhone.setColumns(10);
		
		JLabel lblDepartment_1 = new JLabel("Department");
		lblDepartment_1.setBounds(10, 193, 86, 14);
		personForm.add(lblDepartment_1);
		
		JComboBox cbPersonDep = new JComboBox();
		cbPersonDep.setBounds(10, 218, 229, 20);
		personForm.add(cbPersonDep);
		
		JRadioButton rdbtnStudent = new JRadioButton("Student");
		rdbtnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblPersonID.setText("Student ID");
			}
		});
		buttonGroup.add(rdbtnStudent);
		rdbtnStudent.setSelected(true);
		rdbtnStudent.setBounds(10, 245, 109, 23);
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
		tfPersonID.setBounds(10, 352, 229, 20);
		personForm.add(tfPersonID);
		tfPersonID.setColumns(10);
		

		
		JPanel personList = new JPanel();
		personList.setBounds(259, 0, 242, 477);
		tabPerson.add(personList);
		personList.setLayout(null);
		
		JList lsPersonList = new JList();
		lsPersonList.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lsPersonList.setBounds(10, 11, 222, 455);
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
				
				for(Person p: Person.getPersons()) {
					personModel.addElement(p);
				}
				
				lsPersonList.setModel(personModel);
				
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
		
		
	}
}
