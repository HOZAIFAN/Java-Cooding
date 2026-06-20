import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class RentalGUI implements ActionListener {

    JTextField txtName, txtID, txtEmail, txtPassword, txtLicense;
    JButton btnCreate, btnView;
    JTextArea createOutputArea, viewOutputArea;
    ArrayList<Rental> rentalList = new ArrayList<>();
    ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public RentalGUI() {
        JFrame frame = new JFrame("Rental System");
        frame.setLayout(null);
        JLabel lblName = new JLabel("Customer Name:");
        lblName.setBounds(20, 20, 120, 25);
        frame.add(lblName);
        txtName = new JTextField();
        txtName.setBounds(150, 20, 150, 25);
        frame.add(txtName);
        JLabel lblID = new JLabel("Customer ID:");
        lblID.setBounds(20, 50, 120, 25);
        frame.add(lblID);
        txtID = new JTextField();
        txtID.setBounds(150, 50, 150, 25);
        frame.add(txtID);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 80, 120, 25);
        frame.add(lblEmail);
        txtEmail = new JTextField();
        txtEmail.setBounds(150, 80, 150, 25);
        frame.add(txtEmail);
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(20, 110, 120, 25);
        frame.add(lblPassword);
        txtPassword = new JTextField();
        txtPassword.setBounds(150, 110, 150, 25);
        frame.add(txtPassword);
        JLabel lblLicense = new JLabel("License No:");
        lblLicense.setBounds(20, 140, 120, 25);
        frame.add(lblLicense);
        txtLicense = new JTextField();
        txtLicense.setBounds(150, 140, 150, 25);
        frame.add(txtLicense);


        btnCreate = new JButton("Create Rental");
        btnCreate.setBounds(20, 180, 150, 30);
        btnCreate.addActionListener(this); frame.add(btnCreate);
        btnView = new JButton("View Rentals");
        btnView.setBounds(200, 180, 150, 30);
        btnView.addActionListener(this); frame.add(btnView);

        createOutputArea = new JTextArea();
        createOutputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        createOutputArea.setEditable(false);
        JScrollPane scrollCreate = new JScrollPane(createOutputArea);scrollCreate.setBounds(20, 220, 400, 100);
        frame.add(scrollCreate);

        viewOutputArea = new JTextArea();
        viewOutputArea.setFont
                (new Font("Monospaced", Font.PLAIN, 14));
        viewOutputArea.setEditable(false);
        JScrollPane scrollView =
                new JScrollPane(viewOutputArea);
        scrollView.setBounds(20, 330, 400, 200);
        frame.add(scrollView);

        frame.setSize(460, 580);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);frame.setVisible(true);


        vehicleList.add(new Bike("B01", "Yamaha YBR", "G version", 2023, 1200, true, true));
        vehicleList.add(new Car("C01", "Civic", "Sedan", 2023, 3000, true, 4));
        vehicleList.add(new Truck("T01", "Isuzu", "Cargo", 2022, 5000, true, 2000));
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCreate) {
            String name = txtName.getText();
            String id = txtID.getText();
            String email = txtEmail.getText();
            String password = txtPassword.getText();
            String license = txtLicense.getText();
            if(name.isEmpty() || id.isEmpty() || email.isEmpty() || password.isEmpty() || license.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill all customer fields!");
                return;
            }

            Customer c = new Customer(id, name, email, password, license, "None");


            Vehicle vehicle = null;
            for(Vehicle v : vehicleList){
                if(v.isAvailable()){
                    vehicle = v;
                    v.setAvailable(false);
                    break;
                }
            }

            if(vehicle == null){
                JOptionPane.showMessageDialog(null, "No vehicle isnow available!");
                return;
            }
            Rental r = new Rental("R"+(rentalList.size()+1), vehicle, c, "2025-01-01", "2025-01-03", vehicle.getPrice_per_day()*3);
            rentalList.add(r);

            createOutputArea.append("Rental Created!\nCustomer: "+c.getName()+"\nVehicle: "+vehicle.getBrand()+" "+vehicle.getModel()+"\nRental ID: "+r.getRental_id());

            txtName.setText(""); txtID.setText(""); txtEmail.setText(""); txtPassword.setText(""); txtLicense.setText("");
        }

        if(e.getSource() == btnView){
            viewOutputArea.setText("");
            if(rentalList.isEmpty()){ viewOutputArea.append("No rentals available now\n"); return;}
            for(Rental r : rentalList){
                viewOutputArea.append("Rental ID: "+r.getRental_id()+"\n");
                viewOutputArea.append("Customer: "+r.getCustomer().getName()+"\n");
                viewOutputArea.append("Vehicle: "+r.getVehicle().getBrand()+" "+r.getVehicle().getModel()+"\n");
                viewOutputArea.append("Cost: "+r.getTotal_cost()+"\n");
                viewOutputArea.append("\n");
            }
        }
    }

    public static void main(String[] args){
        new RentalGUI();
    }
}
