package gui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lbl_LU;
	private JLabel lbl_Nombre;
	private JLabel lbl_Email;
	private JLabel lbl_GithubURL;
	private JTextField tF_GithubURL;
	private JTextField tF_Email;
	private JTextField tF_Nombre;
	private JTextField tF_Apellido;
	private JTextField tF_LU;

	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		ImageIcon icon = new ImageIcon(SimplePresentationScreen.class.getResource("/images/tdp.png"));
		setIconImage(icon.getImage());
		
		lbl_LU = new JLabel("LU");
		lbl_LU.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_LU.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lbl_Apellido = new JLabel("Apellido");
		lbl_Apellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_Apellido.setHorizontalAlignment(SwingConstants.LEFT);
		
		lbl_Nombre = new JLabel("Nombre");
		lbl_Nombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_Nombre.setHorizontalAlignment(SwingConstants.LEFT);
		
		lbl_Email = new JLabel("Email");
		lbl_Email.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_Email.setHorizontalAlignment(SwingConstants.LEFT);
		
		lbl_GithubURL = new JLabel("Github URL");
		lbl_GithubURL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_GithubURL.setHorizontalAlignment(SwingConstants.LEFT);
		
		tF_GithubURL = new JTextField();
		tF_GithubURL.setEditable(false);
		tF_GithubURL.setColumns(10);
		
		tF_Email = new JTextField();
		tF_Email.setEditable(false);
		tF_Email.setColumns(10);
		
		tF_Nombre = new JTextField();
		tF_Nombre.setEditable(false);
		tF_Nombre.setColumns(10);
		
		tF_Apellido = new JTextField();
		tF_Apellido.setEditable(false);
		tF_Apellido.setColumns(10);
		
		tF_LU = new JTextField();
		tF_LU.setEditable(false);
		tF_LU.setColumns(10);
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_GithubURL, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_Email, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lbl_Apellido, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lbl_Nombre, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addComponent(lbl_LU, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(tF_LU, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
						.addComponent(tF_GithubURL, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
						.addComponent(tF_Apellido, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
						.addComponent(tF_Nombre, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
						.addComponent(tF_Email, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_tabInformation.createSequentialGroup()
					.addContainerGap(15, Short.MAX_VALUE)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_LU)
						.addComponent(tF_LU, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_Apellido)
						.addComponent(tF_Apellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_Nombre)
						.addComponent(tF_Nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_Email)
						.addComponent(tF_Email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(tF_GithubURL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_GithubURL))
					.addContainerGap())
		);
		tabInformation.setLayout(gl_tabInformation);
		
		JLabel lbl_Photo = new JLabel("photo");
		lbl_Photo.setBackground(Color.GRAY);
		lbl_Photo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl_CreationTime = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lbl_Photo, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbl_CreationTime, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(lbl_Photo, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 185, Short.MAX_VALUE))
					.addGap(4)
					.addComponent(lbl_CreationTime)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
	//Setteo de informaciión del alumno
		
		//Mostrar LU
		tF_LU.setText(Integer.toString(studentData.getId()));
		
		//Mostrar Apellido
		tF_Apellido.setText(studentData.getLastName());
		
		//Mostrar Nombre
		tF_Nombre.setText(studentData.getFirstName());
		
		//Mostrar Email
		tF_Email.setText(studentData.getMail());
		
		//Mostrar Github
		tF_GithubURL.setText(studentData.getGithubURL());
		
		//Mostrar Foto
		lbl_Photo.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
		
	//Fin del Setteo
		
		
		
	//Setteo de fecha
		
		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		
		//get current date time with Date()
		Date date = new Date();
		String fecha = dateFormat.format(date);
		String hora = timeFormat.format(date);
		
		lbl_CreationTime.setText("Esta ventana fue generada el " + fecha + " a las " + hora);
		 
	//Fin del Setteo
		
		setVisible(true);
	}
}
