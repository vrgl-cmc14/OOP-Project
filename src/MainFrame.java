import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel Main;
	private JTextField add_pickup;
	private JTextField add_dropoff;
	private JTextField add_name;
	private JTextField add_email;
	private JTextField add_start;
	private JTextField add_end;
	private JTextField add_number;
	private JTable table;
	private JTextField add_price;
	private JTextField update_email;
	private JTextField update_number;
	private JTextField update_pickup;
	private JTextField update_dropoff;
	private JTextField update_start;
	private JTextField update_end;
	private JTextField update_price;
	private JTable table_1;

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
		setBounds(100, 100, 670, 665);
		Main = new JPanel();
		Main.setBackground(new Color(255, 255, 255));
		Main.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Main);
		Main.setLayout(new CardLayout(0, 0));
		
		JPanel update_rent = new JPanel();
		Main.add(update_rent, "name_88760630852500");
		update_rent.setLayout(null);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Update Entry");
		lblNewLabel_1_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_1_1.setBounds(10, 31, 79, 22);
		update_rent.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("Customer Info");
		lblNewLabel_1_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1_2.setBounds(497, 59, 79, 22);
		update_rent.add(lblNewLabel_1_2_1_2);
		
		JLabel lblName_1_1 = new JLabel("Name");
		lblName_1_1.setBounds(397, 87, 47, 22);
		update_rent.add(lblName_1_1);
		
		update_email = new JTextField();
		update_email.setColumns(10);
		update_email.setBounds(452, 115, 168, 20);
		update_rent.add(update_email);
		
		update_number = new JTextField();
		update_number.setColumns(10);
		update_number.setBounds(452, 139, 168, 20);
		update_rent.add(update_number);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Select Car");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setBounds(497, 176, 79, 22);
		update_rent.add(lblNewLabel_1_3_1);
		
		JComboBox update_car = new JComboBox();
		update_car.setEditable(true);
		update_car.setBounds(452, 199, 168, 22);
		update_rent.add(update_car);
		
		JComboBox update_transimission = new JComboBox();
		update_transimission.setBounds(452, 225, 168, 22);
		update_rent.add(update_transimission);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Select Location");
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1.setBounds(497, 267, 79, 22);
		update_rent.add(lblNewLabel_1_1_2_1);
		
		update_pickup = new JTextField();
		update_pickup.setColumns(10);
		update_pickup.setBounds(452, 290, 168, 20);
		update_rent.add(update_pickup);
		
		update_dropoff = new JTextField();
		update_dropoff.setColumns(10);
		update_dropoff.setBounds(452, 314, 168, 20);
		update_rent.add(update_dropoff);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Time");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setBounds(503, 345, 67, 22);
		update_rent.add(lblNewLabel_1_1_1_1_1);
		
		update_start = new JTextField();
		update_start.setColumns(10);
		update_start.setBounds(452, 369, 168, 20);
		update_rent.add(update_start);
		
		update_end = new JTextField();
		update_end.setColumns(10);
		update_end.setBounds(452, 394, 168, 20);
		update_rent.add(update_end);
		
		update_price = new JTextField();
		update_price.setEditable(false);
		update_price.setColumns(10);
		update_price.setBackground(new Color(254, 250, 233));
		update_price.setBounds(452, 418, 168, 20);
		update_rent.add(update_price);
		
		JLabel labelPr_1 = new JLabel("Price");
		labelPr_1.setBounds(397, 418, 47, 22);
		update_rent.add(labelPr_1);
		
		JLabel lblContactNo_1_1 = new JLabel("Email");
		lblContactNo_1_1.setBounds(397, 114, 47, 22);
		update_rent.add(lblContactNo_1_1);
		
		JLabel lblName_1_1_1_1 = new JLabel("Number");
		lblName_1_1_1_1.setBounds(397, 138, 47, 22);
		update_rent.add(lblName_1_1_1_1);
		
		JLabel lblCar_1_1 = new JLabel("Car");
		lblCar_1_1.setBounds(397, 200, 47, 22);
		update_rent.add(lblCar_1_1);
		
		JLabel lblModel_1_1_1 = new JLabel("Transmission");
		lblModel_1_1_1.setBounds(397, 226, 47, 22);
		update_rent.add(lblModel_1_1_1);
		
		JLabel lblPickup_1_1 = new JLabel("Pick-up");
		lblPickup_1_1.setBounds(397, 290, 47, 22);
		update_rent.add(lblPickup_1_1);
		
		JLabel lblDropoff_1_1 = new JLabel("Drop-off");
		lblDropoff_1_1.setBounds(397, 314, 47, 22);
		update_rent.add(lblDropoff_1_1);
		
		JLabel lblEnd_1_1 = new JLabel("end");
		lblEnd_1_1.setBounds(397, 394, 47, 22);
		update_rent.add(lblEnd_1_1);
		
		JLabel lblStart_1_1 = new JLabel("Start");
		lblStart_1_1.setBounds(397, 369, 47, 22);
		update_rent.add(lblStart_1_1);
		
		JButton update_cancel = new JButton("Cancel");
		update_cancel.setBounds(452, 513, 76, 23);
		update_rent.add(update_cancel);
		
		table_1 = new JTable();
		table_1.setBounds(10, 59, 363, 535);
		update_rent.add(table_1);
		
		JComboBox update_customer = new JComboBox();
		update_customer.setEditable(true);
		update_customer.setBounds(452, 87, 168, 22);
		update_rent.add(update_customer);
		
		JButton update_buton = new JButton("Update");
		update_buton.setBounds(544, 513, 76, 23);
		update_rent.add(update_buton);
		
		JComboBox update_status = new JComboBox();
		update_status.setEditable(true);
		update_status.setBounds(452, 479, 168, 22);
		update_rent.add(update_status);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Status");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setBounds(503, 457, 67, 22);
		update_rent.add(lblNewLabel_1_1_1_1_1_1);
		
		JPanel add_rent = new JPanel();
		add_rent.setLayout(null);
		add_rent.setBorder(new EmptyBorder(5, 5, 5, 5));
		Main.add(add_rent, "name_88702305214900");
		
		JLabel lblNewLabel_2 = new JLabel("Brand");
		lblNewLabel_2.setBounds(397, 243, 47, 22);
		add_rent.add(lblNewLabel_2);
		
		JButton add_book_button = new JButton("Book");
		add_book_button.setBounds(532, 573, 82, 23);
		add_rent.add(add_book_button);
		
		JComboBox add_brand = new JComboBox();
		add_brand.setBounds(446, 242, 168, 22);
		add_rent.add(add_brand);
		
		JComboBox add_type = new JComboBox();
		add_type.setBounds(446, 275, 168, 22);
		add_rent.add(add_type);
		
		JLabel lblModel_2 = new JLabel("Model");
		lblModel_2.setBounds(397, 309, 47, 22);
		add_rent.add(lblModel_2);
		
		add_pickup = new JTextField();
		add_pickup.setColumns(10);
		add_pickup.setBounds(446, 397, 168, 20);
		add_rent.add(add_pickup);
		
		JLabel lblPickup_1 = new JLabel("Pick-up");
		lblPickup_1.setBounds(397, 397, 47, 22);
		add_rent.add(lblPickup_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Select Car");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(491, 178, 79, 22);
		add_rent.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Select Location");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setBounds(491, 374, 79, 22);
		add_rent.add(lblNewLabel_1_1_2);
		
		JLabel lblDropoff_1 = new JLabel("Drop-off");
		lblDropoff_1.setBounds(397, 421, 47, 22);
		add_rent.add(lblDropoff_1);
		
		add_dropoff = new JTextField();
		add_dropoff.setColumns(10);
		add_dropoff.setBounds(446, 421, 168, 20);
		add_rent.add(add_dropoff);
		
		JComboBox add_model = new JComboBox();
		add_model.setBounds(446, 308, 168, 22);
		add_rent.add(add_model);
		
		JLabel lblType_1 = new JLabel("Type");
		lblType_1.setBounds(397, 276, 47, 22);
		add_rent.add(lblType_1);
		
		JComboBox add_transmission = new JComboBox();
		add_transmission.setBounds(446, 341, 168, 22);
		add_rent.add(add_transmission);
		
		JLabel lblModel_1_1 = new JLabel("Transmission");
		lblModel_1_1.setBounds(397, 342, 47, 22);
		add_rent.add(lblModel_1_1);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(397, 89, 47, 22);
		add_rent.add(lblName_1);
		
		add_name = new JTextField();
		add_name.setColumns(10);
		add_name.setBounds(446, 89, 168, 20);
		add_rent.add(add_name);
		
		JComboBox add_car_select = new JComboBox();
		add_car_select.setEditable(true);
		add_car_select.setBounds(446, 211, 168, 22);
		add_rent.add(add_car_select);
		
		JLabel lblCar_1 = new JLabel("Car");
		lblCar_1.setBounds(397, 212, 47, 22);
		add_rent.add(lblCar_1);
		
		add_email = new JTextField();
		add_email.setColumns(10);
		add_email.setBounds(446, 112, 168, 20);
		add_rent.add(add_email);
		
		add_start = new JTextField();
		add_start.setColumns(10);
		add_start.setBounds(446, 476, 168, 20);
		add_rent.add(add_start);
		
		JLabel lblStart_1 = new JLabel("Start");
		lblStart_1.setBounds(397, 476, 47, 22);
		add_rent.add(lblStart_1);
		
		add_end = new JTextField();
		add_end.setColumns(10);
		add_end.setBounds(446, 501, 168, 20);
		add_rent.add(add_end);
		
		JLabel lblEnd_1 = new JLabel("end");
		lblEnd_1.setBounds(397, 501, 47, 22);
		add_rent.add(lblEnd_1);
		
		add_number = new JTextField();
		add_number.setColumns(10);
		add_number.setBounds(446, 136, 168, 20);
		add_rent.add(add_number);
		
		JLabel lblContactNo_1 = new JLabel("Email");
		lblContactNo_1.setBounds(397, 116, 47, 22);
		add_rent.add(lblContactNo_1);
		
		JLabel lblName_1_1_1 = new JLabel("Number");
		lblName_1_1_1.setBounds(397, 140, 47, 22);
		add_rent.add(lblName_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Time");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setBounds(497, 452, 67, 22);
		add_rent.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Customer Info");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setBounds(491, 61, 79, 22);
		add_rent.add(lblNewLabel_1_2_1);
		
		JButton add_cancel = new JButton("Cancel");
		add_cancel.setBounds(446, 573, 76, 23);
		add_rent.add(add_cancel);
		
		table = new JTable();
		table.setBounds(10, 61, 363, 535);
		add_rent.add(table);
		
		JLabel labelPr = new JLabel("Price");
		labelPr.setBounds(397, 516, 47, 22);
		add_rent.add(labelPr);
		
		add_price = new JTextField();
		add_price.setBackground(new Color(254, 250, 233));
		add_price.setEditable(false);
		add_price.setColumns(10);
		add_price.setBounds(446, 516, 168, 20);
		add_rent.add(add_price);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Add Entry");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_1.setBounds(10, 33, 79, 22);
		add_rent.add(lblNewLabel_1_2_1_1);

	}
}
