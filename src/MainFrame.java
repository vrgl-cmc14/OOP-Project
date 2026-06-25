import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField enter_pickup;
	private JTextField enter_dropoff;
	private JTextField txtEnterName;
	private JTextField txtEnterGmailemail;
	private JTextField enter_timeSt;
	private JTextField enter_timeEd;
	private JTextField txtEnterContactNumber;

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
		setTitle("Vehicle Rental System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 619);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Brand");
		lblNewLabel.setBounds(334, 206, 47, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(473, 526, 90, 23);
		contentPane.add(btnNewButton);
		
		JComboBox car_brand = new JComboBox();
		car_brand.setBounds(391, 206, 168, 22);
		contentPane.add(car_brand);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 28, 298, 540);
		contentPane.add(panel);
		
		JComboBox car_type = new JComboBox();
		car_type.setBounds(391, 239, 168, 22);
		contentPane.add(car_type);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(334, 272, 47, 22);
		contentPane.add(lblModel);
		
		enter_pickup = new JTextField();
		enter_pickup.setBounds(391, 372, 168, 20);
		contentPane.add(enter_pickup);
		enter_pickup.setColumns(10);
		
		JLabel lblPickup = new JLabel("Pick-up");
		lblPickup.setBounds(334, 371, 47, 22);
		contentPane.add(lblPickup);
		
		JLabel lblNewLabel_1 = new JLabel("Select Car");
		lblNewLabel_1.setBounds(439, 142, 79, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Select Location");
		lblNewLabel_1_1.setBounds(439, 349, 79, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblDropoff = new JLabel("Drop-off");
		lblDropoff.setBounds(334, 403, 47, 22);
		contentPane.add(lblDropoff);
		
		enter_dropoff = new JTextField();
		enter_dropoff.setColumns(10);
		enter_dropoff.setBounds(391, 404, 168, 20);
		contentPane.add(enter_dropoff);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(391, 272, 168, 22);
		contentPane.add(comboBox_1_1);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(334, 239, 47, 22);
		contentPane.add(lblType);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setBounds(391, 305, 168, 22);
		contentPane.add(comboBox_1_1_1);
		
		JLabel lblModel_1 = new JLabel("Transmission");
		lblModel_1.setBounds(334, 305, 47, 22);
		contentPane.add(lblModel_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(334, 52, 47, 22);
		contentPane.add(lblName);
		
		txtEnterName = new JTextField();
		txtEnterName.setColumns(10);
		txtEnterName.setBounds(391, 53, 168, 20);
		contentPane.add(txtEnterName);
		
		JComboBox car_select = new JComboBox();
		car_select.setEditable(true);
		car_select.setBounds(391, 175, 168, 22);
		contentPane.add(car_select);
		
		JLabel lblCar = new JLabel("Car");
		lblCar.setBounds(334, 175, 47, 22);
		contentPane.add(lblCar);
		
		txtEnterGmailemail = new JTextField();
		txtEnterGmailemail.setColumns(10);
		txtEnterGmailemail.setBounds(391, 76, 168, 20);
		contentPane.add(txtEnterGmailemail);
		
		enter_timeSt = new JTextField();
		enter_timeSt.setColumns(10);
		enter_timeSt.setBounds(391, 463, 168, 20);
		contentPane.add(enter_timeSt);
		
		JLabel lblStart = new JLabel("Start");
		lblStart.setBounds(334, 462, 47, 22);
		contentPane.add(lblStart);
		
		enter_timeEd = new JTextField();
		enter_timeEd.setColumns(10);
		enter_timeEd.setBounds(391, 495, 168, 20);
		contentPane.add(enter_timeEd);
		
		JLabel lblEnd = new JLabel("end");
		lblEnd.setBounds(334, 494, 47, 22);
		contentPane.add(lblEnd);
		
		txtEnterContactNumber = new JTextField();
		txtEnterContactNumber.setColumns(10);
		txtEnterContactNumber.setBounds(391, 100, 168, 20);
		contentPane.add(txtEnterContactNumber);
		
		JLabel lblContactNo = new JLabel("Email");
		lblContactNo.setBounds(334, 79, 47, 22);
		contentPane.add(lblContactNo);
		
		JLabel lblName_1_1 = new JLabel("Number");
		lblName_1_1.setBounds(334, 103, 47, 22);
		contentPane.add(lblName_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Time");
		lblNewLabel_1_1_1.setBounds(455, 435, 67, 22);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Customer Info");
		lblNewLabel_1_2.setBounds(429, 25, 79, 22);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(373, 526, 90, 23);
		contentPane.add(btnCancel);

	}
}
