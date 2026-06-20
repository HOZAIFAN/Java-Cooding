import java.awt.event.ActionListener;
import java.awt.*;
        import javax.swing.*;
        import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class RentalGUI implements ActionListener {

    JLabel lblName, lblVehicle, lblDays;

    JTextField txtName, txtVehicle, txtDays;
    JButton btnCreatRental, btnViewReceipt;
    Rental currentRental;



    ArrayList<Rental>  rentalList  =new ArrayList<>();
    public RentalGUI() {

        JFrame frame = new JFrame("Vehicle Rental System");
        frame.setLayout(new GridLayout(5, 2));
        lblName = new JLabel("EnterCustomerName:");
        txtName = new JTextField();
        lblVehicle = new JLabel("Enter Vehicleid:");
        txtVehicle = new JTextField();
        lblDays = new JLabel("Enter no of days:");
        txtDays = new JTextField();
        btnCreatRental = new JButton("Create Rental");
        btnViewReceipt = new JButton("View Receipt");
        btnCreatRental.addActionListener(this);
        btnViewReceipt.addActionListener(this);
        frame.add(lblName);
        frame.add(txtName);
        frame.add(lblVehicle);
        frame.add(txtVehicle);
        frame.add(lblDays);
        frame.add(txtDays);
        frame.add(btnCreatRental);
        frame.add(btnViewReceipt);
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnCreatRental) {
            String name = txtName.getText();
            String vid = txtVehicle.getText();
            int days = Integer.parseInt(txtDays.getText());


            Customer c = new Customer("C01", name, name+"@gmail.com", "123", "L001", "None");
            Vehicle v = new Bike(vid, "Honda", "CG125", 2023, 1200, true, true);
            currentRental = new Rental("R01", v, c, "2025-01-01", "2025-01-0" + days, 0);

            double cost = currentRental.calculateCost(days);
            txtDays.setText(" ");
            txtVehicle.setText(" ");
            txtName.setText(" ");
            rentalList.add(currentRental);

            JOptionPane.showMessageDialog(null,
                    "Rental Created!\nCustomer: " + name +
                            "\nVehicle: " + vid +
                            "\nDays: " + days +
                            "\nTotal Cost: " + cost
            );
        } else if (e.getSource() == btnViewReceipt) {

            if (currentRental == null) {
                JOptionPane.showMessageDialog(null, "No rental created yet");
            } else {
                currentRental.generateReceipt(); // prints in console
                JOptionPane.showMessageDialog(null, "Receipt printed in console.");
            }
        }
    }

    public static void main(String[] args) {
        new RentalGUI();
    }
}
